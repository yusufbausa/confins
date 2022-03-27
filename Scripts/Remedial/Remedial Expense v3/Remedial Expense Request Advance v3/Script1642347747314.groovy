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
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_select'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_select'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_select'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_select'))
WebUI.delay(1)


//select menu remedial expense request
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_menu_remedial'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_menu_remedial'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_menu_remedial'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_menu_remedial'), 
	'REMEDIAL', false)

WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu_remedial_expense'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu_remedial_expense'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu_remedial_expense'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/menu_remedial_expense_request'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/menu_remedial_expense_request'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/menu_remedial_expense_request'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/menu_remedial_expense_request'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_agreement_no'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_agreement_no'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_agreement_no'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_agreement_no'), 
	agreeNo)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_coll_bucket_name'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_coll_bucket_name'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_coll_bucket_name'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_coll_bucket_name'), 
	collBucketName, false)

WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_action'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_action'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_action'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_action'))
WebUI.delay(1)


//remedial expense request process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'))
//WebUI.scrollToElement(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'), 0)
//WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'),
	extFee)
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'), Keys.chord(Keys.TAB))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'), 
	settlementFee)
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'), Keys.chord(Keys.TAB))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'), 
	mobilizationFee)
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'), Keys.chord(Keys.TAB))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'), 
	deliveryCharges)
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'), Keys.chord(Keys.TAB))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'),  
	repossessionFee)
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_problem_type'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_problem_type'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_problem_type'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_problem_type'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_problem_type'), 
    'P06', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_holder'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_holder'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_holder'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_holder'), 
    'Customer', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_location'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_location'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_location'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_location'), 
    'REM_ULOC_IN_CITY', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_analysis'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_analysis'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_analysis'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_analysis'), 
    notes)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_calculate'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_calculate'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_handling_type'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_handling_type'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_handling_type'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_handling_type'), 
    handlingType, false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_executor'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_executor'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_executor'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_executor'), 
    executor, false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_action'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_action'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_action'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_action'), 
    notes)

WebUI.waitForElementPresent(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Remedial Expense Request Advance v3/check_advance_settlement'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Remedial Expense Request Advance v3/check_advance_settlement'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Remedial Expense Request Advance v3/check_advance_settlement'))
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Remedial Expense Request Advance v3/check_advance_settlement'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_remedial_expense'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_remedial_expense'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_remedial_expense'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_remedial_expense'), 
    notes)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_reason'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_reason'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_reason'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_reason'), 
    'BIAYA PENYELESAIAN', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_approved_by'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_approved_by'), 
    approvedBy, false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_approval_request'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_approval_request'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_approval_request'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_approval_request'), 
    notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_submit'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_submit'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_submit'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

