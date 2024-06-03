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

WebUI.callTestCase(findTestCase('01. Auth/01.1 Login/01.1 Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03. cardTransportMarket'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1 cardLelangMuatan'), 0)

WebUI.delay(5)

Mobile.takeScreenshot(GlobalVariable.pathScreenshots + 'LelangMuatan01.png')

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1 closeTooltip'), 0)

Mobile.takeScreenshot(GlobalVariable.pathScreenshots + 'LelangMuatan02.png')

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1 closeTooltips'), 0)

Mobile.takeScreenshot(GlobalVariable.pathScreenshots + 'LelangMuatan03.png')

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1 tabRiwayat'), 0)

Mobile.takeScreenshot(GlobalVariable.pathScreenshots + 'LelangMuatan04.png')

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1 tabAktif'), 0)

Mobile.takeScreenshot(GlobalVariable.pathScreenshots + 'LelangMuatan05.png')

WebUI.delay(5)

