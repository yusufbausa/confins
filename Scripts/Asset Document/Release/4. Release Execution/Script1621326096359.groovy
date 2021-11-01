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
WebUI.setText(findTestObject('Login/username'), 'SUG0793')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('Object Repository/Asset Document/Release/a_Select'))
WebUI.delay(1)


//select menu release execution
WebUI.click(findTestObject('Object Repository/Asset Document/Release/img_Welcome, SUGIHARTINI, TANGERANG, CUSTOM_4127e5'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Release/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'), 
    '121', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Release/span_Transfer_rtPlus'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Execution/a_Execution'))
//WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Execution/td_Request No_tdValue'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('Object Repository/Asset Document/Release/Release Execution/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_b25f48'), 
    '01091410')
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Execution/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Execution/input_SUG0793_gvRequestListctl02imbEdit'))
WebUI.delay(2)


//release execution process
WebUI.setText(findTestObject('Object Repository/Asset Document/Release/Release Execution/input_Release To_txtReleaseTo'), 
    'release')
WebUI.setText(findTestObject('Object Repository/Asset Document/Release/Release Execution/textarea_Notes_txtNotes'), 'release')
WebUI.click(findTestObject('Object Repository/Asset Document/Release/Release Execution/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()
