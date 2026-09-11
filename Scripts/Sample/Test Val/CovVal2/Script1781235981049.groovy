import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

TestData data = TestDataFactory.findTestData('Data Files/Test/SampleVal')

int totalRow = data.getRowNumbers()

println("Total Data : " + totalRow)

for (int row = 1; row <= totalRow; row++) {

	String unikKey = data.getValue('ChannelUniqueKeyId', row)

	// Generate RequestId unik
	String requestId = System.currentTimeMillis().toString() + row

	def response = WS.sendRequest(
		findTestObject(
			'API/Posts/CoveringValidation/CovVal_26688',
			[
				('ChannelUniqueKeyId') : unikKey
			]
		)
	)

	println("==============================")
	println("Row                : " + row)
	println("Channel Unique Key Id     : " + unikKey)
	println("HTTP Status        : " + response.getStatusCode())
	println("Response Body      : " + response.getResponseBodyContent())
}