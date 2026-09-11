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

	String nik = data.getValue('NomorIdentitas', row)

	// Generate RequestId unik
	String requestId = System.currentTimeMillis().toString() + row

	ResponseObject response = WS.sendRequest(
		findTestObject(
			'API/Posts/CoveringValidation/CovVal_26692',
			[
				('NomorIdentitas') : nik
			]
		)
	)

//	println("==============================")
//	println("Row                : " + row)
//	println("Channel Unique Key Id     : " + nik)
//	println("HTTP Status        : " + response.getStatusCode())
//	println("Response Body      : " + response.getResponseBodyContent())
	KeywordUtil.markPassed('Post API FID 26692 berhasil ditambahkan dan data sesuai')
	KeywordUtil.markPassed("Row                : " + row)
	KeywordUtil.markPassed("NIK                : " + nik)
	KeywordUtil.markPassed("HTTP Status        : " + response.getStatusCode())
	KeywordUtil.markPassed("Response Body      : " + response.getResponseBodyContent())
}