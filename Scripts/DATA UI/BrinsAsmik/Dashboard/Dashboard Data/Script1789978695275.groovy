import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String projectDir = RunConfiguration.getProjectDir()

String timestamp = new Date().format('dd.MM.yyyy_(HH.mm.ss)')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Data UI/BrinsAsmik/Menu/secLogin2'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/btnSignIn'))

WebUI.verifyElementVisible(findTestObject('Data UI/BrinsAsmik/Menu/errorMessage'))

WebUI.delay(2)

String screenshotPathLogin2 = "${projectDir}/Screenshots/Evidence_POSITIVE_LoginDashboard_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathLogin2)

WebUI.setText(findTestObject('Data UI/BrinsAsmik/Menu/inputPassword'), 'P@ssw0rd')

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/btnSignIn'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Data UI/BrinsAsmik/Dashboard/canvasBranch'))

String screenshotPathCanvas = "${projectDir}/Screenshots/Evidence_POSITIVE_DashCanvas_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathCanvas)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBranchAll'))

WebUI.delay(2)

String screenshotPathFBranch = "${projectDir}/Screenshots/Evidence_POSITIVE_FilterBranch_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathFBranch)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterTahun'))

WebUI.delay(2)

String screenshotPathFTahun = "${projectDir}/Screenshots/Evidence_POSITIVE_FilterTahun_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathFTahun)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBulan'))

WebUI.delay(2)

String screenshotPathFBulan = "${projectDir}/Screenshots/Evidence_POSITIVE_FilterBulan_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathFBulan)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBranchAll'))

WebUI.delay(2)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/pilihAll'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/pilihBranch'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBulan'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/pilihBulan'))

String screenshotPathFApril = "${projectDir}/Screenshots/Evidence_POSITIVE_FilterBulanApril26_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathFApril)
