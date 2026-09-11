import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ResponseObject

TestData data = TestDataFactory.findTestData('Data Files/CoveringFlag/CoveringFlag')

int totalRow = data.getRowNumbers()

println("Total Data : " + totalRow)

for (int row = 1; row <= totalRow; row++) {

	String norekSave = data.getValue('NomorRekeningSimpanan', row)

	//String requestId = System.currentTimeMillis().toString() + row

	ResponseObject response = WS.sendRequest(
		findTestObject(
			'API/Posts/CoveringFlag/CovFlag_26691',
			[
				('NomorRekeningSimpanan') : norekSave
			]
		)
	)

	println("==============================")
	println("Row                : " + row)
	println("Nomor Rekening Simpanan     : " + norekSave)
	println("HTTP Status        : " + response.getStatusCode())
	println("Response Body      : " + response.getResponseBodyContent())
}