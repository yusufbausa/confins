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


//select role
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Select'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Select'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Select'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Select'))
WebUI.delay(1)


//select menu borrow request
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _fa0b52'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _fa0b52'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _fa0b52'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _fa0b52'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Request/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTMARKETINGAPPLICATION FOUNDATION'), 
    '121', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/span_Receive_rtPlus'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/span_Receive_rtPlus'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/span_Receive_rtPlus'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/span_Receive_rtPlus'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Request'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Request'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Request'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Request'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'))
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), agreeNo)

WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Main Document Status_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_On Hand_gvAssetListctl02imbBrw'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_On Hand_gvAssetListctl02imbBrw'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/input_On Hand_gvAssetListctl02imbBrw'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/input_On Hand_gvAssetListctl02imbBrw'))
WebUI.delay(1)


//borrow request process
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_BORROW_gvDocListctl01cbAll'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_BORROW_gvDocListctl01cbAll'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/input_BORROW_gvDocListctl01cbAll'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/input_BORROW_gvDocListctl01cbAll'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Borrower NameBorrower Company_txtBorr_045804'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Borrower NameBorrower Company_txtBorr_045804'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Borrower NameBorrower Company_txtBorr_045804'))
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Borrower NameBorrower Company_txtBorr_045804'), borrower)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'))
WebUI.sendKeys(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Asset Document/Borrow/Request/input_Expected Return Date_ucExpReturnDttxt_67078d'), returnDate)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OnePERBAIKAN DATA DI BPKB PER_489799'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OnePERBAIKAN DATA DI BPKB PER_489799'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OnePERBAIKAN DATA DI BPKB PER_489799'))
WebUI.scrollToElement(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OnePERBAIKAN DATA DI BPKB PER_489799'), 10)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OnePERBAIKAN DATA DI BPKB PER_489799'), '325', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OneDMN1556WYU0489'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OneDMN1556WYU0489'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OneDMN1556WYU0489'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OneDMN1556WYU0489'), approvedBy, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Asset Document/Borrow/Request/select_Select OneDMN1556WYU0489'), approvedBy, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/textarea_Notes_ucApprovaltxtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/textarea_Notes_ucApprovaltxtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/textarea_Notes_ucApprovaltxtNotes'))
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Request/textarea_Notes_ucApprovaltxtNotes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Submit'))
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Request/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

