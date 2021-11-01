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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'NKU1249')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(2)


//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Document Checklist/a_Select'))
WebUI.delay(3)


//SELECT MENU DOCUMENT CHECKLIST================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Document Checklist/img_Welcome, NATASHA KUSNADI, FLEET JAKARTA_d68adc'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Document Checklist/a_Document Checklist'))
WebUI.delay(3)


//INPUT CUST CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/FLEET/Document Checklist/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 
    '0021APP20210300040')
WebUI.click(findTestObject('Object Repository/FLEET/Document Checklist/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Document Checklist/input_FLEET BUSINESS VEHICLE NONPAKET_gvDoc_49faeb'))
WebUI.delay(3)


//DOCUMENT CHECKLIST PROCESS================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Document Checklist/a_Submit'))
WebUI.delay(3)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

