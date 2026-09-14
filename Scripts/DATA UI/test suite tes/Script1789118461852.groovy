import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Test Case 1
WebUI.callTestCase(findTestCase('Test Cases/DATA UI/Login/Login_BrinsBook'), [:])

// Test Case 2
WebUI.callTestCase(findTestCase('Test Cases/DATA UI/Filter FBI_Detail/Filter FBI_Detail'), [:])

// Test Case 3
WebUI.callTestCase(findTestCase('Test Cases/DATA UI/Download/ProsesDownload'), [:])