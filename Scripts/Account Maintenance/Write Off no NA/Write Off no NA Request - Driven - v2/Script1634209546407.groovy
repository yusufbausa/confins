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
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameOpsDev)

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
WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_role'))
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_role'))
WebUI.delay(1)


//select menu WO NA Request
WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu'))
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_menu_account_maintenance'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_menu_account_maintenance'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_menu_account_maintenance'))
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_menu_account_maintenance'), '80', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/menu_write_off'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/menu_write_off'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/menu_write_off'))
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/menu_write_off'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu_write_off_no_na_req'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu_write_off_no_na_req'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu_write_off_no_na_req'))
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_menu_write_off_no_na_req'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_office_name'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_office_name'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_office_name'))
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_office_name'), '218', false)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_agreement_number'))
WebUI.setText(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_search'))

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_write_off'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_write_off'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_write_off'))
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_write_off'))
WebUI.delay(1)


//WO NA Process
WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_reason_description'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_reason_description'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_reason_description'))
WebUI.scrollToElement(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_reason_description'), 10)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_reason_description'), '362', false)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_approved_by'))
//WebUI.selectOptionByValue(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_approved_by'), approvedBy, false)
WebUI.selectOptionByLabel(findTestObject('PAYMENT/Write Off/Write Off no NA Req/select_approved_by'), approvedBy, false)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_notes'))
WebUI.setText(findTestObject('PAYMENT/Write Off/Write Off no NA Req/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_submit'))
WebUI.click(findTestObject('PAYMENT/Write Off/Write Off no NA Req/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

