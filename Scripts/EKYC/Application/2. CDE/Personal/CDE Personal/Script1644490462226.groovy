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
	
// CREDIT SIMULATION
	
	
//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
	
	
//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), usernameCDE)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT ROLE
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'))
//WebUI.delay(2)
	
	
//SELECT MENU MARKETING
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_menu_marketing'), 'MARKETING', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/menu_centralized_data_entry'))
WebUI.delay(70)
	
	
//INPUT CUST CREDENTIAL (CUST NAME)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_cust_name'), custName)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'))
WebUI.delay(1)
	
	
//CDE PROCESS
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_place'), birthPlace)
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_date'), birthDate)
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_ktp'), ktp)
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_matching_customer'))
WebUI.delay(3)
	
	
//CLOSE BROWSER
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
	
// CREDIT SIMULATION
	
	
//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
	
	
//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), usernameCDE)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT ROLE
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'))
//WebUI.delay(2)
	
	
//SELECT MENU MARKETING
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_menu_marketing'), 'MARKETING', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/menu_centralized_data_entry'))
WebUI.delay(70)
	
	
//INPUT CUST CREDENTIAL (CUST NAME)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_cust_name'), custName)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'))
WebUI.delay(1)
	
	
//CDE PROCESS
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_place'), birthPlace)
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_date'), birthDate)
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_ktp'), ktp)
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_matching_customer'))
WebUI.delay(3)
	
	
//CLOSE BROWSER
WebUI.closeBrowser()
	
	
>>>>>>> ac5b276fa67d599b76be614e013222a28a8b78a3
