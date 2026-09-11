import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testdata.TestDataFactory
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import java.text.SimpleDateFormat
import com.kms.katalon.core.configuration.RunConfiguration

// =====================================================
// LOAD DATA FILE CSV
// =====================================================

def data = TestDataFactory.findTestData('Data Files/BRISURF/Asmik/CovVal')

int totalData = data.getRowNumbers()

println "========================================"
println "TOTAL DATA CSV : ${totalData}"
println "========================================"


// =====================================================
// LOOP DATA CSV
// =====================================================

for (int row = 1; row <= totalData; row++) {

    println ""
    println "========================================"
    println "PROCESSING ROW : ${row}"
    println "========================================"


    // =================================================
    // AMBIL DATA DARI CSV
    // =================================================

    String nomorIdentitas = data.getValue('NomorIdentitas',row)

    String nomorRekeningSimpanan = data.getValue('NomorRekeningSimpanan',row)

    String cifRekeningSimpanan = data.getValue('CIFRekeningSimpanan',row)


    println "NomorIdentitas          : ${nomorIdentitas}"
    println "NomorRekeningSimpanan   : ${nomorRekeningSimpanan}"
    println "CIFRekeningSimpanan     : ${cifRekeningSimpanan}"


    // =================================================
    // SEND REQUEST API
    // =================================================

    def response = WS.sendRequest(findTestObject('Object Repository/API/Posts/Asmik/CovVal/1317_tes',
            [
                'NomorIdentitas'        : nomorIdentitas,
                'NomorRekeningSimpanan' : nomorRekeningSimpanan,
                'CIFRekeningSimpanan'   : cifRekeningSimpanan
            ]
        )
    )

    // =================================================
    // RESPONSE
    // =================================================

    String body = response.getResponseText()

    println "HTTP STATUS : ${response.getStatusCode()}"
    println "RESPONSE    : ${body}"

    // =================================================
    // SAVE RESPONSE
    // =================================================

    def date = new SimpleDateFormat("dd.MM.yyyy_(HH.mm.ss_SSS)").format(new Date())

    String filePath =
        RunConfiguration.getProjectDir() + "/Reports/Response_Row${row}_${date}.json"

    println "Project Dir : " + RunConfiguration.getProjectDir()

    println "File Path : ${filePath}"

    File file = new File(filePath)

    file.parentFile.mkdirs()

    file.write(JsonOutput.prettyPrint(body))

    // =================================================
    // PARSE JSON
    // =================================================

    Map actualResponse

    try {

        actualResponse =
            (Map) new JsonSlurper().parseText(body)

    } catch (Exception e) {

        KeywordUtil.markFailed(
            "Row ${row} - Response bukan JSON valid : ${e.message}"
        )

        continue
    }


    // =================================================
    // EXPECTED FIELD
    // =================================================

    def expectedFields = [
        "ResponseCode",
        "ResponseDescription",
        "JenisPengajuan",
        "NominalPremi",
        "RemarkPremi"
    ]


    def missing = []


    expectedFields.each { field ->

        if (!actualResponse.containsKey(field)) {

            missing.add(field)
        }
    }


    // =================================================
    // VALIDATE MISSING FIELD
    // =================================================

    if (missing.size() > 0) {

        KeywordUtil.markFailed(
            "Row ${row} - Field tidak ditemukan : ${missing}"
        )
    }


    // =================================================
    // VALIDATE RESPONSE CODE
    // =================================================

    if (actualResponse.get("ResponseCode") == "00") {

        KeywordUtil.markPassed(
            "Row ${row} - API Success"
        )

    } else {

        KeywordUtil.markFailed(
            "Row ${row} - API Failed : " +
            actualResponse.get("ResponseDescription")
        )
    }


    // =================================================
    // PRINT RESULT
    // =================================================

    println ""
    println "========================================"
    println "         API VALIDATION RESULT"
    println "         ROW : ${row}"
    println "========================================"
    println "Code        : ${actualResponse.get('ResponseCode')}"
    println "Description : ${actualResponse.get('ResponseDescription')}"
    println "Premi       : ${actualResponse.get('NominalPremi')}"
    println "Remark      : ${actualResponse.get('RemarkPremi')}"
    println "========================================"
}
