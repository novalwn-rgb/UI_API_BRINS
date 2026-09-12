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
WebUI.openBrowser('http://192.168.140.18:8000/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Data UI/Login/inputUsername'), 'test')

WebUI.setText(findTestObject('Data UI/Login/inputPassword'), 'passwordSalah')

WebUI.click(findTestObject('Data UI/Login/btnPortal'))

WebUI.delay(2)

// Validasi pesan gagal login
boolean loginFailed = WebUI.verifyTextPresent('IndexError at /login/', false, FailureHandling.OPTIONAL)

if (loginFailed) {
    String screenshotPathFailed1 = "${projectDir}/Screenshots/Evidence_NEGATIVE_Login Gagal_${timestamp}.png"

    WebUI.takeScreenshot(screenshotPathFailed1)

    //WebUI.takeScreenshot("$projectDir/Screenshots/Evidence_NEGATIVE_$timestamp.png")
    println('Negative login berhasil divalidasi')
} else {
    println('Pesan gagal login tidak ditemukan')
}

WebUI.back()

WebUI.delay(3)

WebUI.click(findTestObject('Data UI/Login/btnForceLogout1'))

WebUI.setText(findTestObject('Data UI/Login/inputUsernameForce'), 'TTECH-0251')

WebUI.click(findTestObject('Data UI/Login/btnForceLogout2'))

// ============================
// POSITIVE LOGIN
// ============================
// isi ulang login benar
WebUI.setText(findTestObject('Data UI/Login/inputUsername'), 'TTECH-0251')

WebUI.setText(findTestObject('Data UI/Login/inputPassword'), 'qwerty123')

WebUI.click(findTestObject('Data UI/Login/btnPortal'))

WebUI.delay(3)

// Validasi berhasil login
WebUI.verifyElementPresent(findTestObject('Data UI/Menu/Brinsbook'), 10)

//WebUI.takeScreenshot("${projectDir}/Screenshots/Evidence_POSITIVE_${timestamp}.png")
WebUI.delay(1)

String screenshotPathFailed2 = "${projectDir}/Screenshots/Evidence_POSITIVE_Menu BRINS Book_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathFailed2)

WebUI.click(findTestObject('Data UI/Menu/Brinsbook'))

WebUI.delay(2)