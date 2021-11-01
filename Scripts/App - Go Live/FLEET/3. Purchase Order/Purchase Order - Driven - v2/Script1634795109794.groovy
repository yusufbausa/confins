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

//OPEN BROWSER================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernamePO)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'))
WebUI.delay(1)


//SELECT MENU PURCHASE ORDER================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))
WebUI.click(findTestObject('Object Repository/FLEET/Purchase Order/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/a_Purchase Order Agreement'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/a_Purchase Order Agreement'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/a_Purchase Order Agreement'))
WebUI.click(findTestObject('Object Repository/FLEET/Purchase Order/a_Purchase Order Agreement'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'))
WebUI.setText(findTestObject('Object Repository/FLEET/Purchase Order/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), appNo)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_Task Claim By_ucSearchbtnSearch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_Task Claim By_ucSearchbtnSearch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/input_Task Claim By_ucSearchbtnSearch'))
WebUI.click(findTestObject('Object Repository/FLEET/Purchase Order/input_Task Claim By_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_116f48'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_116f48'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_116f48'))
WebUI.click(findTestObject('Object Repository/FLEET/Purchase Order/input_FLEET BUSINESS VEHICLE NONPAKET_gvAgr_116f48'))
WebUI.delay(1)


//PURCHASE ORDER PROCESS================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_JL DAAN MOGOT KM.20 NO.8 RT.001004KEL_4631c3'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/input_JL DAAN MOGOT KM.20 NO.8 RT.001004KEL_4631c3'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/input_JL DAAN MOGOT KM.20 NO.8 RT.001004KEL_4631c3'))
WebUI.click(findTestObject('Object Repository/FLEET/Purchase Order/input_JL DAAN MOGOT KM.20 NO.8 RT.001004KEL_4631c3'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/a_Save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/a_Save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/a_Save'))
WebUI.click(findTestObject('Object Repository/FLEET/Purchase Order/a_Save'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Purchase Order/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Purchase Order/a_Submit'))
WebUI.click(findTestObject('Object Repository/FLEET/Purchase Order/a_Submit'))
WebUI.delay(5)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

