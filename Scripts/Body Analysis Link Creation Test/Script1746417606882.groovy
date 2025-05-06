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

WebUI.navigateToUrl('https://v2-staging.wecloud.software/login?redirect=%2Fadmin%2Fcustomers%2F191050')

WebUI.setText(findTestObject('Object Repository/Page_Login  Wecloud/input_Email_email'), 'aliya.suraya@emax-international.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Wecloud/input_Password_password'), 'HwXnxaZD17M=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login  Wecloud/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Wecloud/div_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Customers  Wecloud/a_hi suraya test_ven'))

WebUI.click(findTestObject('Object Repository/Page_Customer - 191050 hi suraya test_ven  Wecloud/a_Body Analysis'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Beaute Library'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Copy Link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://body-staging.wecloud.software/?v=b3e43798c923a7b178a99e501fd0b9d5&type=body-analysis')

WebUI.switchToWindowTitle('Wecloud')

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Beaute Library_1'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Venusde'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Create 18 hours link'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Copy Link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://body-staging.wecloud.software/?v=1e0e851392455f5df892377c6cf1f0fd&type=body-analysis')

WebUI.switchToWindowTitle('Wecloud')

WebUI.click(findTestObject('Object Repository/Page_Wecloud/span_Venusde'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/li_Curvena'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Create 18 hours link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://body-staging.wecloud.software/?v=b3eb9e781a8c300c17b68a8e178f4165&type=body-analysis')

WebUI.switchToWindowTitle('Wecloud')

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Curvena'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Bplus'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Create 18 hours link'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Copy Link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://body-staging.wecloud.software/?v=c3c27b491e749c1cf594508d53075c25&type=body-analysis')

WebUI.closeBrowser()

