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


//OPEN BROWSER================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameCC)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Delivery Order/a_Select'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Delivery Order/a_Select'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Delivery Order/a_Select'))
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Select'))
WebUI.delay(1)


//SELECT MENU CUSTOMER CONFIRMATION================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/img_Welcome, RACHMAH ESTI PALUPI, FLEET JAK_8d1f45'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/img_Welcome, RACHMAH ESTI PALUPI, FLEET JAK_8d1f45'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/img_Welcome, RACHMAH ESTI PALUPI, FLEET JAK_8d1f45'))
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/img_Welcome, RACHMAH ESTI PALUPI, FLEET JAK_8d1f45'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Customer Confirmation'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Customer Confirmation'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Customer Confirmation'))
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Customer Confirmation'))
WebUI.delay(1)


//INPUT CUSTOMER CREDENTIAL================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'))
WebUI.setText(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), appNo)

WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Task Claim By_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_FLEET BUSINESS VEHICLE NONPAKET_gvCus_f7c8c2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_FLEET BUSINESS VEHICLE NONPAKET_gvCus_f7c8c2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/input_FLEET BUSINESS VEHICLE NONPAKET_gvCus_f7c8c2'))
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/input_FLEET BUSINESS VEHICLE NONPAKET_gvCus_f7c8c2'))
WebUI.delay(1)


//CUSTOMER CONFIRMATION PROCESS================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Contact Person Name_txtCntctPerson'))
WebUI.setText(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), contactName)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 'BRTHR', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), date)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/textarea_Notes_txtNotes'))
WebUI.setText(findTestObject('Object Repository/FLEET/Customer Confirmation/textarea_Notes_txtNotes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Submit'))
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Submit'))
WebUI.delay(3)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

