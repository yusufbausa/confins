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
WebUI.delay(3)


//select role
//WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_role'))
//WebUI.delay(3)


//select menu collection expense
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'))
//WebUI.selectOptionByValue(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu_CAF'), '270', false)
WebUI.selectOptionByLabel(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/select_menu_collection'), 'COLLECTION', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu_CAF'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu_CAF'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu_CAF'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_menu_CAF'))
WebUI.delay(1)


//add caf
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_add'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_add'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_add'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_add'))
WebUI.delay(1)

//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_agreement_number'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_action'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_action'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_market_value'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_market_value'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_market_value'))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_market_value'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_market_value'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_market_value'), marketValue)
//WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_collection_expense'), 0)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_collection_expense'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_collection_expense'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_collection_expense'))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_collection_expense'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_collection_expense'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/field_collection_expense'), collectionExpense)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_calculate'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_calculate'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_analysis'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_analysis'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_analysis'))
WebUI.scrollToElement(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_analysis'), 0)
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_analysis'), analysis)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_action'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_action'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_action'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_action'), action)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_result'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_result'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_result'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_result'), result)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_handled_by'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_handled_by'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_handled_by'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_handled_by'), handledBy)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_notes'))
WebUI.setText(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/textarea_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_submit'))
WebUI.click(findTestObject('COLLECTION/Collection Expense/Case Analysis Form/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

