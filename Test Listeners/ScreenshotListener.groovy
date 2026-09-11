import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI//

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase//
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext//
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration


class ScreenshotListener { 
	@AfterTestCase
	def takeScreenshotAfterTestCase(TestCaseContext testCaseContext) {

		String timestamp = new Date().format("dd.MM.yyyy_(HH.mm.ss)")
		String projectDir = RunConfiguration.getProjectDir()
		String testCaseName = testCaseContext.getTestCaseId().replace("/", "_")

		String status = testCaseContext.getTestCaseStatus()

//		String fileName = "${status}_${testCaseName}_${timestamp}.png"
//		String fullPath = "${projectDir}/Screenshots/${fileName}"
		String fullPath = "${projectDir}/Screenshots/Evidence_${status}_${timestamp}.png"
		

		WebUI.takeScreenshot(fullPath)

		println("Screenshot disimpan: " + fullPath)
		
		//WebUI.closeBrowser()
	}
}
