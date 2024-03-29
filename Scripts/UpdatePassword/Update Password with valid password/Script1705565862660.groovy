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

WebUI.navigateToUrl('https://courses.ultimateqa.com/')

WebUI.click(findTestObject('Object Repository/Page_Ultimate QA/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In - Ultimate QA/input_useremail'), 'asepudy316@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In - Ultimate QA/input_userpassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign In - Ultimate QA/input_userremember_me'))

WebUI.click(findTestObject('Object Repository/Page_Sign In - Ultimate QA/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_My Dashboard - Ultimate QA/button_asep u'))

WebUI.click(findTestObject('Object Repository/Page_My Dashboard - Ultimate QA/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Edit Profile - Ultimate QA/a_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password - Ultimate QA/input_userpassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password - Ultimate QA/input_userpassword_confirmation'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password - Ultimate QA/input_usercurrent_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_Password - Ultimate QA/input_commit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Password - Ultimate QA/p_Successfully updated your password'))

WebUI.closeBrowser()

