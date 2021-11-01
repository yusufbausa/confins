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
WebUI.waitForElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Repossess Activity by Collector/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Repossess Activity by Collector/select_role'))
WebUI.click(findTestObject('COLLECTION/Repossess Activity by Collector/select_role'))
WebUI.delay(1)


//select menu send asset to pool
WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/button_menu'))
WebUI.click(findTestObject('COLLECTION/Send Asset to Pool/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/select_inventory_management_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/select_inventory_management_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/select_inventory_management_menu'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Send Asset to Pool/select_inventory_management_menu'), '402', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/expand_menu_send_asset'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/expand_menu_send_asset'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/expand_menu_send_asset'))
WebUI.click(findTestObject('COLLECTION/Send Asset to Pool/expand_menu_send_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_menu_send_asset_to_pool'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_menu_send_asset_to_pool'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/button_menu_send_asset_to_pool'))
WebUI.click(findTestObject('COLLECTION/Send Asset to Pool/button_menu_send_asset_to_pool'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/select_collection_group'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/select_collection_group'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/select_collection_group'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Send Asset to Pool/select_collection_group'), '1', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Send Asset to Pool/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Send Asset to Pool/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_edit_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_edit_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/button_edit_data'))
WebUI.click(findTestObject('COLLECTION/Send Asset to Pool/button_edit_data'))
WebUI.delay(1)


//send asset to pool process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/select_pool'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/select_pool'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/select_pool'))
WebUI.scrollToElement(findTestObject('COLLECTION/Send Asset to Pool/select_pool'), 10)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Send Asset to Pool/select_pool'), '37', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_send_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_send_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/field_send_by'))
WebUI.setText(findTestObject('COLLECTION/Send Asset to Pool/field_send_by'), sendBy)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_send_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_send_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/field_send_date'))
WebUI.setText(findTestObject('COLLECTION/Send Asset to Pool/field_send_date'), date)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Send Asset to Pool/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Send Asset to Pool/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Send Asset to Pool/button_submit'))
WebUI.click(findTestObject('COLLECTION/Send Asset to Pool/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()
