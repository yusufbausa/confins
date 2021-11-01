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
import com.kms.katalon.core.webui.common.WebUiCommonHelper

//OPEN BROWSER & HIT URL==========================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 2)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), username)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELEC PROFILE==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_select_profile'))
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//SELECT MENU CUSTOMER==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.click(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/a_Customer'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/a_Customer'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/a_Customer'))
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/a_Customer_1'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/a_Customer_1'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/a_Customer_1'))
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer_1'))
WebUI.delay(1)


//ADDING NEW CUSTOMER==========================================================================================================================================================================

void part_1() {

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/a_Add Personal Customer'), 20)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/a_Add Personal Customer'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/a_Add Personal Customer'))
WebUI.click(findTestObject('Customer/New - Main Data/a_Add Personal Customer'))
WebUI.delay(1)


WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Small Medium Enterprise_rblCustModel'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Small Medium Enterprise_rblCustModel'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Small Medium Enterprise_rblCustModel'))
WebUI.click(findTestObject('Customer/New - Main Data/input_Small Medium Enterprise_rblCustModel'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), custName)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'))
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 
    'KTP', false)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_ID Number_ucIdtxtCustIdNo'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_ID Number_ucIdtxtCustIdNo'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_ID Number_ucIdtxtCustIdNo'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Number_ucIdtxtCustIdNo'), idNumber)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), idExpired)
WebUI.sendKeys(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Female_rblCustGender'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Female_rblCustGender'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Female_rblCustGender'))
WebUI.click(findTestObject('Customer/New - Main Data/input_Female_rblCustGender'))

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input__txtBirthPlace'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input__txtBirthPlace'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input__txtBirthPlace'))
WebUI.setText(findTestObject('Customer/New - Main Data/input__txtBirthPlace'), birthPlace)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'))
WebUI.setText(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), birthDate)
WebUI.sendKeys(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_NPWP_txtNpwp'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_NPWP_txtNpwp'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_NPWP_txtNpwp'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_NPWP_txtNpwp'), npwp)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Mother Maiden Name_txtMotherMaidenName'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Mother Maiden Name_txtMotherMaidenName'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Mother Maiden Name_txtMotherMaidenName'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_Mother Maiden Name_txtMotherMaidenName'), motherName)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/a_Next'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/a_Next'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/a_Next'))
WebUI.click(findTestObject('Customer/New - Main Data/a_Next'))
WebUI.delay(1)

}

//ADDING MAIN DATA==========================================================================================================================================================================

void part_2() {

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'))
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 'MR', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'), prefixName)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'), suffixName)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'), nickName)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'))
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'), 'SIN', false)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'))
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'), 'WNI', false)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'))
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 
    'SMA', false)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'))
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'), 
    'ISLAM', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'))
WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), 0)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), mobilePhone)

WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'), 30)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'))
WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'), 0)
WebUI.click(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'))
WebUI.delay(1)

}

//ADDING CUSTOMER ADDRESS==========================================================================================================================================================================

void part_3() {

//adding address legal==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Add'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/a_Add'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '1', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/textarea_Address_ucAddrtxtOfficeAddr'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/textarea_Address_ucAddrtxtOfficeAddr'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/textarea_Address_ucAddrtxtOfficeAddr'))
WebUI.setText(findTestObject('Object Repository/Customer/Address/textarea_Address_ucAddrtxtOfficeAddr'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRT'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRT'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRT'))
WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRT'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRW'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRW'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRW'))
WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRW'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'))
WebUI.click(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_Kelurahan_ucAddrucLookupZipCodeuclZip_f8e874'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input_Kelurahan_ucAddrucLookupZipCodeuclZip_f8e874'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input_Kelurahan_ucAddrucLookupZipCodeuclZip_f8e874'))
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Kelurahan_ucAddrucLookupZipCodeuclZip_f8e874'), kelurahanSearch)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_SEARCH'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/a_SEARCH'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_SEARCH'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Select (1)'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/a_Select (1)'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/a_Select (1)'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Select (1)'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'))
WebUI.click(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'))

WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'))
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)

WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/a_Save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(1)

//adding address residence==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Add'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/a_Add'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Copy Address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/a_Copy Address'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/a_Copy Address'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Copy Address'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '3', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'))
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)
//WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'PT. Maju Sentosa')

WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/a_Save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.click(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.delay(1)

}

//ADDING JOB DATA==========================================================================================================================================================================

void part_4() {

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'))
WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfimb'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfimb'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfimb'))
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfimb'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfum_dd689e'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfum_dd689e'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfum_dd689e'))
WebUI.setText(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfum_dd689e'),
	profession)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/a_SEARCH'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/a_SEARCH'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Job Data - Under Age/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/a_SEARCH'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/a_Select (1)'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/a_Select (1)'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Job Data - Under Age/a_Select (1)'))
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/a_Select (1)'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/input_-_lb_Form_SaveCont_Job'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Job Data - Under Age/input_-_lb_Form_SaveCont_Job'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Job Data - Under Age/input_-_lb_Form_SaveCont_Job'))
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/input_-_lb_Form_SaveCont_Job'))
WebUI.delay(1)

}

//ADDING EMERGENCY CONTACT==========================================================================================================================================================================

void part_5() {

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'))
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'))
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), emContactName)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 
    'FATHER', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'))
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'), 
    emCustPhone)

WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'))
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 
    address)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'))
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'))
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'))
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'))
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'), 
    kelurahanSearch)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'))
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 20)
WebUI.verifyElementPresent(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 30)
WebUI.verifyElementClickable(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'))
WebUI.click(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'))
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'))
WebUI.delay(1)

}

//ADDING FINANCIAL DATA==========================================================================================================================================================================

void part_6() {

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	monthlyIncome)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	grossProfit)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	livingCost)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input__btnCalculate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input__btnCalculate'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input__btnCalculate'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input__btnCalculate'))
WebUI.delay(1)

//Bank Account Normal==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Add'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Add'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 
    '9', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 
    bankBranch)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 
    bankCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'), 
    custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 
    accountNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
WebUI.delay(1)

//Bank Account Siap Dana==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Add'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Add'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'),
	'9', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'),
	bankBranch)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'),
	bankCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'),
	custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'))
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'),
	accountNumber)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'),
	'4138', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Save'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_-_lb_Form_SaveCont_FinancialData'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_-_lb_Form_SaveCont_FinancialData'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Financial Data New/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.delay(1)

}

//ADDING OTHER ATTRIBUTES==========================================================================================================================================================================

void part_7() {

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'))
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), 20)
WebUI.setText(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), 
    biCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/a_SEARCH'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Other Attribute/a_SEARCH'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Other Attribute/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_SEARCH'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/a_Select'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Other Attribute/a_Select'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Other Attribute/a_Select'))
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_Select'))
WebUI.delay(1)


WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'), 
    '03', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_-_lb_Form_Save_OtherAttribute'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_-_lb_Form_Save_OtherAttribute'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Other Attribute/input_-_lb_Form_Save_OtherAttribute'))
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_-_lb_Form_Save_OtherAttribute'))
WebUI.delay(1)

}

part_1()
part_2()
part_3()
part_4()
part_5()
part_6()
part_7()


//FINISH & CLOSE BROWSER==========================================================================================================================================================================
WebUI.closeBrowser()

