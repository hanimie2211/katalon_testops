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
//import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://automationexercise.com/', FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Automation Exercise/a_Signup  Login'))

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Signup/h2_New User Signup'), 0)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_New User Signup_name'), 'Hani Mie')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_New User Signup_email'), 'hani.vo@katalon.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/divuniform-id_gender2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_password'), 'YseElnNzbkY6Ohrhsva7ew==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
    '2003', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_first_name'), 'Hani')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_last_name'), 'Vo')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_company'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_address1'), 'Viettel Tower')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_address2'), '')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_address2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Singapore', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Singapore', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Singapore', true)

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_state'), 'Vnam')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_city'), 'HCMC')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_zipcode'), '70000')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_mobile_number'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))

not_run: WebUI.navigateToUrl('https://automationexercise.com/account_created')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Created'), 
    2)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

