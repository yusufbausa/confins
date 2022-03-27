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


//select menu common setting
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_menu_common_setting'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_menu_common_setting'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/select_menu_common_setting'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_menu_common_setting'), 'COMMON SETTING', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/expand_menu_office'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/expand_menu_office'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/expand_menu_office'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/expand_menu_office'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu_office'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu_office'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu_office'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu_office'))
WebUI.delay(1)


//add office process
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_add'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_add'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/btn_add'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_add'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_office_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_office_code'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_office_code'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_office_code'), officeCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_office_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_office_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_office_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_office_name'), officeName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_office_class'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_office_class'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/select_office_class'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_office_class'), officeClass, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_organization_level'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_organization_level'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/select_organization_level'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_organization_level'), orgLevel, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_area'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_area'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/select_area'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_area'), area, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_holiday_scheme'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_holiday_scheme'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/select_holiday_scheme'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_holiday_scheme'), holidayScheme, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_working_hour_scheme'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/select_working_hour_scheme'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/select_working_hour_scheme'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_working_hour_scheme'), workHourScheme, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/check_handling_office_mailing_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/check_handling_office_mailing_zipCode'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/check_handling_office_mailing_zipCode'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/check_handling_office_mailing_zipCode'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_address'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_address'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_address'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_rt'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_rt'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_rt'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_rt'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_rw'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_rw'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_rw'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_rw'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/img_search_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/img_search_zipCode'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/img_search_zipCode'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/img_search_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_kelurahan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_kelurahan'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_kelurahan'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_kelurahan'), kelurahan)

WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_select_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_select_zipCode'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/btn_select_zipCode'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_select_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area'), phoneArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_phone'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area2'), phoneArea2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_phone2'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_phone2'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone2'), phoneNumber2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_area'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_area'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_area'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_area'), faxArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_number'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_number'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_number'), faxNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_contact_person_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_contact_person_name'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_contact_person_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_contact_person_name'), contactPersonName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/fiield_contact_job_title'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/fiield_contact_job_title'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/fiield_contact_job_title'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/fiield_contact_job_title'), contactPersonJob)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_mobile_phone'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_mobile_phone'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_mobile_phone'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_mobile_phone'), mobilePhone)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_email'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/field_email'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/field_email'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_email'), email)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Master/New Office/field_office_code'), 30)
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_get_coordinate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_get_coordinate'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/btn_get_coordinate'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_get_coordinate'))
WebUI.delay(15)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Master/New Office/btn_save'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_save'))
WebUI.delay(5)


///close browser
WebUI.closeBrowser()

