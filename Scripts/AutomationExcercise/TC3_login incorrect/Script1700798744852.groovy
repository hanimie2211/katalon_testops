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

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/Page_Automation Exercise/img'), 0)

not_run: WebUI.navigateToUrl('https://automationexercise.com/')

not_run: WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Signup  Login'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_Login to your account'), 
    0)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_email'), 'hani.vo@katalon.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_password'), 
    'f4JIPmZZZgQ=')

not_run: WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Login'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as Hani'), 0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Delete Account'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Deleted'), 
    0)

not_run: WebUI.closeBrowser()

