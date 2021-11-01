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
WebUI.delay(1)


//INPUT CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameDS)

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


//ACCESSING MENU DOCUMENT SIGNER
WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.click(findTestObject('Object Repository/Document Signer/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/a_Document Signer'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/a_Document Signer'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/a_Document Signer'))
WebUI.click(findTestObject('Object Repository/Document Signer/a_Document Signer'))
WebUI.delay(1)


//INPUT CUSTOMER CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'))
WebUI.setText(findTestObject('Object Repository/Document Signer/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    appNumber)

WebUI.click(findTestObject('Object Repository/Document Signer/input_Task Claim By_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'))
WebUI.click(findTestObject('Object Repository/Document Signer/input_MULTIGUNA NON PAKET_gvAgrmntctl02imbEdit'))
WebUI.delay(1)

//DOCUMENT SIGNER PROCESS
WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/input_Company Officer Name 2_uclOfficeEmp2u_cad8a5'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/input_Company Officer Name 2_uclOfficeEmp2u_cad8a5'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/input_Company Officer Name 2_uclOfficeEmp2u_cad8a5'))
WebUI.click(findTestObject('Object Repository/Document Signer/input_Company Officer Name 2_uclOfficeEmp2u_cad8a5'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/input_Employee Name_uclOfficeEmp2uclOfficeE_0e9c0b'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/input_Employee Name_uclOfficeEmp2uclOfficeE_0e9c0b'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/input_Employee Name_uclOfficeEmp2uclOfficeE_0e9c0b'))
WebUI.setText(findTestObject('Object Repository/Document Signer/input_Employee Name_uclOfficeEmp2uclOfficeE_0e9c0b'), '%')

WebUI.click(findTestObject('Object Repository/Document Signer/a_SEARCH'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/a_Select (1)'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/a_Select (1)'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/a_Select (1)'))
WebUI.click(findTestObject('Object Repository/Document Signer/a_Select (1)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Document Signer/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Document Signer/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Document Signer/a_Submit'))
WebUI.click(findTestObject('Object Repository/Document Signer/a_Submit'))
WebUI.delay(3)


//CLOSING BROWSER
WebUI.closeBrowser()

