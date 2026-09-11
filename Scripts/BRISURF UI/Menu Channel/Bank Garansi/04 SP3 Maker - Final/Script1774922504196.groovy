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
//tes

//WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/ikonCeklis'), 0)
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/ikonCeklis'))

//end tes
WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn Generate'), 0)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn Generate'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn OK popup'))

WebUI.delay(3)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn OK popup'))

WebUI.delay(3)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn Pricipal'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/dropdownPersetujuan'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/opsiPersetujuan'))

WebUI.delay(6)

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/inputKeterangan'), 'testing')

WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/uploadFile'), 'C:\\Users\\ACER\\Downloads\\DraftSp3_1781051700_78784.pdf')

//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn Upload'))
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn Simpan'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn OK popup'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/ikonAggrement'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/inputNomor'), 'N794891')

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/tglAwal'), '2026-06-10')

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/tglAkhir'), '2026-09-30')

WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/uploadSuratImdenity'), 'C:\\Users\\ACER\\Downloads\\DraftSp3_1781051700_78784 (1).pdf')

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btnSimpan Imdenity'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn OK popup'))

WebUI.delay(6)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn UploadSP3Asli'))

WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/uploadSP3Final'), 'C:\\Users\\ACER\\Downloads\\DraftSp3_1781051700_78784.pdf')

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn UploadSP3'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn OK popup'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/ikonUploadBRI'))

WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/uploadSP_BRI'), 'C:\\Users\\ACER\\Downloads\\DraftSp3_1781051700_78784 (1).pdf')

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn UploadSP_BRI'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Maker Final/btn OK popup'))

WebUI.closeBrowser()

