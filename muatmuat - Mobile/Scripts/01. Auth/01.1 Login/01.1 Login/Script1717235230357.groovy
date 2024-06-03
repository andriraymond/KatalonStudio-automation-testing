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

Mobile.startExistingApplication(GlobalVariable.appPath)

//WebUI.callTestCase(findTestCase('00. General/00.1 Splashscreen'), [:], FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Date today = new Date()

String todaysDate = today.format('mm_dd_yy')

String nowTime = today.format('hh_mm_ss')

Mobile.tap(findTestObject('00. General/00. btnLogin'), 0)

WebUI.delay(1)

Mobile.setText(findTestObject('01. Auth/01.1 Login/01.1 inpUsername'), GlobalVariable.email, 0)

Mobile.setText(findTestObject('01. Auth/01.1 Login/01.1 inpPassword'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('01. Auth/01.1 Login/01.1 iconEyess'), 0)

Mobile.takeScreenshot(((GlobalVariable.pathScreenshots + todaysDate) + nowTime) + '.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01. Auth/01.1 Login/01.1 iconEyess'), 0)

//Mobile.takeScreenshot(((pathScreenshots + todaysDate) + nowTime) + '.png')
Mobile.hideKeyboard()

Mobile.tap(findTestObject('01. Auth/01.1 Login/01.1 btnSignIn'), 0)

WebUI.delay(2)

