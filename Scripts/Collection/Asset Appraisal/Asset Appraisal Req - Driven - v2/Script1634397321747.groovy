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
WebUI.setText(findTestObject('Login/username'), usernameINV)

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
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 10)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.delay(1)


//select menu asset appraisal req
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_inventory_management_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_inventory_management_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_inventory_management_menu'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_inventory_management_menu'), '402', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/menu_appraisal_request'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/menu_appraisal_request'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/menu_appraisal_request'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/menu_appraisal_request'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu_asset_appraisal_request'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu_asset_appraisal_request'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu_asset_appraisal_request'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_menu_asset_appraisal_request'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_edit_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_edit_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_edit_data'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_edit_data'))
WebUI.delay(1)


//asset appraisal req process
//WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_market_price'), 0)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_market_price'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_market_price'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_market_price'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_market_price'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_office_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_office_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_office_name'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_office_name'), '218', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_office_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_office_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_office_name'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_office_name'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_asset'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_asset'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_asset'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_asset'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_deduction'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_deduction'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_deduction'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_deduction'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_deduction_item'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_deduction_item'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_deduction_item'))
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_deduction_item'), '%')

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_deduction'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_deduction'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_deduction'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_search_deduction'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_deduction_item'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_deduction_item'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_deduction_item'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_deduction_item'))
WebUI.delay(1)

//WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_calculate'))
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_min_selling_amount'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_min_selling_amount'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_min_selling_amount'))
WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_min_selling_amount'), 0)
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_min_selling_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_min_selling_amount'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_min_selling_amount'), minSelling)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_reason_description'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_reason_description'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_reason_description'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_reason_description'), '461', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_approve_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_approve_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_approve_by'))
//WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_approve_by'), approvedBy, false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/select_approve_by'), approvedBy, false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_approval_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_approval_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_approval_notes'))
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/field_approval_notes'), notes)
WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_calculate'), 0)
WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/search_market_price'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_calculate'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_calculate'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_submit'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Req/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

