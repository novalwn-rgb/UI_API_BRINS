import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import java.time.Duration as Duration
import org.openqa.selenium.By as By

WebUI.openBrowser('https://dev-app-brisurf.brins.co.id/')

WebUI.setText(findTestObject('BRISURF UI/Custom/Login/username'), 'barkah')

WebUI.setText(findTestObject('BRISURF UI/Custom/Login/password'), 'Agan12345')

WebUI.click(findTestObject('BRISURF UI/Custom/Login/btn login'))

WebUI.delay(5)

WebUI.click(findTestObject('BRISURF UI/Custom/Welcome Page/Slide'))

WebUI.click(findTestObject('BRISURF UI/Custom/Welcome Page/opsiMenu'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/closeBarAjax'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/channelMenu'))

WebUI.delay(1)

// ====================================
// FORCE OPEN DROPDOWN
// ====================================
WebUI.executeJavaScript('\n    var dropdowns = document.querySelectorAll(\'ul.dropdown-menu\');\n\n    dropdowns.forEach(function(el){\n        el.style.display=\'block\';\n    });\n', 
    null)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/bankGaransiMenu'), 0)

// ====================================
// CLICK SP3
// ====================================
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/sp3Menu'))

WebUI.delay(3)

//// Data SP3
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn InputSP3'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownFID'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputFID'), '10030')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputFID'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownSource'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputSource'), 'Direct')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputSource'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/radioButtonTipePerjanjian'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownKCP'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputKCP'), '00058')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputKCP'), Keys.chord(Keys.ENTER))

		//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownCabangBrins'))
		//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputCabangBrins'), '106')
		//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputCabangBrins'), Keys.chord(Keys.ENTER))
		//WebUI.delay(3)
//WebUI.waitForElementVisible(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/pilihRMJakarta1'), 2)
//
//WebUI.selectOptionByLabel(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/pilihRMJakarta1'), 'SISKA SAPUTRI', 
//    false)
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownPriciple'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputPriciple'), 'RAZAAQI SELARAS PERSADA')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputPriciple'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownJenisBG'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputJenisBG'), 'Jaminan Uang Muka')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputJenisBG'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownCurrency'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputCurrecy'), 'IDR')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputCurrecy'), Keys.chord(Keys.ENTER))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNoKontrak'), '5454321')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNoSPK'), '98564838')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputUndanganLelang'), '98564839')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNoBAST'), '98564840')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputTGLKontrak'), '2027-01-10')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputTGLKontrak'), Keys.chord(Keys.ESCAPE))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNoPermohonanBG'), '98564842')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputTGLPermohonanBG'), '2026-12-10')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputTGLPermohonanBG'), Keys.chord(Keys.ESCAPE))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNoAddendum'), '98564841')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownNamaObligae'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNamaObligae'), 'BRINS Paten')
//
//WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNamaObligae'), Keys.chord(Keys.ENTER))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputDetailNamaObligae'), 'Testing')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNamaProyek'), 'QA')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNilaiProyek'), '7431851034')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputNoRekDebitPremi'), '129401928910212')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn Inquiry'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))
//
//WebUI.selectOptionByValue(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/dropdownPeriodeKlaim'), '30', 
//    false)
//
//// Perhitungan Premi
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputTGLAwalBG'), '2026-12-10')
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputTGLAkhirBG'), '2027-01-10')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn HitungHari'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputPersentase'), '2')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn NilaiJaminan'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn HitungPremi'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/inputSubmission'), 'SN123456')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn Simpan'))

//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))

			//WebDriver driver = DriverFactory.getWebDriver()
			//
			//driver.findElement(
			//    By.xpath("//button[@type='submit' and contains(normalize-space(.), 'Simpan')]")).click();
			//
			//try {
			//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			//
			//    WebElement btnOk = wait.until(
			//        ExpectedConditions.elementToBeClickable(
			//            By.xpath("//button[contains(@class,'swal-button--confirm') and normalize-space()='OK']")
			//        )
			//    );
			//
			//    btnOk.click();
			//    System.out.println("Popup muncul, tombol OK diklik.");
			//
			//} catch (Exception e) {
			//    println("Popup tidak muncul")
			//}


WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/ikonCeklis'), 0)

// Tunggu tab baru terbuka
WebUI.delay(5)

// Pindah ke tab baru (index 1)
//WebUI.switchToWindowIndex(1)
//
//WebUI.closeWindowIndex(0)
//
//WebUI.delay(5)
//WebUI.executeJavaScript('document.querySelector(\'.table-responsive\').scrollLeft = 500', null)
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/ikonCeklis'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/dropdownDokumen'))

WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/uploadDokumen'), 'C:\\Users\\ACER\\Downloads\\Sample Dokumen\\BN57673UNDFL-0202SMG0725..pdf')

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/dropdownKewenangan'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/inputKeterangan'), 'Testing Bank')

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/btn KirimPengajuan'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))

//WebUI.click(findTestObject('BRISURF UI/Custom/Login/userLogout'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Login/btn logout'))
WebUI.closeBrowser()

