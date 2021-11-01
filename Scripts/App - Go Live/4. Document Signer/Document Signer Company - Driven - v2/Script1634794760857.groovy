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


//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameDS)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT PROFILE
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_select_profile'))
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//select menu doc signer
WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/button_menu'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/btn_menu_doc_signer'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/btn_menu_doc_signer'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/btn_menu_doc_signer'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/btn_menu_doc_signer'))
WebUI.delay(1)


//input cust credential (app number)
WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/field_app_number'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/field_app_number'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/field_app_number'))
WebUI.setText(findTestObject('Document Signer/Document Signer Company/field_app_number'), appNumber)

WebUI.click(findTestObject('Document Signer/Document Signer Company/button_search'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/button_entry'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/button_entry'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/button_entry'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/button_entry'))
WebUI.delay(1)


//doc signer process
WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/select_company_officer2'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/select_company_officer2'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/select_company_officer2'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/select_company_officer2'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/field_employee_name'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/field_employee_name'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/field_employee_name'))
WebUI.setText(findTestObject('Document Signer/Document Signer Company/field_employee_name'), '%')

WebUI.click(findTestObject('Document Signer/Document Signer Company/btn_search_employee'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/select_employee'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/select_employee'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/select_employee'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/select_employee'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/select_mannagement'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/select_mannagement'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/select_mannagement'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/select_mannagement'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/field_commisioner_name'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/field_commisioner_name'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/field_commisioner_name'))
WebUI.setText(findTestObject('Document Signer/Document Signer Company/field_commisioner_name'), '%')

WebUI.click(findTestObject('Document Signer/Document Signer Company/button_search_commisioner'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/select_commisioner'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/select_commisioner'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/select_commisioner'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/select_commisioner'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/select_cust_commisiioner_approver'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/select_cust_commisiioner_approver'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/select_cust_commisiioner_approver'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/select_cust_commisiioner_approver'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/field_commisioner_approver_name'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/field_commisioner_approver_name'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/field_commisioner_approver_name'))
WebUI.setText(findTestObject('Document Signer/Document Signer Company/field_commisioner_approver_name'), '%')

WebUI.click(findTestObject('Document Signer/Document Signer Company/btn_search_commisioner_approver'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/select_commisioner_approver'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/select_commisioner_approver'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/select_commisioner_approver'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/select_commisioner_approver'))

WebUI.waitForElementPresent(findTestObject('Document Signer/Document Signer Company/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Document Signer/Document Signer Company/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('Document Signer/Document Signer Company/button_submit'))
WebUI.click(findTestObject('Document Signer/Document Signer Company/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

