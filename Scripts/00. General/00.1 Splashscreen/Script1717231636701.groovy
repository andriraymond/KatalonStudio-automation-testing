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

//Mobile.startExistingApplication(GlobalVariable.appPath)
Mobile.verifyElementVisible(findTestObject('00. General/00.1 Splashscreen/00.1 splashScreenSection'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('00. General/00.1 Splashscreen/00.1 skipButton'), 0)

Mobile.tap(findTestObject('00. General/00.1 Splashscreen/00.1 btnSignIn'), 0)

deviceHeight = Mobile.getDeviceHeight()

deviceWidth = Mobile.getDeviceWidth()

//Mobile.scrollToText('Kebijakan Privasi (Privacy Policy) Layanan muatmuat', FailureHandling.STOP_ON_FAILURE)
Mobile.scrollToText('Kebijakan Privasi (Privacy Policy) Layanan muatmuat', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('00. General/00.2 privacyPolicy/00.2 checkBox1'), 0)

Mobile.tap(findTestObject('00. General/00.2 privacyPolicy/00.2 checkBox2'), 0)

Mobile.tap(findTestObject('00. General/00.2 privacyPolicy/00.2 btnNext'), 0)

