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

//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameGL)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT PROFILE
WebUI.waitForElementPresent(findTestObject('Object Repository/Document Checklist/a_Select'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Checklist/a_Select'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Checklist/a_Select'))
WebUI.click(findTestObject('Object Repository/Document Checklist/a_Select'))
WebUI.delay(1)


//ACCESS MENU GO LIVE
WebUI.waitForElementPresent(findTestObject('Object Repository/Go Live/img_Welcome, SUGIHARTINI, TANGERANG, Servic_90353b'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Go Live/img_Welcome, SUGIHARTINI, TANGERANG, Servic_90353b'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Go Live/img_Welcome, SUGIHARTINI, TANGERANG, Servic_90353b'))
WebUI.click(findTestObject('Object Repository/Go Live/img_Welcome, SUGIHARTINI, TANGERANG, Servic_90353b'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Go Live/a_Go Live'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Go Live/a_Go Live'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Go Live/a_Go Live'))
WebUI.click(findTestObject('Object Repository/Go Live/a_Go Live'))
WebUI.delay(1)


//INPUT CUSTOMER APP NUMBER
WebUI.waitForElementPresent(findTestObject('Object Repository/Go Live/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Go Live/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Go Live/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'))
WebUI.setText(findTestObject('Object Repository/Go Live/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), appNumber)

WebUI.click(findTestObject('Object Repository/Go Live/input_Task Claim By_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Go Live/input_MULTIGUNA NON PAKET_gvGoLivectl02ibGoLive'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Go Live/input_MULTIGUNA NON PAKET_gvGoLivectl02ibGoLive'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Go Live/input_MULTIGUNA NON PAKET_gvGoLivectl02ibGoLive'))
WebUI.click(findTestObject('Object Repository/Go Live/input_MULTIGUNA NON PAKET_gvGoLivectl02ibGoLive'))
WebUI.delay(1)


//GO LIVE PROCESS
WebUI.waitForElementPresent(findTestObject('Object Repository/Go Live/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Go Live/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Go Live/textarea_Notes_txtNotes'))
WebUI.setText(findTestObject('Object Repository/Go Live/textarea_Notes_txtNotes'), 'Congratulation')

WebUI.waitForElementPresent(findTestObject('Object Repository/Go Live/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Go Live/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Go Live/a_Submit'))
WebUI.click(findTestObject('Object Repository/Go Live/a_Submit'))
WebUI.delay(3)

//CLOSING BROWSER
WebUI.closeBrowser()

