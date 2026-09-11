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

WebUI.scrollToElement(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/MenuUploadRekKoran'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Menu/MenuUploadRekKoran'))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/dropdownBranch'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputBranch'), 'Makassar')

WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputBranch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputName'), 'Automation 3')

WebUI.uploadFile(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/uploadDok'), 'C:\\Users\\TTECH-0251\\OneDrive - brins.co.id\\personal\\noval_wina_nurcahyo_work_brins_co_id\\Brins\\Report Project\\BRISURF\\Lunar\\Pembukuan\\All Program 100 Data\\Dokumen Test 2\\BRINS_038601001055307_SPV_tes13.xlsx')

// D:\\LUNAR\\Report Project\\Pembukuan Automatic\\AUO BRILINK FEBRUARI 26.xls
WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/Dropdown Product'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), 'Asuransi Mikro BRILINK WIC')

WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/Dropdown Account Type'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), 'PREMI')

WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/Dropdown Account No'))

WebUI.setText(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), '020601000102311')

WebUI.sendKeys(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/InputAllDropdown'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('BRISURF UI/Custom/Menu Proses/Tab Import CMS/button_Import Excel'))

//WebUI.acceptAlert()

WebUI.delay(5)

WebUI.closeBrowser()
