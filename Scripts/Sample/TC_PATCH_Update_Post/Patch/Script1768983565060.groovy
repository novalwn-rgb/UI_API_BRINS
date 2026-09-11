import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ResponseObject


ResponseObject response = WS.sendRequest(
    findTestObject('null')
)

KeywordUtil.logInfo('Status Code: ' + response.getStatusCode())
KeywordUtil.logInfo('Response Body: ' + response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'title', 'Updated by Katalon Automation')
WS.verifyElementPropertyValue(response, 'id', 1)

KeywordUtil.markPassed('PATCH API berhasil dan data sesuai')
