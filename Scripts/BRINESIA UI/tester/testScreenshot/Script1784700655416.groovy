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

// Testcase 
//cara 1
//// Membuka browser menuju sistem web yang diuji
//WebUI.openBrowser('http://192.168.140.18:8005/login/')
//
//WebUI.maximizeWindow()
//
//WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/username'), 'test')
//
//WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/password'), 'test1')
//
//// AMBIL SCREENSHOT DENGAN ABSOLUTE PATH (PASTI MASUK KE FILE EXPLORER)
//String timestamp = new Date().format('ddMMyyyy_HH.mm.ss')
//
//// Menentukan letak folder utama project Anda secara otomatis
//String projectDirectory = RunConfiguration.getProjectDir()
//String fullImagePath = projectDirectory + "/Screenshots/Manual_Evidence_" + timestamp + ".png"
//
//// Eksekusi ambil screenshot ke folder tersebut
//WebUI.takeScreenshot(fullImagePath)
//
//// Melanjutkan sisa langkah testing lainnya
////WebUI.click(findTestObject('BRINESIA UI/BrinscreenBook/Login/btnPortal'))
//
//WebUI.closeBrowser()
//Cara 2
//WebUI.openBrowser('http://192.168.140.18:8005/login/')
//
//WebUI.maximizeWindow()
//
//WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/username'), 'test')
//
//WebUI.setText(findTestObject('BRINESIA UI/BrinscreenBook/Login/password'), 'test1')
//
//// Klik tombol login
//WebUI.click(findTestObject('BRINESIA UI/BrinscreenBook/Login/btnPortal'))
//
//// Gagal jika muncul halaman error
//WebUI.verifyTextPresent('IndexError at /login/', false, FailureHandling.STOP_ON_FAILURE)
//
//String bodyText = WebUI.executeJavaScript("return document.body.innerText;",null)
//
//if (bodyText.contains("IndexError at /login/") ||
//    bodyText.contains("list index out of range")) {
//
//    //KeywordUtil.markFailed("Login gagal karena server error")
//	KeywordUtil.markFailedAndStop("Login gagal karena server error")
//}


//Test Listener
//	@AfterTestCase
//	def takeScreenshotAfterTestCase(TestCaseContext testCaseContext) {
//		if (testCaseContext.getTestCaseStatus() == 'FAILED') {
//			String timestamp = new Date().format('ddMMyyyy_HH.mm.ss')
//			String testCaseName = testCaseContext.getTestCaseId().replace('/', '')
//
//			// Menggunakan lokasi absolute path agar file fisik terbuat
//			String projectDirectory = RunConfiguration.getProjectDir()
//			String fullFailedPath = projectDirectory + "/Screenshots/FAILED" + testCaseName + "_" + timestamp + ".png"
//
//			WebUI.takeScreenshot(fullFailedPath)
//		}
//	}

WebUI.back()