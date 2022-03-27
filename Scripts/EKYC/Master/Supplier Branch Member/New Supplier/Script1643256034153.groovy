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


//select menu supplier
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/button_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/menu_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/menu_supplier'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/menu_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/menu_supplier'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_menu_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_menu_supplier'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_menu_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_menu_supplier'))
WebUI.delay(3)

//add supplier process
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_supplier'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_supplier'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_code'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_code'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_code'), suppCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_name'), suppName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_legal_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_legal_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_legal_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_legal_name'), 
    suppLegalName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_short_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_short_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_short_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_short_name'), 
    suppShortName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_supplier_class'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_supplier_class'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_supplier_class'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_supplier_class'), 
    suppClass, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_tdp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_tdp'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_tdp'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_tdp'), tdp)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_siup'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_siup'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_siup'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_siup'), siup)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_collaboration_start_date'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_collaboration_start_date'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_collaboration_start_date'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_collaboration_start_date'), 
    date)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/td_Collaboration Start Date'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/td_Collaboration Start Date'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/td_Collaboration Start Date'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/td_Collaboration Start Date'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_main_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_main_supplier'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_main_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_main_supplier'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_holding'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_holding'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_holding'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_holding'), suppHolding)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_supplier_holding'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_supplier_holding'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_supplier_holding'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_supplier_holding'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_supplier_holding'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_incentive_card'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_incentive_card'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_incentive_card'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_incentive_card'), 
    incentiveCard, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_active'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_active'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_active'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_active'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_coa_prepaid_ap'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_coa_prepaid_ap'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_coa_prepaid_ap'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_coa_prepaid_ap'), baseCoaPrepaid)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_base_coa_ap'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_base_coa_ap'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_base_coa_ap'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_base_coa_ap'), baseCoa)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_npwp_no'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_npwp_no'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_npwp_no'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_npwp_no'), npwpNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address1'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address1'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt1'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt1'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw1'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw1'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode1'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode1'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan1'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan1'), kelurahan)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_zipCode1'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_zipCode1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_zipCode1'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_zipCode1'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_zipCode1'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_next'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_next'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_next'))
WebUI.delay(3)

//supplier registration
//add address
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address2'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt2'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw2'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode2'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan2'), kelurahan)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_zipCode2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_select_zipCode2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_select_zipCode2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_select_zipCode2'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_select_zipCode2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area'), phoneArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext'), phoneExt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_address'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_address'))
WebUI.delay(3)

//add contact person
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_contact_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_contact_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_contact_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_contact_name'), contactName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_job_title'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_job_title'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_job_title'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_job_title'), 
    jobTitle, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_mobile_phone'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_mobile_phone'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_mobile_phone'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_mobile_phone'), mobilePhone)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area2'), phoneArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number2'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext2'), phoneExt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_email'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_email'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_email'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_email'), email)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_contact'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_contact'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_contact'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_contact'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_owner'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_owner'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_owner'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_owner'))
WebUI.delay(3)

//add bank account
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_bank_account'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_bank_account'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_bank_account'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_bank_account'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_bank_name'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_bank_name'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_name'), bankName)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_bank_name'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_bank_name'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_bank_name'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_branch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_branch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_branch'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_branch'), bankBranch)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bi_code'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bi_code'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bi_code'), biCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_name'), suppName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_number'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_number'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_number'), accountNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_is_default'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_is_default'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_is_default'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_is_default'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_bank_account'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_bank_account'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_bank_account'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_bank_account'))
WebUI.delay(1)


//save & submit
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_and_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_and_submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_and_submit'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_and_submit'))
WebUI.delay(5)

//close browser
WebUI.closeBrowser()

