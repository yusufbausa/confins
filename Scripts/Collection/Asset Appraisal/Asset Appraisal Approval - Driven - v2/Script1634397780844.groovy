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


//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), usernameBM)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//select role

//WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/Additional/select_role'))
//WebUI.delay(1)


//select menu appraisal approval (homepage)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_menu_appraisal_approval'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_process_approval_data'))
WebUI.delay(1)


//appraisal approval process
WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/select_action'), 10)
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/select_action'), 'Approve', false)
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/field_notes'), notes)

WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_submit'))
WebUI.delay(5)


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


//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), usernameBM)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//select role

//WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/Additional/select_role'))
//WebUI.delay(1)


//select menu appraisal approval (homepage)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_menu_appraisal_approval'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_process_approval_data'))
WebUI.delay(1)


//appraisal approval process
WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/select_action'), 10)
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/select_action'), 'Approve', false)
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/field_notes'), notes)

WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


>>>>>>> ac5b276fa67d599b76be614e013222a28a8b78a3
