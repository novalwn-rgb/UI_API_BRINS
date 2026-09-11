import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String projectDir = RunConfiguration.getProjectDir()

String timestamp = new Date().format('dd.MM.yyyy_(HH.mm.ss)')

// ============================
// NEGATIVE LOGIN
// ============================
WebUI.openBrowser('https://mis.brins.co.id/#/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('BRINESIA UI/Tableau/Login/username'), 'test')

WebUI.setText(findTestObject('BRINESIA UI/Tableau/Login/password'), 'passwordSalah')

WebUI.click(findTestObject('BRINESIA UI/Tableau/Login/btnSign'))

WebUI.delay(2)

// Validasi pesan gagal login
boolean loginFailed = WebUI.verifyTextPresent('Invalid username or password', false, FailureHandling.OPTIONAL)

if (loginFailed) {
    String screenshotPathFailed = "${projectDir}/Screenshots/Evidence_NEGATIVE_Login Gagal_${timestamp}.png"

    WebUI.takeScreenshot(screenshotPathFailed)

    println('Negative login berhasil divalidasi')
} else {
    println('Pesan gagal login tidak ditemukan')
}

WebUI.refresh()

WebUI.delay(2)

WebUI.setText(findTestObject('BRINESIA UI/Tableau/Login/username'), 'administrator' //tsi_user
    )

WebUI.setText(findTestObject('BRINESIA UI/Tableau/Login/password'), 'Tsi_Brins2020' //TsI_brins
    )

WebUI.click(findTestObject('BRINESIA UI/Tableau/Login/btnSign'))

WebUI.click(findTestObject('BRINESIA UI/Tableau/MenuDashboard/opsiSearchDOB'))

WebUI.click(findTestObject('BRINESIA UI/Tableau/MenuDashboard/dataDefault'))

WebUI.click(findTestObject('BRINESIA UI/Tableau/Menu Default/dataLOA'))

WebUI.click(findTestObject('BRINESIA UI/Tableau/Menu Default/dataSupervisi'))

WebUI.delay(15)

String urlSupervisi = WebUI.getUrl()

assert urlSupervisi.contains('DashboardProduksiPerLOA-BranchSupervisi')

//WebUI.verifyElementPresent(findTestObject('BRINESIA UI/Tableau/Menu Default/judulSuperVisi'), 10)

String screenshotPathSuper = "${projectDir}/Screenshots/Evidence_POSITIVE_DashboardSuperVisi_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathSuper)

WebUI.delay(5)

WebUI.click(findTestObject('BRINESIA UI/Tableau/Menu Default/btnBack'))

WebUI.click(findTestObject('BRINESIA UI/Tableau/Menu Default/dataBranchUtama'))

WebUI.delay(10)

String urlBranchUtama = WebUI.getUrl()

assert urlBranchUtama.contains('DashboardProduksiPerLOA-BranchUtama')

//WebUI.verifyElementPresent(findTestObject('BRINESIA UI/Tableau/Menu Default/judulBranchUtama'), 10)

String screenshotPathUtama = "${projectDir}/Screenshots/Evidence_POSITIVE_DashboardBranchUtama_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathUtama)

WebUI.delay(5)

WebUI.click(findTestObject('BRINESIA UI/Tableau/Menu Default/btnBack'))

WebUI.click(findTestObject('BRINESIA UI/Tableau/Menu Default/dataRM'))

WebUI.delay(10)

String urlRM = WebUI.getUrl()

assert urlRM.contains('DashboardProduksiPerLOA-RelationshipManager')

//WebUI.verifyElementPresent(findTestObject('BRINESIA UI/Tableau/Menu Default/judulRM'), 10)

String screenshotPathRM = "${projectDir}/Screenshots/Evidence_POSITIVE_DashboardRM_${timestamp}.png"

WebUI.takeScreenshot(screenshotPathRM)

WebUI.delay(5)

WebUI.click(findTestObject('BRINESIA UI/Tableau/Menu Default/btnBack'))

