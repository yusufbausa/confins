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
WebUI.setText(findTestObject('Login/username'), usernameFH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select menu cash advance settlement
WebUI.click(findTestObject('Object Repository/Operation/Cash Advance Settlement/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/Operation/Cash Advance Settlement/select_menu_operation'), 'OPERATION', false)
WebUI.click(findTestObject('Object Repository/Operation/Cash Advance Settlement/menu_cash_advance'))
WebUI.click(findTestObject('Object Repository/Operation/Cash Advance Settlement/menu_cash_advance_settlement'))
WebUI.delay(1)
	
	
//input cust credential & CAS process
WebUI.setText(findTestObject('Object Repository/Operation/Cash Advance Settlement/field_agreement_no'), agreeNo)
WebUI.click(findTestObject('Object Repository/Operation/Cash Advance Settlement/btn_search'))
WebUI.delay(1)
<<<<<<< HEAD

=======
>>>>>>> ac5b276fa67d599b76be614e013222a28a8b78a3
WebUI.verifyElementPresent(findTestObject('Object Repository/Operation/Cash Advance Settlement/btn_action'), 0)
WebUI.click(findTestObject('Object Repository/Operation/Cash Advance Settlement/btn_action'))
WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(10)
	
//close browser
WebUI.closeBrowser()
	
	
