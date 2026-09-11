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

def data = TestDataFactory.findTestData('Data Files/BRISURF/Asmik/CovFlag')

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
    // AMBIL DATA CSV
    // =================================================

    String nomorRekeningSimpanan =
        data.getValue('NomorRekeningSimpanan', row)

    String nomorIdentitas =
        data.getValue('NomorIdentitas', row)


    println "NomorRekeningSimpanan : ${nomorRekeningSimpanan}"
    println "NomorIdentitas        : ${nomorIdentitas}"


    // =================================================
    // SEND REQUEST COVFLAG
    // =================================================

    def response = WS.sendRequest(
        findTestObject(
            'Object Repository/API/Posts/Asmik/CovFlag/1317_tes',
            [
                'NomorRekeningSimpanan': nomorRekeningSimpanan,
                'NomorIdentitas'       : nomorIdentitas
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

    def date = new SimpleDateFormat(
        "dd.MM.yyyy_(HH.mm.ss_SSS)"
    ).format(new Date())

    String filePath =
        RunConfiguration.getProjectDir() +
        "/Reports/CovFlag_Response_Row${row}_${date}.json"

    println "File Path : ${filePath}"

    File file = new File(filePath)

    file.parentFile.mkdirs()

    file.write(
        JsonOutput.prettyPrint(body)
    )


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
    // EXPECTED FIELD - COVFLAG
    // =================================================

    def expectedFields = [
        "ResponseCode",
        "ResponseDescription",
        "ResponseException",
        "NomorPeserta"
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

        continue
    }


    // =================================================
    // VALIDATE RESPONSE CODE
    // =================================================

    if (actualResponse.get("ResponseCode") == "00") {

        KeywordUtil.markPassed(
            "Row ${row} - CovFlag API Success"
        )

    } else {

        KeywordUtil.markFailed(
            "Row ${row} - CovFlag API Failed : " +
            actualResponse.get("ResponseDescription")
        )
    }


    // =================================================
    // PRINT RESULT
    // =================================================

    println ""
    println "========================================"
    println "       COVFLAG API VALIDATION RESULT"
    println "       ROW : ${row}"
    println "========================================"
    println "Code         : ${actualResponse.get('ResponseCode')}"
    println "Description  : ${actualResponse.get('ResponseDescription')}"
    println "Exception     : ${actualResponse.get('ResponseException')}"
    println "NomorPeserta : ${actualResponse.get('NomorPeserta')}"
    println "========================================"
}