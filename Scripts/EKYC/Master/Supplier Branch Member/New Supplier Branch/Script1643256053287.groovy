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
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/menu_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/menu_supplier'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/menu_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/menu_supplier'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu_supplier'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu_supplier'))
WebUI.delay(3)

//input supp credential
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_name'), suppName)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_supplier'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_supplier_branch'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_supplier_branch'))
WebUI.delay(3)


//add supplier branch process
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_supplier_branch'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_supplier_branch'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_code'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_code'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_code'), branchCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_name'), branchName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_active'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_active'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_active'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_active'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bpkb_aging'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bpkb_aging'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bpkb_aging'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bpkb_aging'), bpkbAging)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_day_due_after_golive'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_day_due_after_golive'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_day_due_after_golive'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_day_due_after_golive'), dueGolive)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_name'), npwpName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_number'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_number'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_number'), npwpNumber)

WebUI.waitForElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address'))
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan'), kelurahan)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_next'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_next'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_next'))
WebUI.delay(3)


//add address
WebUI.waitForElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address2'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address2'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address2'))
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address2'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt2'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw2'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode2'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan2'), kelurahan)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_zipCode2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode2'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area'), phoneArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext'))
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext'), phoneExt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_address'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_address'))
WebUI.delay(3)


//add contact person
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_contact_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_contact_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_contact_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_contact_name'), contactName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/select_job_title'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/select_job_title'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/select_job_title'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/select_job_title'), jobTitle, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_mobile_phone'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_mobile_phone'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_mobile_phone'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_mobile_phone'), mobilePhone)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area2'), phoneArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number2'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext2'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext2'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext2'))
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext2'), phoneExt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_email'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_email'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_email'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_email'), email)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_contact'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_contact'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_contact'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_contact'))
WebUI.delay(3)


//add bank account
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_bank_account'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_bank_account'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_bank_account'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_bank_account'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_bank_name'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_bank_name'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_name'), bankName)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_bank_name'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_bank_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_bank_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_bank_name'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_bank_name'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_branch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_branch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_branch'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_branch'), bankBranch)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bi_code'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bi_code'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bi_code'), biCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_name'), branchName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_number'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_number'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_number'), accountNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_is_default_bank'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_is_default_bank'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_is_default_bank'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_is_default_bank'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank_account'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank_account'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank_account'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank_account'))
WebUI.delay(3)


//add member office
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_member_office_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_member_office_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_member_office_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_member_office_name'), memberName)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_member'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_member'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_member'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_member'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_member'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_member'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_member'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_member'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_member'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_default_branch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_default_branch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_default_branch'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_default_branch'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_and_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_and_submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_and_submit'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_and_submit'))
WebUI.delay(5)

//close browser
WebUI.closeBrowser()

