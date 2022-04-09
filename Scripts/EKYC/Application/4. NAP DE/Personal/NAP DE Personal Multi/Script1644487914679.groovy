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
	
	
//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
//WebUI.delay(1)
	
	
//SELECT MENU NAP DE
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'))
WebUI.delay(5)
	
	
//INPUT CUST CREDENTIAL
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'), custName)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_search_customer'))
WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_action'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_action'))
WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_app'))
//WebUI.delay(1)
	
	
//SELECT CUSTOMER
//WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
//WebUI.delay(2)
	
	
//SELECT GUARANTOR
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(2)
	
	
//APPLICATION DATA
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_app_data'))
WebUI.delay(1)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_address_to_copy'), 'Legal Address', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_copy_address'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(2)
	
	
//ASSET DATA1
//edit asset1
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 'MANDA', false)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), noMesin)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), noRangka)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), manufYear)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), madeIn)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), cylinder)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), transmission)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), color)
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'))
WebUI.delay(1)
	
	
//registration1
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'))
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
//WebUI.delay(3)
	
	
//ASSET DATA2
//edit asset2
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset2'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 'MANDA', false)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), noMesin2)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), noRangka2)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), manufYear)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), madeIn)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), cylinder)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), transmission)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), color)
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'))
WebUI.delay(1)
	
	
//registration2
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration2'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(2)	


//INSURANCE DATA
//insurance aset 1	
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'))
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'))
WebUI.delay(1)
	
	
//insurance aset 2
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance2'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'))
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_insurance'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(2)
	
	
//LIFE INSURANCE DATA
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(2)
	
	
//FINANCIAL DATA
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_fee'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_installment'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(2)
	
	
//COMISSION DATA
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(2)
	
	
//OTHER DATA
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_contract_less_tenor'), 'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_rental_business'), 'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_asset_online_transport'), 'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_fraud_indication'), 'No', false)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'))
WebUI.delay(2)
	
	
//TERM & CONDITION
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_kk'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ijin_praktek'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_npwp'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_tabungan'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_pbb'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_cover_buku_tabungan'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_kk_atas_nama_STNK'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon2'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'))
WebUI.delay(1)
	
	
//SUBMIT APPLICATION
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_submit_application'))
//WebUI.delay(1)
//WebUI.verifyAlertPresent(30)
WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(5)
	
	
//CLOSE BROWSER
WebUI.closeBrowser()
	