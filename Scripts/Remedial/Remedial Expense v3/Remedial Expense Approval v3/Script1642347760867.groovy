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
WebUI.setText(findTestObject('Login/username'), usernameRAH1)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role remedial area 1
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_role'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_role'))
WebUI.delay(1)


//select menu remedial expense approval
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_menu'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_menu'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_menu'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_menu_remedial'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_menu_remedial'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_menu_remedial'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_menu_remedial'), 
    'REMEDIAL', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense_approval'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense_approval'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense_approval'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/menu_remedial_expense_approval'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_agreement_no'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_agreement_no'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_agreement_no'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_agreement_no'), 
    agreeNo)

WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_process'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_process'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_process'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_process'))
WebUI.delay(1)


//remedial expense approval process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_action'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_action'), 
    'Approve', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_notes'))
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/field_notes'), 
    notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_submit'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_submit'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_submit'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/btn_submit'))
WebUI.delay(10)


//close browser
WebUI.closeBrowser()

