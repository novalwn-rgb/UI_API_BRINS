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

import java.awt.Robot 
import java.awt.Rectangle 
import java.awt.Toolkit 
import java.awt.image.BufferedImage 
import javax.imageio.ImageIO

String projectDir = RunConfiguration.getProjectDir()

String timestamp = new Date().format('dd.MM.yyyy_(HH.mm.ss)')

WebUI.click(findTestObject('Data UI/Download/btnDownload'))

String screenshotPathDownload = "${projectDir}/Screenshots/Evidence_POSITIVE_Popup_Download_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathDownload)

WebUI.verifyElementPresent(findTestObject('Data UI/Download/popupDownload'), 0)

String downloadDir = System.getProperty('user.home') + '/Downloads'
File downloadFolder = new File(downloadDir)

long startDownload = System.currentTimeMillis()

//WebUI.click(findTestObject('Data UI/Download/formatExcel'))
//=======
//// Tunggu maksimal 30 detik
//File downloadedFile = null
//
//for (int i = 0; i < 30; i++) {
//
//	WebUI.delay(1)
//
//	def files = downloadFolder.listFiles()
//
//	downloadedFile = files?.find { file ->
//
//		file.isFile() &&
//		file.name.toLowerCase().endsWith('.xlsx') &&
//		file.lastModified() >= startDownload &&
//		!file.name.endsWith('.crdownload')
//
//	}
//
//	if (downloadedFile != null) {
//		break
//	}
//}
//
//// Verifikasi
//WebUI.verifyNotEqual(downloadedFile, null,	FailureHandling.STOP_ON_FAILURE)
//
//println "Download berhasil: ${downloadedFile.name}"
//println "Path: ${downloadedFile.absolutePath}"





//=================================================
String downloadDir = System.getProperty('user.home') + '\\Downloads' 
File downloadFolder = new File(downloadDir) 
if (!downloadFolder.exists()) { 
	WebUI.comment("Folder Downloads tidak ditemukan: ${downloadDir}") 
	assert false 
	}
	
	// ======================================================
// 5. KLIK EXCEL
// ======================================================

WebUI.comment("Klik format Excel")

WebUI.click(findTestObject('Data UI/Download/formatExcel')
)


// ======================================================
// 6. CEK APAKAH FILE LANGSUNG TERDOWNLOAD
// ======================================================

WebUI.comment("Cek apakah file otomatis terdownload...")

File downloadedFile = null

// Tunggu maksimal 5 detik untuk download otomatis
for (int i = 0; i < 5; i++) {

    WebUI.delay(1)

    def files = downloadFolder.listFiles()

    if (files == null) {
        continue
    }

    downloadedFile = files.find { file ->

        file.isFile() &&
        file.name.toLowerCase().endsWith('.xlsx') &&
        !beforeFiles.contains(file.name)

    }

    if (downloadedFile != null) {
        break
    }
}


// ======================================================
// 7. JIKA BELUM DOWNLOAD → KLIK "TETAP DOWNLOAD"
// ======================================================

if (downloadedFile == null) {

    WebUI.comment("File belum ditemukan. Kemungkinan Chrome meminta 'Tetap Download'.")

    // ----------------------------------------------
    // Klik UI Chrome menggunakan Robot
    // ----------------------------------------------

    Robot robot = new Robot()

    // Posisi tombol "Tetap Download"
    // Sesuaikan jika posisi Chrome berubah
    robot.mouseMove(1050, 150)

    robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK)

    robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK)

    WebUI.comment("Tombol 'Tetap Download' diklik melalui Chrome UI")
}


// ======================================================
// 8. TUNGGU DOWNLOAD SAMPAI SELESAI
// ======================================================

WebUI.comment("Menunggu file Excel selesai download...")

int maxWait = 30

for (int i = 0; i < maxWait; i++) {

    WebUI.delay(1)

    def files = downloadFolder.listFiles()

    if (files == null) {
        continue
    }

    downloadedFile = files.find { file ->

        file.isFile() &&
        file.name.toLowerCase().endsWith('.xlsx') &&
        !beforeFiles.contains(file.name)

    }

    if (downloadedFile != null) {

        WebUI.comment("File ditemukan pada detik ke-${i + 1}")

        break
    }

    WebUI.comment("Menunggu download... ${i + 1}/${maxWait} detik")
}


// ======================================================
// 9. VERIFY DOWNLOAD BERHASIL
// ======================================================

WebUI.verifyNotEqual(downloadedFile, null, FailureHandling.STOP_ON_FAILURE)

WebUI.comment("Download Excel berhasil: ${downloadedFile.absolutePath}")
					
// ====================================================== 
// 10. BUKA FILE EXCEL 
// ====================================================== 
WebUI.comment("Membuka file Excel...") 
String excelPath = downloadedFile.absolutePath 
Process excelProcess = new ProcessBuilder( 'cmd', '/c', 'start', '', excelPath ).start() 

// Berikan waktu Excel untuk terbuka WebUI.delay(8) 
// ====================================================== 
// 11. SCREENSHOT DESKTOP / APLIKASI EXCEL 
// ====================================================== 
String screenshotExcel = "${projectDir}\\Screenshots\\EVIDENCE_POSITIVE_Excel_${timestamp}.png" 
Robot robot = new Robot() 
Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) 
BufferedImage screenshot = robot.createScreenCapture(screenRect) 
ImageIO.write( screenshot, 'png', new File(screenshotExcel) ) 
WebUI.comment( "Screenshot Excel berhasil dibuat: ${screenshotExcel}" ) 
// ====================================================== 
// 12. VERIFY SCREENSHOT BERHASIL DIBUAT 
// ====================================================== 
File screenshotFile = new File(screenshotExcel) 
WebUI.verifyEqual( screenshotFile.exists(), true, FailureHandling.STOP_ON_FAILURE ) 
WebUI.comment("Evidence Excel berhasil disimpan") 
// ====================================================== 
// 13. TUTUP EXCEL 
// ====================================================== 
WebUI.delay(2) 
// ALT + F4 untuk menutup Excel 
robot.keyPress(java.awt.event.KeyEvent.VK_ALT) 
robot.keyPress(java.awt.event.KeyEvent.VK_F4) 
robot.keyRelease(java.awt.event.KeyEvent.VK_F4) 
robot.keyRelease(java.awt.event.KeyEvent.VK_ALT) 
WebUI.comment("Excel ditutup")

//==============================================
WebUI.click(findTestObject('Data UI/Download/formatPDF'))

