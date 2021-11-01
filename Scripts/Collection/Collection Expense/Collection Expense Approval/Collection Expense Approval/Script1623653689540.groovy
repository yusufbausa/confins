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


//input credential
WebUI.setText(findTestObject('Login/username'), 'ITW0341')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_role'))
WebUI.delay(1)


//select menu collection expense approval
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_menu_collection'), 
    '270', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/menu_collection_expense'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_menu_collection_expense_approval'))
WebUI.delay(3)


//input cust credential (agreement number)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_agreement_number'), 
    '1903100310')
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_process'))
WebUI.delay(3)


//collection expense approval process
WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 0)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/field_notes'), 
    'notes')
WebUI.click(findTestObject('COLLECTION/Collection Expense/Collection Expense Approval/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

