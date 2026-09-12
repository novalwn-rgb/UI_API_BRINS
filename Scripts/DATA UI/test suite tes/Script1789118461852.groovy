import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Test Case 1
WebUI.callTestCase(findTestCase('Test Cases/01 Login')
)

// Test Case 2
WebUI.callTestCase(findTestCase('Test Cases/02 Upload Dokumen'), [:],FailureHandling.STOP_ON_FAILURE)

// Test Case 3
WebUI.callTestCase(indTestCase('Test Cases/03 Proses'),[:],FailureHandling.STOP_ON_FAILURE)