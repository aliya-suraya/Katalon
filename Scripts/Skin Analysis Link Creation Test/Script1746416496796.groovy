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

WebUI.click(findTestObject('Object Repository/Page_Login  Wecloud/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Wecloud/div_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Customers  Wecloud/a_hi suraya test_ven'))

WebUI.click(findTestObject('Object Repository/Page_Customer - 191050 hi suraya test_ven  Wecloud/a_Skin Analysis'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Beaute Library'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Copy Link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://skin-staging.wecloud.software/?v=b70e406b1a5ca3c2a914db1bd712dd81&type=skin-analysis')

WebUI.switchToWindowTitle('Wecloud')

WebUI.click(findTestObject('Object Repository/Page_Wecloud/span_Beaute Library'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/li_Venusde'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Copy Link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://skin-staging.wecloud.software/?v=04e6f3a3cab523a5c32d09fa449da014&type=skin-analysis')

WebUI.switchToWindowTitle('Wecloud')

WebUI.click(findTestObject('Object Repository/Page_Wecloud/span_Venusde'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Curvena'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Copy Link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://skin-staging.wecloud.software/?v=bc3d47d9bbff75a68187bd4660d5a348&type=skin-analysis')

WebUI.switchToWindowTitle('Wecloud')

WebUI.click(findTestObject('Object Repository/Page_Wecloud/span_Curvena'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/div_Bplus'))

WebUI.click(findTestObject('Object Repository/Page_Wecloud/button_Copy Link'))

WebUI.newTab('')

WebUI.navigateToUrl('https://skin-staging.wecloud.software/?v=2d168d1ee7d6c4f6cbf89e8c8c158cfa&type=skin-analysis')

WebUI.closeBrowser()

