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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/input_Username_username'), user)

WebUI.setText(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/input_Password_password'), password)

WebUI.sendKeys(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/h2_Make Appointment'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment')

WebUI.click(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/a_Profile'))

WebUI.click(findTestObject('Object Repository/hh/Page_CURA Healthcare Service/a_Logout'))

WebUI.closeBrowser()
