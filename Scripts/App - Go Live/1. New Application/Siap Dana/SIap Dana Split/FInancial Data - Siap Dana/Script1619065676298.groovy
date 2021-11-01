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

WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/a_Select'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Percentage_rblProvisionType'))
WebUI.setText(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Provision Amount_ucINProvisionFeeAmttxtInput'), 
    '50000000')
WebUI.scrollToElement(findTestObject('SIAP DANA/Financial Data - SIap Dana/input_Fiducia Fee Amount_ucINFiduciaFeeAmttxtInput'), 
    0)
WebUI.setText(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Fiducia Fee Amount_ucINFiduciaFeeAmttxtInput'), 
    '5000000')
WebUI.click(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Fees_lb_Form_CalcFee'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Fees_lbCalculateFees'))
WebUI.scrollToElement(findTestObject('SIAP DANA/Financial Data - SIap Dana/select_Select OneFlatEffective'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/select_Select OneFlatEffective'), 
    'FLT', true)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_Financial Data_lbCalculateFinancialData'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/input_-_lb_Form_SaveCont'))

WebUI.closeBrowser()

