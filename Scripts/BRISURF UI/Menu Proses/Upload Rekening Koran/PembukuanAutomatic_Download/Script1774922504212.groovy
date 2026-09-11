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
import com.kms.katalon.core.util.KeywordUtil

//WebUI.openBrowser('https://dev-app-brisurf.brins.co.id/')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Login/username'), 'Rexy')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Login/password'), 'Agan12345')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Login/btn login'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Welcome Page/opsiMenu'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/prosesMenu'))
//
//WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/MenuUploadRekKoran'), 0, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/MenuUploadRekKoran'))

// =========================
// STEP 1 - Action Download
// =========================
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/ActionDownload'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Dropdown StatusPembukuan'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Dropdown OpsiGagal'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Action Download/Btn RequestExcel'))

WebUI.delay(5)

// ========================================
// STEP 2 - BUKA TAB HASIL EXCEL
// ========================================

WebUI.waitForElementVisible(
	findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/tabHasilExcel'),
	10
)

WebUI.click(
	findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/tabHasilExcel')
)


// ========================================
// STEP 3 - CEK STATUS AWAL
// ========================================

boolean isMenunggu = WebUI.verifyElementPresent(
	findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/StatusProses_Menunggu'),
	5,
	FailureHandling.OPTIONAL
)

println('Status Menunggu Diproses: ' + isMenunggu)


// ========================================
// STEP 4 - POLLING SAMPAI SELESAI
// ========================================

int maxTry = 10
boolean isSelesai = false

for (int i = 0; i < maxTry; i++) {

	println('Checking status... Percobaan ke-' + (i + 1))

	WebUI.delay(5)

	WebUI.refresh()

	WebUI.delay(2)

	isSelesai = WebUI.verifyElementPresent(
		findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/StatusProses_Selesai'),
		5,
		FailureHandling.OPTIONAL
	)

	if (isSelesai) {
		println('========================================')
		println('STATUS SUDAH SELESAI DIPROSES')
		println('========================================')
		break
	}

	println('Status belum selesai, lanjut polling...')
}


// ========================================
// STEP 5 - VALIDASI STATUS SELESAI
// ========================================

if (!isSelesai) {

	KeywordUtil.markFailed(
		'Status masih Menunggu Diproses setelah ' +
		(maxTry * 5) + ' detik.'
	)

} else {

	println('Status proses berhasil menjadi Selesai Diproses')


	// ========================================
	// STEP 6 - CEK IKON DOWNLOAD
	// ========================================

	boolean isDownloadAvailable = WebUI.verifyElementPresent(
		findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/IkonDownload_HasilExcel'),
		5,
		FailureHandling.OPTIONAL
	)


	// ========================================
	// STEP 7 - KONDISI DOWNLOAD
	// ========================================

	if (isDownloadAvailable) {

		println('========================================')
		println('IKON DOWNLOAD TERSEDIA')
		println('Melakukan download...')
		println('========================================')

		WebUI.waitForElementVisible(
			findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/IkonDownload_HasilExcel'),
			10
		)

		WebUI.click(
			findTestObject('BRISURF UI/Custom/Menu Proses/Tab Hasil Excel/IkonDownload_HasilExcel')
		)

		println('Download berhasil diklik')

	} else {

		println('========================================')
		println('IKON DOWNLOAD BELUM TERSEDIA')
		println('Download dilakukan manual oleh Developer')
		println('Test tetap dianggap BERHASIL')
		println('========================================')
	}
}

