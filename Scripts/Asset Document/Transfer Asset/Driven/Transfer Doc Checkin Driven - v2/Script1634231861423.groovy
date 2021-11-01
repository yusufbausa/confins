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


//select menu document checkin
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/img_Welcome, DEWI SURYANI UTAMI, JAKARTA NO_9393cb'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/img_Welcome, DEWI SURYANI UTAMI, JAKARTA NO_9393cb'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/img_Welcome, DEWI SURYANI UTAMI, JAKARTA NO_9393cb'))
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/img_Welcome, DEWI SURYANI UTAMI, JAKARTA NO_9393cb'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 
    '121', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Filing Management'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Filing Management'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Filing Management'))
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Filing Management'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Document Check In'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Document Check In'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Document Check In'))
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Document Check In'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'))
WebUI.setText(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), agreeNo)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_Select OneAddColl DocumentAgreement _f120a2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_Select OneAddColl DocumentAgreement _f120a2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_Select OneAddColl DocumentAgreement _f120a2'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/select_Select OneAddColl DocumentAgreement _f120a2'), 'ASD', false)

WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input__ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Asset Document_gvRequestListctl02imbCheckIn'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Asset Document_gvRequestListctl02imbCheckIn'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Asset Document_gvRequestListctl02imbCheckIn'))
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/input_Asset Document_gvRequestListctl02imbCheckIn'))
WebUI.delay(1)


//document checkin process
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Submit'))
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Doc Receive/a_Submit'))
WebUI.delay(5)

//close browser
WebUI.closeBrowser()