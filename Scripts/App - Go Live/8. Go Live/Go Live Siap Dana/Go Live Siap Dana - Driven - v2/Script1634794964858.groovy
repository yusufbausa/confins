<<<<<<< HEAD
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
	
	
//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernameGL)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT PROFILE
WebUI.click(findTestObject('Object Repository/Document Checklist/a_Select'))
//WebUI.delay(1)
	
	
//select menu go live
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_menu'))
//WebUI.delay(1)
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/btn_menu_go_live'))
WebUI.delay(1)
	
	
//input cust credential
WebUI.setText(findTestObject('Go Live/Go Live Siap Dana/field_app_number'), appNo)
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_entry'))
WebUI.delay(1)
	
	
//go live process
WebUI.setText(findTestObject('Go Live/Go Live Siap Dana/field_notes'), notes)

WebUI.scrollToElement(findTestObject('Go Live/Go Live Siap Dana/button_calculate_prepayment'), 10)

WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_calculate_prepayment'))
WebUI.delay(3)

WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()


=======
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
	
	
//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernameGL)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT PROFILE
WebUI.click(findTestObject('Object Repository/Document Checklist/a_Select'))
//WebUI.delay(1)
	
	
//select menu go live
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_menu'))
//WebUI.delay(1)
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/btn_menu_go_live'))
WebUI.delay(1)
	
	
//input cust credential
WebUI.setText(findTestObject('Go Live/Go Live Siap Dana/field_app_number'), appNo)
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_entry'))
WebUI.delay(1)
	
	
//go live process
WebUI.setText(findTestObject('Go Live/Go Live Siap Dana/field_notes'), notes)

WebUI.scrollToElement(findTestObject('Go Live/Go Live Siap Dana/button_calculate_prepayment'), 10)

WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_calculate_prepayment'))
WebUI.delay(3)

WebUI.click(findTestObject('Go Live/Go Live Siap Dana/button_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()


>>>>>>> ac5b276fa67d599b76be614e013222a28a8b78a3
