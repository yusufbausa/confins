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
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'WYU0489')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select profile
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_profile'))
WebUI.delay(3)


//select menu waived transaction
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_menu_account_maintenance'), 
    '80', false)
WebUI.delay(1)
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/menu_waived_transaction'))
WebUI.delay(1)
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_menu_waived_request'))
WebUI.delay(2)


//input cust credential (agreement no)
WebUI.setText(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_agreement_number'), 
    '1915100015')
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_edit_data'))
WebUI.delay(3)


//waived transaction request process
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/radio_select_percent'))
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'), 2)
WebUI.sendKeys(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_waived_percentage'), 
    '50')
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_calculate'))
WebUI.delay(2)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_reason_description'), 
    '364', false)
WebUI.selectOptionByValue(findTestObject('PAYMENT/Waived Transaction/Waived Request/select_approved_by'), 
    '303980', false)
WebUI.setText(findTestObject('PAYMENT/Waived Transaction/Waived Request/field_notes'), 
    'notes')
WebUI.click(findTestObject('PAYMENT/Waived Transaction/Waived Request/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

