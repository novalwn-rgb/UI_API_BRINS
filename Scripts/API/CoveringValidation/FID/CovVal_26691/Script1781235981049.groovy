import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ResponseObject

TestData data = TestDataFactory.findTestData('Data Files/CoveringValidation/CoveringVal')

int totalRow = data.getRowNumbers()

println("Total Data : " + totalRow)

for (int row = 1; row <= totalRow; row++) {

	String norekSave = data.getValue('NomorRekeningSimpanan', row)

	ResponseObject response = WS.sendRequest(
		findTestObject(
			'API/Posts/CoveringValidation/CovVal_26691',
			[
				('NomorRekeningSimpanan') : norekSave
			]
		)
	)

	println("==============================")
	println("Row                : " + row)
	println("Nomor Rekening Simpanan   : " + norekSave)
	println("HTTP Status        : " + response.getStatusCode())
	println("Response Body      : " + response.getResponseBodyContent())
}