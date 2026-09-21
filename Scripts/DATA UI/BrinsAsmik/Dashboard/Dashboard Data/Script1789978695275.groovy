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

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Data UI/BrinsAsmik/Menu/secLogin2'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/btnSignIn'))

WebUI.verifyElementVisible(findTestObject('Data UI/BrinsAsmik/Menu/errorMessage'))

WebUI.delay(2)

WebUI.setText(findTestObject('Data UI/BrinsAsmik/Menu/inputPassword'), 'P@ssw0rd')

WebUI.click(findTestObject('Data UI/BrinsAsmik/Menu/btnSignIn'))

WebUI.doubleClick(findTestObject('Data UI/BrinsAsmik/Dashboard/canvasBranch'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBranchAll'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterTahun'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBulan'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBranchAll'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/pilihAll'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/pilihBranch'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/filterBulan'))

WebUI.click(findTestObject('Data UI/BrinsAsmik/Dashboard/pilihBulan'))
