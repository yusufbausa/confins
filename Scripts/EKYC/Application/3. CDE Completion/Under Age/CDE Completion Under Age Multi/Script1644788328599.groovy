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
WebUI.setText(findTestObject('Login/username'), usernameCDE)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT ROLE
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'))
//WebUI.delay(2)
	
	
//SELECT MENU CENTRALIZED DATA ENTRY COMPLETION
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'),
	'MARKETING', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'))
//WebUI.delay(1)
WebUI.delay(70)
	
	
//INPUT CUST CREDENTIAL (CUST NAME)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'), custName)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'))
WebUI.delay(1)
	
	
//CDE COMPLETION PROCESS
//basic data
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_customer_model'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_gender'), 'F', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_religion'),
	'KATOLIK', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_education'),
	'SMA', false)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mother_name'), motherName)
WebUI.delay(1)
	
	
//contact data
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_call_reason'),
	'538', false)
WebUI.delay(1)
	
	
//profession job data
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_profession_name'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_profession_name'), profession)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_profession'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_profession'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_position'),
	'JPEXEC', false)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_company_name'), companyName)
WebUI.delay(1)
	
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name2'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_industry_type_name'), industryType)
//WebUI.delay(1)	
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_industry_type'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_industry_type'))
WebUI.delay(1)
	
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'),
	'OTHERS', false)
WebUI.delay(1)
	
	
//address data
//legal address
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_legal_address'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_residence_address'),
	'Residence Address', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_address_type'),
	'Legal Address', false)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_address'), address)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rt'), rt)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rw'), rw)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_zipCode'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_kelurahan'), kelurahan)	
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_kelurahan'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_kelurahan'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_area'), phoneArea)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_number'), phoneNumber)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_ext'), phoneExt)
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_ownership'),
	'SELF', false)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.delay(1)
	
	
//residence address
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_residence_address'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'),
	'LEGAL', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_building_type'),
	'Apartment', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'))
WebUI.doubleClick(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'))
WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'), '48')

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.delay(1)
	
	
//job address
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_job_address'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'),
	'LEGAL', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.delay(1)
	
	
//emergency contact
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_emergency_contact'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_em_contact_name'), contactName)
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_cust_relationship'),
	'FATHER', false)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mobile_phone'), mobilePhone)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_em_contact'))
WebUI.delay(1)
	
	
//wop
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_debitor'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_bi_code'), biCode)	
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_bi_code'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_bi_code'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_business_scale'),
	'03', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'),
	'ADBCA', false)
WebUI.delay(1)
	
	
//asset registration
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'),
	'LEGAL', false)
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'))
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'))
WebUI.delay(1)
	
	
//asset registration 2
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset2'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'),
	'LEGAL', false)
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'))
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'), 0)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'))
WebUI.delay(1)
	
	
//submit data
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_submit'))
WebUI.delay(5)
	
	
//CLOSE BROWSER
WebUI.closeBrowser()
	
