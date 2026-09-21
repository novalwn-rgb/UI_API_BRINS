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

WebUI.delay(3)

WebUI.setText(findTestObject('Data UI/BrinsAsmik/Menu/searchSite'), 'DEVELOPMENT AND OPERATIONAL BUSSINES DIVISION (DOB)')

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/pilihDOB'))

WebUI.delay(2)

String screenshotPathDOB = "${projectDir}/Screenshots/Evidence_POSITIVE_Menu Site DOB_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathDOB)

WebUI.delay(2)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/dataDevelopment'))

String screenshotPathDevelopment = "${projectDir}/Screenshots/Evidence_POSITIVE_Data Development_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathDevelopment)

WebUI.delay(2)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/dataPerformance'))

String screenshotPathPerformance = "${projectDir}/Screenshots/Evidence_POSITIVE_Data Performance_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathPerformance)

WebUI.delay(2)

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/dataAsmik'))

String screenshotPathAsmik = "${projectDir}/Screenshots/Evidence_POSITIVE_Data ASMIK_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathAsmik)

WebUI.delay(2)