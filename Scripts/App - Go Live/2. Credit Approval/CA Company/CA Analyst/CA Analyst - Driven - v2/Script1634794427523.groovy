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


//select role
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Review/Credit Review Company/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Review/Credit Review Company/select_role'))
WebUI.click(findTestObject('Credit Review/Credit Review Company/select_role'))
WebUI.delay(1)


//select menu credit approval
WebUI.waitForElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_menu'))
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/btn_menu_credit_approval'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/btn_menu_credit_approval'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/btn_menu_credit_approval'))
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/btn_menu_credit_approval'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_app_number'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_app_number'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_app_number'))
WebUI.setText(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_app_number'), appNo)

WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_search'))

WebUI.waitForElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_process'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_process'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_process'))
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_process'))
WebUI.delay(1)


//credit approval analyst process
WebUI.waitForElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/select_action'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/select_action'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/select_action'))
WebUI.selectOptionByValue(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/select_action'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_notes'))
WebUI.setText(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_submit'))
WebUI.click(findTestObject('Credit Approval/Credit Approval Company/CA Analyst/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

