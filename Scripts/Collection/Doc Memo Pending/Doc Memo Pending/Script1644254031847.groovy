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
WebUI.setText(findTestObject('Login/username'), usernameAR)

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
WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.delay(1)


//select menu change inventory expected date
WebUI.waitForElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu'))
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/select_menu_collection'), '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/extend_menu_repossess'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/extend_menu_repossess'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/extend_menu_repossess'))
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/extend_menu_repossess'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu_change_inventory_expected_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu_change_inventory_expected_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu_change_inventory_expected_date'))
WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_menu_change_inventory_expected_date'))
WebUI.delay(1)


//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Change Asset Expected Date/Expected Date Req/button_search'))

WebUI.click(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/btn_agreement_number'))
WebUI.delay(1)

//WebUI.switchToWindowTitle('')
WebUI.switchToWindowIndex(1)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/tab_document'))
WebUI.delay(1)

//WebUI.switchToWindowTitle('')
WebUI.switchToWindowIndex(2)
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/btn_choose_file'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/btn_choose_file'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/btn_choose_file'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/btn_choose_file'))
WebUI.uploadFile(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/btn_choose_file'), fileUpload)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/field_remarks'), remarks)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/COLLECTION/Doc Memo Pending/btn_upload'))
WebUI.delay(5)

WebUI.closeBrowser()

