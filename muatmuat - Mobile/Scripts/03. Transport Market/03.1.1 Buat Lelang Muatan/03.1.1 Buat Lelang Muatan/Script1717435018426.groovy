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

WebUI.callTestCase(findTestCase('03. Transport Market/03.1 Lelang Muatan'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.startExistingApplication(GlobalVariable.appPath)
Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1 bottomNavigationPlus'), 0)

Mobile.tap(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 iconStartDate'), 0)

Mobile.tap(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 iconPencil'), 0)

Mobile.setText(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 inpDate'), GlobalVariable.startDate, 
    0)

Mobile.tap(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 btnOK'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 inpEndDate'), 0)

Mobile.tap(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 iconPencil'), 0)

Mobile.setText(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 inpDate'), GlobalVariable.endDate, 
    0)

Mobile.tap(findTestObject('03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/03.1.1 btnOK'), 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 
    '5', 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 
    'Test', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 
    'Graha Airi ', 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 
    'AiriMart', 0)

Mobile.setText(findTestObject('null'), 
    'Juan', 0)

Mobile.setText(findTestObject('null'), 
    '000000009', 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('Object Repository/01. Login/01. inpUsername'), GlobalVariable.startDate, 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.setText(findTestObject('null'), 
    '15', 0)

Mobile.setText(findTestObject('null'), 
    '30', 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('null'), 
    0)

