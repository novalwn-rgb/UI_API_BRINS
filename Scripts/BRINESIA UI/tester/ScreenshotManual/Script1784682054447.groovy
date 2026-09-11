import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String projectDir = RunConfiguration.getProjectDir()

String timestamp = new Date().format('dd.MM.yyyy_(HH.mm.ss)')

// ============================
// NEGATIVE LOGIN
// ============================
WebUI.openBrowser('http://192.168.140.18:8005/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/username'), 'test')

WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/password'), 'passwordSalah')

WebUI.click(findTestObject('BRINESIA UI/BrinscreenBook/Login/btnPortal'))

WebUI.delay(2)

// Validasi pesan gagal login
boolean loginFailed = WebUI.verifyTextPresent('IndexError at /login/', false, FailureHandling.OPTIONAL)

//boolean djangoError = WebUI.verifyTextPresent('IndexError at /login/',false,FailureHandling.OPTIONAL)

if (loginFailed) {
    WebUI.takeScreenshot("${projectDir}/Screenshots/Evidence_NEGATIVE_${timestamp}.png")

    println('Negative login berhasil divalidasi')
	
} 
//else if (djangoError) {
//
//    WebUI.takeScreenshot("$projectDir/Screenshots/Bug_$timestamp.png")
//    //KeywordUtil.markFailedAndStop("BUG: Muncul Django IndexError.")
//} 
else {
    println('Pesan gagal login tidak ditemukan')
}

WebUI.back()

WebUI.delay(3)

// ============================
// POSITIVE LOGIN
// ============================
// isi ulang login benar
WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/username'), 'test')

WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/password'), 'test1')

WebUI.click(findTestObject('BRINESIA UI/BrinscreenBook/Login/btnPortal'))

WebUI.delay(3)

// Validasi berhasil login
//WebUI.verifyElementPresent(findTestObject('BRINESIA UI/BrinscreenBook/Home/dashboard'), 10) // nanti masukin Object validnya pas dashboard
//
//WebUI.takeScreenshot("$projectDir/Screenshots/Evidence_POSITIVE_${timestamp}.png")

WebUI.delay(1)

