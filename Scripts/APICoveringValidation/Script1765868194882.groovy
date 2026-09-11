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

def identitas = GlobalVariable.NoIdentitas

def plafon = GlobalVariable.Plafon

def NominalObjekPertanggungan = GlobalVariable.NominalObjekPertanggungan

def tanggal_akhir = GlobalVariable.TanggalAkhir

def tanggal_Mulai = GlobalVariable.TanggalMulai
def NP2K = GlobalVariable.np2kfinal 

def norekpin = org.apache.commons.lang.RandomStringUtils.randomNumeric(15)
println('norekpinnya:' + norekpin)


def norekpinGlobalVariable = GlobalVariable.NoRekeningPinjaman = norekpin	


println('Global Variable ::  ' + norekpinGlobalVariable)

// ===== PRINT GLOBAL VARIABLE =====
println('GLOBAL Validation Identitas:' + identitas)

println('GLOBAL Plafon :' + plafon)

println('GLOBAL ObjekPertanguggan:' + NominalObjekPertanggungan)

println('GLOBAL Tanggal awal:' + tanggal_Mulai)

println('GLOBAL Tanggal Akhir:' + tanggal_akhir)

println('Global NP2K '+ NP2K)

RequestObject request = findTestObject(
	'CoveringValidation/177',
	[('NomorIdentitas'): identitas , 
		('plafon') : plafon , ('tanggal_Mulai'): tanggal_Mulai , ('tanggal_akhir'): tanggal_akhir ,
		 ('NominalObjekPertanggungan') : plafon , ('NP2Knih') : NP2K ,('norekpin') : norekpin ])

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



