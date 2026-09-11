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

WebUI.setText(findTestObject('BRISURF UI/Custom/Login/username'), 'wenda')

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

//WebUI.executeJavaScript('document.querySelector(\'.table-responsive\').scrollLeft = 500', null)
WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Channel/Signer/ikonCeklis'), 0)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Signer/ikonCeklis'))

//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Signer/dropdownPersetujuan'))
//
//WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Signer/opsiPersetujuan'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Channel/Signer/inputKeterangan'), 'testing')

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Signer/btnSimpan'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Channel/Maker/Create Maker/btn OK popup'))

