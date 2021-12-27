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


//OPEN BROWSER========================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameCR)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company/select_role'))
WebUI.click(findTestObject('Credit Review/Credit Review Company/select_role'))
WebUI.delay(1)


//SELECT MENU CREDIT REVIEW========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/button_menu'))
WebUI.click(findTestObject('Credit Review/Credit Review Company v2/button_menu'))

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/btn_menu_credit_review'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/btn_menu_credit_review'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/btn_menu_credit_review'))
WebUI.click(findTestObject('Credit Review/Credit Review Company v2/btn_menu_credit_review'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL (APP NUMBER)========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_app_number'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_app_number'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/field_app_number'))
WebUI.setText(findTestObject('Credit Review/Credit Review Company v2/field_app_number'), appNo)

WebUI.click(findTestObject('Credit Review/Credit Review Company v2/button_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/button_review'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/button_review'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/button_review'))
WebUI.click(findTestObject('Credit Review/Credit Review Company v2/button_review'))
WebUI.delay(1)


//CREDIT REVIEW PROCESS========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/tab_approval_recommendation'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/tab_approval_recommendation'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/tab_approval_recommendation'))
WebUI.click(findTestObject('Credit Review/Credit Review Company v2/tab_approval_recommendation'))

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/select_reason'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/select_reason'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/select_reason'))
WebUI.selectOptionByValue(findTestObject('Credit Review/Credit Review Company v2/select_reason'), '158', false)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/select_to_be_approved_by'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/select_to_be_approved_by'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/select_to_be_approved_by'))
WebUI.selectOptionByLabel(findTestObject('Credit Review/Credit Review Company v2/select_to_be_approved_by'), approvedBy, false)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/field_notes'))
WebUI.setText(findTestObject('Credit Review/Credit Review Company v2/field_notes'), notes)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_latar_belakang_debitur'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_latar_belakang_debitur'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/field_latar_belakang_debitur'))
WebUI.setText(findTestObject('Credit Review/Credit Review Company v2/field_latar_belakang_debitur'), 
    statements)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_faktor_mendukung'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_faktor_mendukung'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/field_faktor_mendukung'))
WebUI.setText(findTestObject('Credit Review/Credit Review Company v2/field_faktor_mendukung'), 
    statements)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_faktor_tidak_mendukung'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_faktor_tidak_mendukung'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/field_faktor_tidak_mendukung'))
WebUI.setText(findTestObject('Credit Review/Credit Review Company v2/field_faktor_tidak_mendukung'), 
    statements)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_syarat'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_syarat'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/field_syarat'))
WebUI.setText(findTestObject('Credit Review/Credit Review Company v2/field_syarat'), 
    statements)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_ca_calculation'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/field_ca_calculation'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/field_ca_calculation'))
WebUI.setText(findTestObject('Credit Review/Credit Review Company v2/field_ca_calculation'), 
    statements)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company v2/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company v2/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company v2/button_submit'))
WebUI.click(findTestObject('Credit Review/Credit Review Company v2/button_submit'))
WebUI.delay(1)


//CLOSE BROWSER========================================================================================================================================================================
WebUI.closeBrowser()

