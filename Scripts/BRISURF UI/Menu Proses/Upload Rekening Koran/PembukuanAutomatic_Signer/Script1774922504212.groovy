import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://dev-app-brisurf.brins.co.id/')

WebUI.setText(findTestObject('BRISURF UI/Custom/Login/username'), 'Rexy')

WebUI.setText(findTestObject('BRISURF UI/Custom/Login/password'), 'Agan12345')

WebUI.click(findTestObject('BRISURF UI/Custom/Login/btn login'))

WebUI.delay(5)

WebUI.click(findTestObject('BRISURF UI/Custom/Welcome Page/opsiMenu'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/prosesMenu'))

WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/MenuUploadRekKoran'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/MenuUploadRekKoran'))

//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/dropdownEntry'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ShowAllEntry'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ActionCeklis'))

// =========================
// STEP 1 - INITIAL VALIDATION
// =========================
// verify button ada
WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_MatchTransaction'))

WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CancelProcess'))

// verify hint awal
WebUI.verifyElementText(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/WordingHint_Match'), 'The transaction remarks matching process has not been executed yet.')

// =========================
// STEP 2 - AFTER MATCH TRANSACTION "Button Compare"
// =========================
// Match Transaction Remarks
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_MatchTransaction'))

WebUI.waitForAlert(3)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Popup_Submit'))

WebUI.delay(5)

// tunggu button compare muncul
WebUI.waitForElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CompareTransaction'), 10)

// verify button compare
WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CompareTransaction'))

//// verify section muncul
//WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataValid'))
//
//WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataInvalid'))

// =========================
// STEP 3 - COMPARE
// =========================
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CompareTransaction'))

// tunggu button hilang
WebUI.waitForElementNotPresent(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CompareTransaction'), 10)

//// verify data valid muncul
//WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataValid'))
//
//// verify data invalid muncul
//WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataInvalid'))

//WebUI.back()
//
//WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ActionFile'))
//
//WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ActionDownload'))

WebUI.delay(5)