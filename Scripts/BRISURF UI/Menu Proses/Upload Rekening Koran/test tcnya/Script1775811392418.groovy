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

WebUI.setText(findTestObject('BRISURF UI/Custom/Login/username'), 'Azkarik')

WebUI.setText(findTestObject('BRISURF UI/Custom/Login/password'), 'Agan12345')

WebUI.click(findTestObject('BRISURF UI/Custom/Login/btn login'))

WebUI.delay(5)

WebUI.click(findTestObject('BRISURF UI/Custom/Welcome Page/opsiMenu'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/prosesMenu'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/MenuUploadRekKoran'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputName'), 'Testing')

WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/uploadDok'), 'D:\\LUNAR\\Report Project\\Pembukuan Automatic\\AUO BRILINK FEBRUARI 26.xls')

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/Dropdown Product'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), 'Asuransi Kredit Briguna Kawan')

WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/Dropdown Account Type'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), 'KLAIM')

WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/Dropdown Account No'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), '020601000102311')

WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/button_Import Excel'))
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/dropdownEntry'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ShowAllEntry'))

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

// verify section muncul
WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataValid'))

WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataInvalid'))

// =========================
// STEP 3 - COMPARE
// =========================
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CompareTransaction'))

// tunggu button hilang
WebUI.waitForElementNotPresent(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CompareTransaction'), 10)

// verify data valid muncul
WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataValid'))

// verify data invalid muncul
WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Sec_ListDataInvalid'))

WebUI.back()

WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ActionFile'))

WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ActionDownload'))

// =========================
// STEP 4 - Action Download
// =========================
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ActionDownload'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Dropdown StatusPembukuan'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Dropdown OpsiGagal'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Btn RequestExcel'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Message Download'), 10)

// Verifikasi after klik action download
WebUI.waitForElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Message Download'), 10)

String alertText = WebUI.getText(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Message Download'))

assert alertText.contains('Request laporan berhasil disimpan') //Request laporan berhasil disimpan. Sistem akan memproses data yang Anda buat. Cek progres pengerjaan di tab Hasil Excel
    
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/tabHasilExcel'))

WebUI.waitForElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/tabHasilExcel'), 10)

// Verifikasi before and after download
boolean isMenunggu = WebUI.verifyElementPresent(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/StatusProses_Menunggu'), 
    5, FailureHandling.OPTIONAL)

println('Status Menunggu Diproses: ' + isMenunggu)

// polling sederhana (loop)
int maxTry = 10

boolean isSelesai = false

for (int i = 0; i < maxTry; i++) {
    WebUI.delay(5)

    WebUI.refresh()

    isSelesai = WebUI.verifyElementPresent(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/StatusProses_Selesai'), 
        5, FailureHandling.OPTIONAL)

    if (isSelesai) {
        println('Status sudah selesai diproses')

        break
    }
}

// assert kalau tidak selesai
assert isSelesai == true

// =========================
// STEP 5 - VERIFY & CLICK DOWNLOAD
// =========================
WebUI.waitForElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/IkonDownload_HasilExcel'), 10)

WebUI.verifyElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/IkonDownload_HasilExcel'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/IkonDownload_HasilExcel'))

println('Download berhasil diklik')

// Cancel Process nanti dilanjutkan kita ada case ingin cancel
// =========================
// STEP 6 - CANCEL PROCESS
// =========================
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CancelProcess'))

WebUI.waitForAlert(3)

WebUI.acceptAlert()

// tunggu perubahan
WebUI.waitForElementVisible(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/WordingHint_Cancel'), 10)

// verify text berubah
WebUI.verifyElementText(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/WordingHint_Cancel'), 'The transaction process was canceled')

// verify button hilang
WebUI.verifyElementNotPresent(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_MatchTransaction'), 5)

WebUI.verifyElementNotPresent(findTestObject('BRISURF UI/Custom/Menu Proses/Action Ceklis/Btn_CancelProcess'), 5)

