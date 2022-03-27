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
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameSU)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/select_role'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/select_role'))
WebUI.delay(1)


//select menu supplier branch
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/menu_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/menu_supplier'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/menu_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/menu_supplier'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu_supplier_scheme'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu_supplier_scheme'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu_supplier_scheme'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_menu_supplier_scheme'))
WebUI.delay(1)


//add supplier scheme process
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_supplier_scheme'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_supplier_scheme'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_supplier_scheme'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_supplier_scheme'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_code'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_code'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_code'), schemeCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_scheme_name'), schemeName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_active'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_active'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_active'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_active'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_next'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_next'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_next'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_branch_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_branch_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_branch_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/field_supplier_branch_name'), suppBranchName)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_supplier_branch'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/check_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_to_temp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_to_temp'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_to_temp'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_add_to_temp'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_save'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Scheme/btn_save'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

