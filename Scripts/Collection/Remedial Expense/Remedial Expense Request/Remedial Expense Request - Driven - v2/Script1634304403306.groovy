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


//select role
WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_role'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_role'))
WebUI.delay(1)


//select menu remedial expense request
WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_menu_remedial'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_menu_remedial'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_menu_remedial'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_menu_remedial'), '303', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/menu_remedial_expense'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/menu_remedial_expense'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/menu_remedial_expense'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/menu_remedial_expense'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu_remedial_expense_request'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu_remedial_expense_request'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu_remedial_expense_request'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_menu_remedial_expense_request'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_agreement_number'), agreeNo)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_coll_bucket'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_coll_bucket'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_coll_bucket'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_coll_bucket'), '3', false)

WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_action'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_action'))
WebUI.delay(1)


//remedial expense request process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_disburse_to'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_disburse_to'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_disburse_to'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_disburse_to'), disburseTo)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason'), '238', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_expense_request_amount'), expenseAmount)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_bank_name'))
WebUI.scrollToElement(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_bank_name'), 10)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_bank_name'), '9', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_bank_branch'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_bank_branch'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_bank_branch'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_bank_branch'), bankBranch)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_no'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_no'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_no'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_no'), accountNo)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_name'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_name'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_name'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_account_name'), accountName)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason_description'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason_description'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason_description'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_reason_description'), '237', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_approved_by'))
//WebUI.selectOptionByValue(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_approved_by'), approvedBy, false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/select_approved_by'), approvedBy, false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes_approval'))
WebUI.setText(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/field_notes_approval'), approvalNotes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_submit'))
WebUI.click(findTestObject('COLLECTION/Remedial Expense/Remedial Expense Request/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

