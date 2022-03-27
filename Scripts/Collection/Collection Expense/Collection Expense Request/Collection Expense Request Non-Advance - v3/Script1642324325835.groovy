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
WebUI.setText(findTestObject('Login/username'), usernameCollector)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu collection expense
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_menu'))
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_menu_collection'), '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/menu_collection_expense'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/menu_collection_expense'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/menu_collection_expense'))
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/menu_collection_expense'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_collection_expense_request'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_collection_expense_request'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_collection_expense_request'))
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_collection_expense_request'))
WebUI.delay(1)


//input customer credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_agreement_no'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_agreement_no'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_agreement_no'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_agreement_no'), 
    agreeNo)

WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_action'))
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_action'))
WebUI.delay(1)


//collection expense request process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'), extFee)


WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'), settlementFee)


WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'), mobilizationFee)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'), deliveryCharges)


WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'), repossessionFee)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_problem_type'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_problem_type'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_problem_type'))
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_problem_type'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_problem_type'), 
    'P04', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_holder'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_holder'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_holder'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_holder'), 
    'Customer', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_location'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_location'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_location'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_location'), 
    'COLL_ULOC_IN_CITY', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_analysis'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_analysis'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_analysis'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_analysis'), 
    notes)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_calculate'))
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_calculate'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_handling_type'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_handling_type'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_handling_type'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_handling_type'), 
    'Repossession', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_executor'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_executor'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_executor'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_executor'), 
    'AJI KURNIAWAN (Internal)', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_action'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_action'), 
    notes)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_disburse_to'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_disburse_to'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_disburse_to'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_disburse_to'), 
    disburseTo)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_coll_expense'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_coll_expense'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_coll_expense'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_coll_expense'), 
    notes)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_bank_name'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_bank_name'), 
    'BANK CENTRAL ASIA', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_number'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_number'), 
    accountNo)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_bank_branch'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_bank_branch'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_bank_branch'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_bank_branch'), 
    bankBranch)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_name'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_account_name'), 
    accountName)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_reason'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_reason'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_reason'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_reason'), 
    'BIAYA PENYELESAIAN', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_approved_by'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_approved_by'), 
    approvedBy, false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_approval_req'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_approval_req'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_approval_req'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_approval_req'), 
    notes)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_submit'))
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

