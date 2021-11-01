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


//select role
WebUI.waitForElementPresent(findTestObject('Delivery Order/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('Delivery Order/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('Delivery Order/select_role'))
WebUI.click(findTestObject('Delivery Order/select_role'))
WebUI.delay(1)


//ACCESS MENU CUSTOMER CONFIRMATION
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))
WebUI.click(findTestObject('Object Repository/Customer Confirmation/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/a_Customer Confirmation'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/a_Customer Confirmation'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/a_Customer Confirmation'))
WebUI.click(findTestObject('Object Repository/Customer Confirmation/a_Customer Confirmation'))
WebUI.delay(1)


//INPUT CUSTOMER APP NUMBER
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'))
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 
    appNumber)

WebUI.click(findTestObject('Object Repository/Customer Confirmation/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/input_MULTIGUNA NON PAKET_gvCustConfirmatio_98963a'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/input_MULTIGUNA NON PAKET_gvCustConfirmatio_98963a'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/input_MULTIGUNA NON PAKET_gvCustConfirmatio_98963a'))
WebUI.click(findTestObject('Object Repository/Customer Confirmation/input_MULTIGUNA NON PAKET_gvCustConfirmatio_98963a'))
WebUI.delay(1)


//CUSTOMER CONFIRMATION PROCESS
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/input_Contact Person Name_txtCntctPerson'))
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), 'Yayan Ruhiyan')

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 'FATHER', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'))
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), '01/01/2021')
WebUI.sendKeys(findTestObject('Object Repository/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/textarea_Notes_txtNotes'))
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/textarea_Notes_txtNotes'), 'Notes')

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer Confirmation/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Confirmation/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer Confirmation/a_Submit'))
WebUI.click(findTestObject('Object Repository/Customer Confirmation/a_Submit'))
WebUI.delay(3)


//CLOSING BROWSER
WebUI.closeBrowser()

