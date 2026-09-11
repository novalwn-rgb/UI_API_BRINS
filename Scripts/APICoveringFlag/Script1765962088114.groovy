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
import groovy.json.JsonSlurper as JsonSlurper
import groovy.json.JsonOutput as JsonOutput
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.util.KeywordUtil



def FID = GlobalVariable.FID
def norekpin = GlobalVariable.NoRekeningPinjaman

println('Tarikan Global variable dari validation ke flag :: ' + norekpin)
def identitas = GlobalVariable.NoIdentitas

println('ini FID LEMPARAN BUAT VLAG :: '  + FID)

println(identitas)


// ===== REQUEST =====
RequestObject request = findTestObject('null',[('NomorIdentitas'): identitas, ('norekpin'): norekpin , ('fid') : FID])

def reqPretty = JsonOutput.prettyPrint(
	JsonOutput.toJson(new JsonSlurper().parseText(request.getBodyContent().getText()))
)


KeywordUtil.logInfo("REQUEST BODY:\n${reqPretty}")

// ===== SEND =====
def response = WS.sendRequest(request)

// ===== RESPONSE =====
def resJson = new JsonSlurper().parseText(response.getResponseBodyContent())
def resPretty = JsonOutput.prettyPrint(JsonOutput.toJson(resJson))

KeywordUtil.logInfo("RESPONSE BODY:\n${resPretty}")