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

//script 1
//WebUI.executeJavaScript('document.querySelector(\'.table-responsive\').scrollLeft = 500', null)
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/ikonCeklis'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/dropdownDokumen'))
//
//WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/uploadDokumen'), 'C:\\Users\\ACER\\Downloads\\Sample Dokumen\\BN57673UNDFL-0202SMG0725..pdf')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/dropdownKewenangan'))
//
//WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/inputKeterangan'), 'Testing Bank')
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Pengajuan SP3/btn KirimPengajuan'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))

WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/ikonCeklis'), 0)

// Tunggu tab baru terbuka
WebUI.delay(5)



