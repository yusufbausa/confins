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


//OPEN BROWSER======================================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL======================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_Username_txt_RefUser_Username'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_Username_txt_RefUser_Username'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/input_Username_txt_RefUser_Username'))
WebUI.setText(findTestObject('Object Repository/FLEET/SMS Approve/input_Username_txt_RefUser_Username'), usernameWF)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_Password_txt_RefUser_Password'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_Password_txt_RefUser_Password'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/input_Password_txt_RefUser_Password'))
WebUI.setText(findTestObject('Object Repository/FLEET/SMS Approve/input_Password_txt_RefUser_Password'), password)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/a_Login'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/a_Login'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/a_Login'))
WebUI.click(findTestObject('Object Repository/FLEET/SMS Approve/a_Login'))
WebUI.delay(1)


//SELECT MENU TASK MONITORING======================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/img_Welcome, applconfins_imgMenu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/img_Welcome, applconfins_imgMenu'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/img_Welcome, applconfins_imgMenu'))
WebUI.click(findTestObject('Object Repository/FLEET/SMS Approve/img_Welcome, applconfins_imgMenu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/a_Task Monitoring'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/a_Task Monitoring'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/a_Task Monitoring'))
WebUI.click(findTestObject('Object Repository/FLEET/SMS Approve/a_Task Monitoring'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL======================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_Transaction No._ucSearchtxtTransactionCode_ltlWfTaskListsTransactionCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_Transaction No._ucSearchtxtTransactionCode_ltlWfTaskListsTransactionCode'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/input_Transaction No._ucSearchtxtTransactionCode_ltlWfTaskListsTransactionCode'))
WebUI.setText(findTestObject('Object Repository/FLEET/SMS Approve/input_Transaction No._ucSearchtxtTransactionCode_ltlWfTaskListsTransactionCode'), appNo)

WebUI.click(findTestObject('Object Repository/FLEET/SMS Approve/input_Instance GUID_ucSearchbtnSearch'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_SYSTEM_gvUserTaskctl02lb_ResumeTask'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/input_SYSTEM_gvUserTaskctl02lb_ResumeTask'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/input_SYSTEM_gvUserTaskctl02lb_ResumeTask'))
WebUI.click(findTestObject('Object Repository/FLEET/SMS Approve/input_SYSTEM_gvUserTaskctl02lb_ResumeTask'))
WebUI.delay(1)


//RESUME WORKFLOW======================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/a_Resume'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/SMS Approve/a_Resume'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/SMS Approve/a_Resume'))
WebUI.click(findTestObject('Object Repository/FLEET/SMS Approve/a_Resume'))
WebUI.delay(3)


//CLOSE BROWSER======================================================================================================================================================================================
WebUI.closeBrowser()

