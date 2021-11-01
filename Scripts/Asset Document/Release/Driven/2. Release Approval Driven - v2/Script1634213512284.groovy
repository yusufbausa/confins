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
WebUI.setText(findTestObject('Login/username'), username)

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
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Select'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Select'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Select'))
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Select'))
WebUI.delay(1)


//select menu asset document release
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/img_Welcome, SUGIHARTINI, TANGERANG, CUSTOM_4127e5'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/img_Welcome, SUGIHARTINI, TANGERANG, CUSTOM_4127e5'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/img_Welcome, SUGIHARTINI, TANGERANG, CUSTOM_4127e5'))
WebUI.click(findTestObject('Object Repository/Asset Document/Release/img_Welcome, SUGIHARTINI, TANGERANG, CUSTOM_4127e5'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Release/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'), 
    '121', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/span_Transfer_rtPlus'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/span_Transfer_rtPlus'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/span_Transfer_rtPlus'))
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Approval/span_Transfer_rtPlus'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Approval'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Approval'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Approval'))
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Approval'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'))
WebUI.setText(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), agreeNo)

WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_Value must be Date Format_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_SUG0793_gvTaskctl02ibProcess'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_SUG0793_gvTaskctl02ibProcess'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_SUG0793_gvTaskctl02ibProcess'))
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Approval/input_SUG0793_gvTaskctl02ibProcess'))
WebUI.delay(1)


//release approval process
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/select_Select OneApproveReject'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/select_Select OneApproveReject'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/select_Select OneApproveReject'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Release/Release Approval/select_Select OneApproveReject'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/textarea_Notes_txtNotes'))
WebUI.setText(findTestObject('Object Repository/Asset Document/Release/Release Approval/textarea_Notes_txtNotes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Submit'))
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Approval/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

