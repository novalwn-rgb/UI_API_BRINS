import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import java.text.SimpleDateFormat
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory

// Load data CSV
//=====================================
TestData data = TestDataFactory.findTestData('Data Files/Cabang/CoveringValidation/CoveringVal')

int totalRow = data.getRowNumbers()

println("Total Data : " + totalRow)

for (int row = 1; row <= totalRow; row++) {

	String unikKey = data.getValue('ChannelUniqueKeyId', row)

	ResponseObject response = WS.sendRequest(
		findTestObject(
			'API/Posts/CoveringValidation/Cabang/CovVal_Bandung',
			[
				('ChannelUniqueKeyId') : unikKey
			]
		)
	)
//=====================================

}

def date = new SimpleDateFormat("dd.MM.yyyy_(HH.mm.ss)").format(new Date())

def response = WS.sendRequest(findTestObject('Object Repository/API/Posts/Asmik/CovVal/1317_tes'))

String body = response.getResponseText()

//Save file respon
//=====================================

println("Project Dir : " + RunConfiguration.getProjectDir())

String filePath = RunConfiguration.getProjectDir() + "/Reports/Response_" + date + ".json"

println("File Path : " + filePath)

File file = new File(filePath)

file.write(JsonOutput.prettyPrint(body))
//end respon

Map actualResponse = (Map)new JsonSlurper().parseText(body)

def expectedFields = [

	"ResponseCode",
	"ResponseDescription",
	"JenisPengajuan",
	"NominalPremi",
	"RemarkPremi"

]

def missing = []

expectedFields.each { field ->

	if(!actualResponse.containsKey(field)){
		missing.add(field)
	}
}

if(missing.size() > 0){

	KeywordUtil.markFailed("Field tidak ditemukan : " + missing)
}

if(actualResponse.get("ResponseCode") == "00"){

	KeywordUtil.markPassed("API Success")

}else{

	KeywordUtil.markFailed("API Failed : " + actualResponse.get("ResponseDescription"))
}

println ""
println "========================================"
println "         API VALIDATION RESULT"
println "========================================"
println "Code        : ${actualResponse.get('ResponseCode')}"
println "Description : ${actualResponse.get('ResponseDescription')}"
println "Premi      : ${actualResponse.get('NominalPremi')}"
println "Remark  : ${actualResponse.get('RemarkPremi')}"
println "========================================"