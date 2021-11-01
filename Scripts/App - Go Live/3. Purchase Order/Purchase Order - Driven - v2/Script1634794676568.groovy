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
WebUI.delay(2)


//INPUT CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernamePO)

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
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_select_profile'))
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//ACCESSING MENU PURCHASE ORDER
WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.click(findTestObject('Object Repository/Purchase Order/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/a_Purchase Order Agreement'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/a_Purchase Order Agreement'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/a_Purchase Order Agreement'))
WebUI.click(findTestObject('Object Repository/Purchase Order/a_Purchase Order Agreement'))
WebUI.delay(1)


//INPUTING CUSTOMER CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlA_0ac7d2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlA_0ac7d2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlA_0ac7d2'))
WebUI.setText(findTestObject('Object Repository/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlA_0ac7d2'), appNumber)

WebUI.click(findTestObject('Object Repository/Purchase Order/input_Task Claim By_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'))
WebUI.click(findTestObject('Object Repository/Purchase Order/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'))
WebUI.delay(1)


//PURCHASE ORDER PROCESS
WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'))
WebUI.scrollToElement(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'), 2)
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'))
WebUI.click(findTestObject('Object Repository/Purchase Order/input_Jl. M.H. Thamrin No. 9, Kebon Nanas, _25e7f1'))
WebUI.waitForPageLoad(5)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/a_Save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/a_Save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/a_Save'))
WebUI.click(findTestObject('Object Repository/Purchase Order/a_Save'))
WebUI.delay(25)

WebUI.waitForElementPresent(findTestObject('Object Repository/Purchase Order/a_Submit'), 300)
WebUI.verifyElementPresent(findTestObject('Object Repository/Purchase Order/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Purchase Order/a_Submit'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Purchase Order/a_Submit'))
WebUI.click(findTestObject('Object Repository/Purchase Order/a_Submit'))
WebUI.delay(3)


//CLOSING BROWSER
WebUI.closeBrowser()

