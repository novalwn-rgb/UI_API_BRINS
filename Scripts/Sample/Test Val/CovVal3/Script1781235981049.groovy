import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ResponseObject

TestData data = TestDataFactory.findTestData('Data Files/Test/SampleVal')

int totalRow = data.getRowNumbers()

println("Total Data : " + totalRow)

for (int row = 1; row <= totalRow; row++) {

	String nmr = data.getValue('NomorRekeningSimpanan', row)
	
	String cif = data.getValue('CIFRekeningSimpanan', row)

	// Generate RequestId unik
	//String requestId = System.currentTimeMillis().toString() + row

	ResponseObject response = WS.sendRequest(
		findTestObject(
			'API/Posts/CoveringValidation/CovVal_26689',
			[
				('NomorRekeningSimpanan') : nmr,
				('CIFRekeningSimpanan') : cif
			]
		)
	)

//	println("==============================")
//	println("Row                : " + row)
//	println("Channel Unique Key Id     : " + nmr)
//	println("HTTP Status        : " + response.getStatusCode())
//	println("Response Body      : " + response.getResponseBodyContent())
}