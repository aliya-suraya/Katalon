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

WebUI.navigateToUrl('https://v2-staging.wecloud.software/login?redirect=%2Fadmin%2Fticketing%2Fcustomer-care-ticketing')

WebUI.setText(findTestObject('Object Repository/Page_Login  Wecloud/input_Email_email'), 'aliya.suraya@emax-international.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Wecloud/input_Password_password'), 'HwXnxaZD17M=')

WebUI.click(findTestObject('Object Repository/Page_Login  Wecloud/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Wecloud/div_Ticketing'))

WebUI.click(findTestObject('Object Repository/Page_Customer Care  Wecloud/a_Customer Care Ticketing'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/button_All'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/li_Low'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/button_Apply Filters'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/div_Overdue80'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/button_Low'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/li_Medium'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/button_Apply Filters'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/button_Medium'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/li_High'))

WebUI.click(findTestObject('Object Repository/Page_Ticketing  Wecloud/button_Apply Filters'))

WebUI.closeBrowser()

