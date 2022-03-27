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
WebUI.setText(findTestObject('Login/username'), usernameCollector)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select menu collection expense
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_menu'))
//WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_menu_collection'),
	'270', false)
//WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/menu_collection_expense'))
//WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_collection_expense_request'))
//WebUI.delay(1)
	
	
//input customer credential
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_agreement_no'),
	agreeNo)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_search'))
//WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_action'))
WebUI.delay(1)
	
	
//collection expense request process
WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'), 0)

WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'), extFee)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_ext_fee'), Keys.chord(Keys.TAB))
	
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'), settlementFee)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_settlement_fee'), Keys.chord(Keys.TAB))
	
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'), mobilizationFee)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_mobilization_fee'), Keys.chord(Keys.TAB))
	
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'), deliveryCharges)
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_delivery_charges'), Keys.chord(Keys.TAB))
	
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_other_repossession_fee'), repossessionFee)
WebUI.delay(1)
	
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_problem_type'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_problem_type'),
	'P06', false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_holder'),
	'Customer', false)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_unit_location'),
	'COLL_ULOC_IN_CITY', false)
//WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_analysis'),
//    notes)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_calculate'))
WebUI.delay(3)
	
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_handling_type'),
	handlingType, false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_executor'),
	'AJI KURNIAWAN (Internal)', false)
//WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_action'),
//    notes)
WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request Advance v3/check_advance_settlement'))
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_reason'),
	'BIAYA PENYELESAIAN', false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/select_approved_by'),
	approvedBy, false)
WebUI.setText(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/field_notes_approval_req'),
	notes)

WebUI.click(findTestObject('COLLECTION/Collection Expense v3/Collection Expense Request v3/btn_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()
	
	
