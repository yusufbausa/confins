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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://confins-qa.taf.co.id/confins/')

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Copyright  AdIns 2011. All Right Rese_e6b1e8'), 
    'TUN0391')

WebUI.setEncryptedText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Copyright  AdIns 2011. All Right Rese_092e4f'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Copyright  AdIns 2011. All Right Rese_9109c2'))

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/a_Select'))

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/img_Welcome, TYAS UNTORO, REMEDIAL AREA 1, _516a29'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_LOAN ORIGINATIONACCOUNT MAINTENANCEAMENDMENTCOMMON SETTINGOPERATIONCOLLECTIONREMEDIALINVENTORY ASSET MANAGEMENTLITIGATION'), 
    '303', true)

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/a_Remedial Expense'))

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/a_Remedial Expense Request'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 
    '2165102698')

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_Select OneRemedial 1Remedial 2'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_License Plate No_ucSearchbtnSearch'))

WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_External Fee_ucRoSEstimationucINCollE_a1153d'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_External Fee_ucRoSEstimationucINCollE_a1153d'), 
    '500000')

WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Settlement Fee_ucRoSEstimationucINCol_47dafa'))

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Settlement Fee_ucRoSEstimationucINCol_47dafa'))

WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Settlement Fee_ucRoSEstimationucINCol_47dafa'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Settlement Fee_ucRoSEstimationucINCol_47dafa'), 
    '500000')

WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Mobilization Fee_ucRoSEstimationucINC_6747cf'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Mobilization Fee_ucRoSEstimationucINC_6747cf'), 
    '500000')

WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Delivery Charges_ucRoSEstimationucINC_31f880'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Delivery Charges_ucRoSEstimationucINC_31f880'), 
    '500000')

WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Other Repossession Fee_ucRoSEstimatio_998e12'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Other Repossession Fee_ucRoSEstimatio_998e12'), 
    '500000')

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_Select OneP01INTERNAL ADMINISTRATION_77a068'), 
    'P06', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_Select OneCustomerOrganisasi Masyara_14a56e'), 
    'REM_UHLD_CUST', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_Select OneDalam Kota (60 KM)Luar Kot_5b5b95'), 
    'REM_ULOC_IN_CITY', true)

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/textarea_Notes_ucAnalysistxtAnalysisNotes'), 
    'notes')

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_LTVLoan To Value_lbCalculate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_Select OneAAN FRASELA (Internal)ACHM_447e81'), 
    '12387', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_Select OneBTC  ETLitigationOthersRep_cf2543'), 
    'REM_HNDL_REPO', true)

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/textarea_Notes_ucActiontxtActionNotes'), 
    'notes')

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/input_Advance Settlement_cbIsAdvance'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_disburse_to'), '65', false)

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/textarea_Notes_txtReqNotes'), 
    'notes')

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Expense v3/Additional Disburse To/select_Select OneBIAYA PENANGANAN EKSTERNAL_be58e2'), 
    '245', true)

WebUI.closeBrowser()

