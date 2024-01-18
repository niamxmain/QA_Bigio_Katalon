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

WebUI.click(findTestObject('Object Repository/Page_Sign In - Ultimate QA/a_Create a new account'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/input_userfirst_name'), 'John')

WebUI.setText(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/input_userlast_name'), 'Doe')

WebUI.setText(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/input_useremail'), 'emailtesting@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/input_userpassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/input_userterms'))

WebUI.click(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/button_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/img_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/img_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/img_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Create a new account - Ultimate QA/button_Verify'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_All Products - Ultimate QA/a_My Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_All Products - Ultimate QA/i_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Page_All Products - Ultimate QA/a_Sign Out'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Ultimate QA/h2_Ultimate QA'))

WebUI.closeBrowser()

