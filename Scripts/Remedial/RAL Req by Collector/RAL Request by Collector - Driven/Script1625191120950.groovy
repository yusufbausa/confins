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
WebUI.setText(findTestObject('Login/username'), usernameRA1)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 20)
WebUI.click(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.delay(1)


//select menu RAL Req by Collector
WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req by Collector/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/RAL Req by Collector/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/RAL Req by Collector/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/RAL Req by Collector/menu_repossession'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/RAL Req by Collector/expand_menu_ral'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/RAL Req by Collector/button_menu_ral_req_by_collector'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req by Collector/select_office_name'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/RAL Req by Collector/select_office_name'), 
    '218', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/RAL Req by Collector/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('REMEDIAL/RAL Req by Collector/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/RAL Req by Collector/button_request'))
WebUI.delay(1)


//RAL Req by Collector Process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req by Collector/field_notes'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/RAL Req by Collector/field_notes'), 0)
WebUI.setText(findTestObject('REMEDIAL/RAL Req by Collector/field_notes'), notes)
WebUI.click(findTestObject('REMEDIAL/RAL Req by Collector/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()
