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

Mobile.startExistingApplication('com.azlogistik.muatmuat&hl=en-ID')

Mobile.setText(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.EditText'), 
    'uuu', 0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.Button'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.view.View'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.Button'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.view.View (7)'), 
    0)

Mobile.setText(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.EditText (1)'), 
    'Graha Airi ', 0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.ImageView'), 
    0)

Mobile.setText(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.EditText'), 
    'AiriMart', 0)

Mobile.setText(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.EditText'), 
    'Juan', 0)

Mobile.setText(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.EditText (2)'), 
    '000000009', 0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.ImageView (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.Button'), 
    0)

Mobile.setText(findTestObject('Object Repository/01. Login/01. inpUsername'), '06/01/2024', 0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.Button'), 
    0)

Mobile.setText(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.EditText - 23'), 
    '15', 0)

Mobile.setText(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.EditText - 08'), 
    '30', 0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.Button (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.view.View (8)'), 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.Button'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.view.View (7)'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.ImageView (4)'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.ImageView (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/03. Transport Market/03.1 Lelang Muatan/03.1.1 BuatLelangMuatan/android.widget.Button'), 
    0)

Mobile.closeApplication()

