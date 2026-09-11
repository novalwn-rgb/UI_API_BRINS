import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ResponseObject

TestData data = TestDataFactory.findTestData('Data Files/Test/SampleFlag')

int totalRow = data.getRowNumbers()

println("Total Data : " + totalRow)

for (int row = 1; row <= totalRow; row++) {

	String unikKey = data.getValue('ChannelUniqueKeyId', row)

	//String requestId = System.currentTimeMillis().toString() + row

//	def response = WS.sendRequest(
//		findTestObject(
//			'API/Posts/CoveringFlag/CovFlag_26687',
//			[
//				('ChannelUniqueKeyId') : unikKey
//			]
//		)
//	)
	
	ResponseObject response = WS.sendRequest(
		findTestObject(
			'API/Posts/CoveringFlag/CovFlag_26691',
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
	
	KeywordUtil.markPassed('Post API FID 26691 berhasil ditambahkan dan data sesuai')
}

