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

String projectDir = RunConfiguration.getProjectDir()

String timestamp = new Date().format('dd.MM.yyyy_(HH.mm.ss)')

WebUI.click(findTestObject('Data UI/BrinsBook/Menu/ReportingPortal'))

WebUI.scrollToElement(findTestObject('Data UI/BrinsBook/Menu/btnPilih'), 0)

WebUI.click(findTestObject('Data UI/BrinsBook/Menu/btnPilih'))

WebUI.delay(3)

String urlFBI_Detail = WebUI.getUrl()

assert urlFBI_Detail.contains('mng_proman_fbi_detail')

WebUI.verifyElementPresent(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/Headline'), 0)

String screenshotPathFilter = "${projectDir}/Screenshots/Evidence_POSITIVE_DashboardFBI_Detail_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathFilter)

// {projectDir} dan {timestamp}

WebUI.delay(1)

WebUI.setText(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/PeriodeAwal'), '01012026')

WebUI.setText(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/PeriodeAkhir'), '28022026')

WebUI.click(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/Product'))

WebUI.click(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/Uker'))

WebUI.click(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/Cabang'))

WebUI.click(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/Type'))

WebUI.click(findTestObject('Data UI/BrinsBook/Filter FBI_Detail/btnProses'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Data UI/BrinsBook/Download/popupDownload'), 0)

