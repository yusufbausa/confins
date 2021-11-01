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
WebUI.setText(findTestObject('Login/username'), usernameDestination)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu asset document transfer
WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/select_menu_asset_document'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/select_menu_asset_document'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/select_menu_asset_document'))
WebUI.selectOptionByValue(findTestObject('Asset Document/Transfer/Doc Receive v3/select_menu_asset_document'), '121', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/expand_menu_receive'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/expand_menu_receive'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/expand_menu_receive'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receive v3/expand_menu_receive'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu_receive'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu_receive'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu_receive'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receive v3/button_menu_receive'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/select_branch_agreement'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/select_branch_agreement'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/select_branch_agreement'))
WebUI.selectOptionByValue(findTestObject('Asset Document/Transfer/Doc Receive v3/select_branch_agreement'), '252', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/field_agreement_number'))
WebUI.setText(findTestObject('Asset Document/Transfer/Doc Receive v3/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('Asset Document/Transfer/Doc Receive v3/button_search'))

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_receive'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_receive'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/button_receive'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receive v3/button_receive'))
WebUI.delay(1)


//doc receive process
WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/field_asset_tax_date'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/field_asset_tax_date'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/field_asset_tax_date'))
WebUI.setText(findTestObject('Asset Document/Transfer/Doc Receive v3/field_asset_tax_date'), taxDate)
WebUI.sendKeys(findTestObject('Asset Document/Transfer/Doc Receive v3/field_asset_tax_date'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/field_received_from'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/field_received_from'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/field_received_from'))
WebUI.setText(findTestObject('Asset Document/Transfer/Doc Receive v3/field_received_from'), receivedFrom)

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/check_receive_all'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/check_receive_all'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/check_receive_all'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receive v3/check_receive_all'))

WebUI.waitForElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Asset Document/Transfer/Doc Receive v3/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('Asset Document/Transfer/Doc Receive v3/button_submit'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receive v3/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

