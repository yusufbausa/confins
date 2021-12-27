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

//OPEN BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL================================================================================================================================================================================================================================================================================================================
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


//SELECT ADMIN ROLE================================================================================================================================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_select_profile'))
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//SELECT MENU COPY CANCEL================================================================================================================================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.click(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/span_Application Inquiry_rtPlus'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/span_Application Inquiry_rtPlus'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/span_Application Inquiry_rtPlus'))
WebUI.click(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/span_Application Inquiry_rtPlus'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Application  Agreement Cancellation'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Application  Agreement Cancellation'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Application  Agreement Cancellation'))
WebUI.click(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Application  Agreement Cancellation'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'))
WebUI.setText(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), appNo)

WebUI.click(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_Product Offering Name_ucSearchbtnSearch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_MULTIGUNA NON PAKET_gvApplicationctl0_7b71ef'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_MULTIGUNA NON PAKET_gvApplicationctl0_7b71ef'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_MULTIGUNA NON PAKET_gvApplicationctl0_7b71ef'))
WebUI.click(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/input_MULTIGUNA NON PAKET_gvApplicationctl0_7b71ef'))
WebUI.delay(1)


//COPY CANCEL PROCESS================================================================================================================================================================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/select_Select OneBarang Tidak AdaTC tidak l_64b161'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/select_Select OneBarang Tidak AdaTC tidak l_64b161'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/select_Select OneBarang Tidak AdaTC tidak l_64b161'))
WebUI.selectOptionByValue(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/select_Select OneBarang Tidak AdaTC tidak l_64b161'), '410', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/textarea_Notes_txtNotes'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/textarea_Notes_txtNotes'))
WebUI.setText(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/textarea_Notes_txtNotes'), 'Cancel')

WebUI.waitForElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Submit'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Submit'))
WebUI.click(findTestObject('Object Repository/COPY CANCEL/Application Agreement Cancellation/a_Submit'))
WebUI.delay(5)


//CLOSE BROWSER================================================================================================================================================================================================================================================================================================================
//WebUI.closeBrowser()

