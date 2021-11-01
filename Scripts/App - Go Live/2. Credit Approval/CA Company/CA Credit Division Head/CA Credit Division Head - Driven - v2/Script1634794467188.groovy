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


//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameCDH)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu credit approval by credit division head
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/img_Welcome, AGUNG BUDI KUNCARA, HEAD OFFIC_8c5647'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/img_Welcome, AGUNG BUDI KUNCARA, HEAD OFFIC_8c5647'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/img_Welcome, AGUNG BUDI KUNCARA, HEAD OFFIC_8c5647'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/img_Welcome, AGUNG BUDI KUNCARA, HEAD OFFIC_8c5647'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Credit Approval'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Credit Approval'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Credit Approval'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Credit Approval'))
WebUI.delay(1)


//inpuut cust credential (app number)
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'))
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), appNo)

WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/input_Value must be Date Format_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Process'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Process'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Process'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Process'))
WebUI.delay(1)


//credit approval by credit division head process
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/select_Select OneApproveRejectReturn'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/select_Select OneApproveRejectReturn'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/select_Select OneApproveRejectReturn'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/select_Select OneApproveRejectReturn'), 'Approve', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/textarea_Notes_txtNotes'))
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/textarea_Notes_txtNotes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Submit'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Submit'), 2)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Submit'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval Company/CA Credit Division Head/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

