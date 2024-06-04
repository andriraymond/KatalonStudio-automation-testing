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

WebUI.callTestCase(findTestCase('00. General/00.1 Splashscreen'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01. Auth/01.1 Login/01.1 btnRegister'), 0)

Mobile.setText(findTestObject('01. Auth/01.2 Register/01.2 Register Form/01.2 inpUsername'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('01. Auth/01.2 Register/01.2 Register Form/01.2 inpNoWhatsapp'), GlobalVariable.noWhatsapp, 
    0)

Mobile.setText(findTestObject('01. Auth/01.2 Register/01.2 Register Form/01.2 inpEmail'), GlobalVariable.email, 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('01. Auth/01.2 Register/01.2 Register Form/01.2 inpPassword'), GlobalVariable.password, 0)

Mobile.setText(findTestObject('01. Auth/01.2 Register/01.2 Register Form/01.2 inpPasswordConfirmation'), GlobalVariable.passwordConfirmation, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 Register Form/01.2 btnSignUp'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

deviceHeight = Mobile.getDeviceHeight()

deviceWidth = Mobile.getDeviceWidth()

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 Term and Conditions/01.2 termsAndConditionsSection'), 0)

Mobile.scrollToText('Ketentuan Penggunaan (Terms of Use) Layanan muatmuat', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 Term and Conditions/01.2 checkBox1'), 0)

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 Term and Conditions/01.2 checkBox2'), 0)

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 Term and Conditions/01.2 btnNext'), 0)

deviceHeight = Mobile.getDeviceHeight()

deviceWidth = Mobile.getDeviceWidth()

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 User Privacy Policy/01.2 pricayPolicySection'), 0)

Mobile.scrollToText('Kebijakan Privasi (Privacy Policy) Layanan muatmuat', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 User Privacy Policy/01.2 checkBox1'), 0)

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 User Privacy Policy/01.2 checkBox2'), 0)

Mobile.tap(findTestObject('01. Auth/01.2 Register/01.2 User Privacy Policy/01.2 btnNext'), 0)

