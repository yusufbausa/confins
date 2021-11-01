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
WebUI.setText(findTestObject('Login/username'), username)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select profile
WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_profile'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_profile'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_profile'))
WebUI.delay(1)


//select menu waived transaction
WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_menu_account_maintenance'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_menu_account_maintenance'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_menu_account_maintenance'))
WebUI.selectOptionByValue(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_menu_account_maintenance'), '80', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/menu_waived_transaction'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/menu_waived_transaction'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/menu_waived_transaction'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/menu_waived_transaction'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu_waived_request'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu_waived_request'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu_waived_request'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu_waived_request'))
WebUI.delay(1)


//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_agreement_number'))
WebUI.setText(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_search'))

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_edit_data'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_edit_data'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_edit_data'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_edit_data'))
WebUI.delay(1)


//waived transaction request process
WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/radio_select_percent'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/radio_select_percent'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/radio_select_percent'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/radio_select_percent'))

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'))
WebUI.sendKeys(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'), waivePercent)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_calculate'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_calculate'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_reason_description'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_reason_description'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_reason_description'))
WebUI.selectOptionByValue(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_reason_description'), '364', false)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_approved_by'))
//WebUI.selectOptionByValue(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_approved_by'), approvedBy, false)
WebUI.selectOptionByLabel(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_approved_by'), approvedBy, false)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_notes'))
WebUI.setText(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_submit'))
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

