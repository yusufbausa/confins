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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'REP1529')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Delivery Order/a_Select'))
WebUI.delay(3)


//SELECT MENU CUSTOMER CONFIRMATION================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/img_Welcome, RACHMAH ESTI PALUPI, FLEET JAK_8d1f45'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Customer Confirmation'))
WebUI.delay(3)


//INPUT CUSTOMER CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 
    '0021APP20210300040')
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/input_FLEET BUSINESS VEHICLE NONPAKET_gvCus_f7c8c2'))
WebUI.delay(3)


//CUSTOMER CONFIRMATION PROCESS================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), 
    'Alexandre One')
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 
    'BRTHR', false)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), 
    '01/02/2021')
WebUI.setText(findTestObject('Object Repository/FLEET/Customer Confirmation/textarea_Notes_txtNotes'), 'confirmed')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Customer Confirmation/a_Submit'))
WebUI.delay(3)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

