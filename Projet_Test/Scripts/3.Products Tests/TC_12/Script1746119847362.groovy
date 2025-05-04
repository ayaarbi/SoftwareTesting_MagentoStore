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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Page_Home Page/span_concat(What, , s New)_ui-menu-icon ui-_fd086e'))

WebUI.click(findTestObject('Object Repository/Page_Women/a_Jackets'))

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Women/div_Color'))

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Women/div_Color_swatch-option color'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Set Descending Direction_product-image-photo'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2_3_4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2_3_4_5'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Jackets - Tops - Women/select_Position                            _dfbece'), 
    'price', true)

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Women/a_Set Ascending Direction'))


String prix1 =  WebUI.getText(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Set Descending Direction_product-image-photo_1'))

String prix2 =  WebUI.getText(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2_3_4_5_6'))

String prix3 = WebUI.getText(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2_3_4_5_6_7'))

assert prix1 >= prix2
assert prix2 >= prix3

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Women/a_Set Descending Direction'))

String prix4 =  WebUI.getText(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo'))

String prix5 =  WebUI.getText(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2_3_4_5_6_7_8'))

String prix6 =  WebUI.getText(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo_1_2_3_4_5_6_7_8_9'))

assert prix4 >= prix5
assert prix5 >= prix6
WebUI.closeBrowser()

