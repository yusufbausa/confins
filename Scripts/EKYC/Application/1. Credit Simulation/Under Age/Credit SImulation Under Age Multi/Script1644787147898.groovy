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
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
//WebUI.delay(1)
	
	
//access menu credit simulation
WebUI.click(findTestObject('Credit Simulation/btn_menu'))
WebUI.click(findTestObject('Credit Simulation/btn_menu_credit_simulation'))
WebUI.click(findTestObject('Credit Simulation/btn_add_simulation'))
WebUI.delay(1)
	
	
//credit simulation process
WebUI.setText(findTestObject('Credit Simulation/field_cust_name'), custName)
WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_marital_status'), 'Single', false)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/img_search_product_offer'))
WebUI.delay(1)
WebUI.setText(findTestObject('Credit Simulation/field_product_offer_name'), productOffer)	
WebUI.click(findTestObject('Credit Simulation/btn_search_product_offer'))
WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_select_product'))
WebUI.delay(1)
//WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/field_asset_amount'))
WebUI.doubleClick(findTestObject('Credit Simulation/field_asset_amount'))
WebUI.sendKeys(findTestObject('Credit Simulation/field_asset_amount'), '2')
WebUI.delay(1)
	
	
//application data
//WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/field_tenor'))
WebUI.doubleClick(findTestObject('Credit Simulation/field_tenor'))
WebUI.sendKeys(findTestObject('Credit Simulation/field_tenor'), tenor)
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_installment_scheme'), 'Regular Fixed Installment', false)
WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_payment_frequency'), 'MONTHLY', false)
	
	
//life insurance data
WebUI.click(findTestObject('Credit Simulation/btn_next'))
WebUI.delay(1)
	
	
//asset data 1
WebUI.click(findTestObject('Credit Simulation/btn_add_asset'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/img_search_supp_branch'))
WebUI.delay(1)
WebUI.setText(findTestObject('Credit Simulation/field_supp_branch_address'), suppBranchAddress)	
WebUI.click(findTestObject('Credit Simulation/btn_search_supplier'))
WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_select_supplier'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/img_search_asset_name'))
WebUI.delay(1)
WebUI.setText(findTestObject('Credit Simulation/field_asset_name'), assetName)	
WebUI.click(findTestObject('Credit Simulation/btn_search_asset'))
WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_select_asset'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/field_asset_price'))
WebUI.doubleClick(findTestObject('Credit Simulation/field_asset_price'))
//WebUI.delay(1)
WebUI.sendKeys(findTestObject('Credit Simulation/field_asset_price'), assetPrice)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/field_asset_dp'))
WebUI.doubleClick(findTestObject('Credit Simulation/field_asset_dp'))
//WebUI.delay(1)
WebUI.sendKeys(findTestObject('Credit Simulation/field_asset_dp'), assetDp)
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_asset_usage'), 'Pribadi', false)

WebUI.click(findTestObject('Credit Simulation/btn_save_asset'))
WebUI.delay(1)
	
	
//asset data 2
WebUI.click(findTestObject('Credit Simulation/btn_add_asset'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/img_search_supp_branch'))
WebUI.delay(1)
WebUI.setText(findTestObject('Credit Simulation/field_supp_branch_address'), suppBranchAddress)	
WebUI.click(findTestObject('Credit Simulation/btn_search_supplier'))
WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_select_supplier'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/img_search_asset_name'))
WebUI.delay(1)
WebUI.setText(findTestObject('Credit Simulation/field_asset_name'), assetName2)
//WebUI.delay(2)	
WebUI.click(findTestObject('Credit Simulation/btn_search_asset'))
WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_select_asset'))
WebUI.delay(1)


WebUI.click(findTestObject('Credit Simulation/field_asset_price'))
WebUI.doubleClick(findTestObject('Credit Simulation/field_asset_price'))
//WebUI.delay(1)
WebUI.sendKeys(findTestObject('Credit Simulation/field_asset_price'), assetPrice2)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/field_asset_dp'))
WebUI.doubleClick(findTestObject('Credit Simulation/field_asset_dp'))
//WebUI.delay(1)
WebUI.sendKeys(findTestObject('Credit Simulation/field_asset_dp'), assetDp2)
WebUI.delay(1)
//WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_asset_usage'), 'Pribadi', false)
WebUI.click(findTestObject('Credit Simulation/btn_save_asset'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_next'))
WebUI.delay(1)
	
	
//insurance data
WebUI.click(findTestObject('Credit Simulation/btn_edit_insurance'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_scheme_name'), schemeName, false)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_next_insurance'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_all_risk_1'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/check_tpl_1'))
//	//WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_all_risk_2'), 'ALL RISK', false)
//WebUI.delay(1)
//	//WebUI.click(findTestObject('Credit Simulation/check_tpl_2'))
//	//WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_all_risk_3'), 'ALL RISK', false)
//WebUI.delay(1)
//WebUI.click(findTestObject('Credit Simulation/check_tpl_3'))
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Credit Simulation/btn_save_insurance'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_calculate'))
WebUI.delay(3)
	
WebUI.scrollToElement(findTestObject('Credit Simulation/field_tenor'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_save_insurance'))
WebUI.delay(1)
	
	
//insurance data 2
WebUI.click(findTestObject('Credit Simulation/btn_edit_insurance2'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_scheme_name'), schemeName, false)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_next_insurance'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_all_risk_1'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/check_tpl_1'))
//	//WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_all_risk_2'), 'ALL RISK', false)
//WebUI.delay(1)
//	//WebUI.click(findTestObject('Credit Simulation/check_tpl_2'))
//	//WebUI.selectOptionByLabel(findTestObject('Credit Simulation/select_all_risk_3'), 'ALL RISK', false)
//WebUI.delay(1)
//WebUI.click(findTestObject('Credit Simulation/check_tpl_3'))
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Credit Simulation/btn_save_insurance'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_calculate'))
WebUI.delay(3)
	
WebUI.scrollToElement(findTestObject('Credit Simulation/field_tenor'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_save_insurance'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_next'))
WebUI.delay(1)
	
	
//financial data
WebUI.click(findTestObject('Credit Simulation/btn_calculate_fee'))
WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_calculate_2'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_calculate_installment'))
WebUI.delay(3)

WebUI.click(findTestObject('Credit Simulation/btn_next'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_next'))
WebUI.delay(1)
	
	
//credit simulation to new application
WebUI.setText(findTestObject('Credit Simulation/field_mobile_phone'), mobilePhone)
//WebUI.delay(1)
WebUI.setText(findTestObject('Credit Simulation/field_npwp'), npwp)
//WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_save_to_app'))
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Credit Simulation/btn_choose_file'), 0)
WebUI.delay(1)

WebUI.uploadFile(findTestObject('Credit Simulation/btn_choose_file'), fileUpload)
WebUI.delay(2)
WebUI.setText(findTestObject('Credit Simulation/field_remarks'), remarks)
WebUI.delay(1)
WebUI.click(findTestObject('Credit Simulation/btn_upload_document'))
WebUI.delay(1)

WebUI.click(findTestObject('Credit Simulation/btn_submit_credit_simulation'))
//WebUI.delay(1)
	
//WebUI.waitForAlert(30)
WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(5)
	
	
//close browser
WebUI.closeBrowser()
	
	
