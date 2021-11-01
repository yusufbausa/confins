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
WebUI.setText(findTestObject('Login/username'), usernameARH)

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
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'))
WebUI.delay(1)


//select menu appraisal approval (homepage)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_menu_appraisal_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_menu_appraisal_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_menu_appraisal_approval'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_menu_appraisal_approval'))
WebUI.delay(1)


//APPROVAL 1
//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'))
WebUI.delay(1)


//appraisal approval process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'))
WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 10)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'))
WebUI.delay(3)

//==============================================================================================================================================================================================================================

//APPROVAL 2
//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'))
WebUI.delay(1)


//appraisal approval process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'))
WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 10)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'))
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

