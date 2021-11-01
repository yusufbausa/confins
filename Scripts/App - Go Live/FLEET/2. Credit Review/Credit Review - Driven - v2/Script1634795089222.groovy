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

//OPEN BROWSER========================================================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL========================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameCR)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ROLE========================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_Select'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_Select'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/a_Select'))
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_Select'))
WebUI.delay(1)


//SELECT MENU CREDIT REVIEW========================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/img_Welcome, ERIC LUSTON, FLEET JAKARTA, Cr_a38710'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/img_Welcome, ERIC LUSTON, FLEET JAKARTA, Cr_a38710'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/img_Welcome, ERIC LUSTON, FLEET JAKARTA, Cr_a38710'))
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/img_Welcome, ERIC LUSTON, FLEET JAKARTA, Cr_a38710'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_Credit Review'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_Credit Review'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/a_Credit Review'))
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_Credit Review'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL========================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'))
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), appNo)

WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/input_UNGRADED_gvCreditReviewctl02imbReview'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/input_UNGRADED_gvCreditReviewctl02imbReview'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/input_UNGRADED_gvCreditReviewctl02imbReview'))
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/input_UNGRADED_gvCreditReviewctl02imbReview'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_APPROVAL RECOMMENDATION'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_APPROVAL RECOMMENDATION'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/a_APPROVAL RECOMMENDATION'))
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_APPROVAL RECOMMENDATION'))

WebUI.waitForElementPresent(findTestObject('FLEET/Credit Review/select_Select OneCredit Approval'), 30)
WebUI.verifyElementPresent(findTestObject('FLEET/Credit Review/select_Select OneCredit Approval'), 30)
WebUI.verifyElementClickable(findTestObject('FLEET/Credit Review/select_Select OneCredit Approval'))
WebUI.scrollToElement(findTestObject('FLEET/Credit Review/select_Select OneCredit Approval'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Credit Review/select_Select OneCredit Approval'), '158', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/select_Select OneELU0538PWS1447'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/select_Select OneELU0538PWS1447'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/select_Select OneELU0538PWS1447'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Credit Review/select_Select OneELU0538PWS1447'), '292206', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Notes_ucApvtxtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Notes_ucApvtxtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/textarea_Notes_ucApvtxtNotes'))
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Notes_ucApvtxtNotes'), notes)

WebUI.waitForElementPresent(findTestObject('FLEET/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'), 30)
WebUI.verifyElementPresent(findTestObject('FLEET/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'), 30)
WebUI.verifyElementClickable(findTestObject('FLEET/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'))
WebUI.scrollToElement(findTestObject('FLEET/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'), 0)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'), review)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor - Faktor Mendukung_rptApvRc_3308d4'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor - Faktor Mendukung_rptApvRc_3308d4'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor - Faktor Mendukung_rptApvRc_3308d4'))
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor - Faktor Mendukung_rptApvRc_3308d4'), review)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor-Faktor Tidak  Kurang Menduk_e9ef39'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor-Faktor Tidak  Kurang Menduk_e9ef39'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor-Faktor Tidak  Kurang Menduk_e9ef39'))
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor-Faktor Tidak  Kurang Menduk_e9ef39'), review)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'))
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), review)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_CA Calculation_rptApvRcmndtnctl04t_768d1e'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/textarea_CA Calculation_rptApvRcmndtnctl04t_768d1e'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/textarea_CA Calculation_rptApvRcmndtnctl04t_768d1e'))
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_CA Calculation_rptApvRcmndtnctl04t_768d1e'), review)

WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/FLEET/Credit Review/a_Submit'))
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_Submit'))
WebUI.delay(5)


//CLOSE BROWSER========================================================================================================================================================================================================
WebUI.closeBrowser()

