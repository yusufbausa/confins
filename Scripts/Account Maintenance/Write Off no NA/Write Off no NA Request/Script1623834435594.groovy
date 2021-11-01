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


//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'YUH1851')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_role'))
WebUI.delay(3)


//select menu WO NA Request
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_menu_account_maintenance'), 
    '80', false)
WebUI.delay(1)
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/menu_write_off'))
WebUI.delay(1)
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu_write_off_no_na_req'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_office_name'), 
    '218', false)
WebUI.setText(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_agreement_number'), 
    '2118005156')
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_write_off'))
WebUI.delay(3)


//WO NA Process
WebUI.scrollToElement(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_reason_description'), 0)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_reason_description'), 
    '362', false)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_approved_by'), 
    '307783', false)
WebUI.setText(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_notes'), 
    'notes')
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_submit'))
WebUI.delay(1)


//close browser
WebUI.closeBrowser()
