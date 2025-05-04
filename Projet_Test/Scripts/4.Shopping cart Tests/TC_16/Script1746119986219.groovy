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

WebUI.setText(findTestObject('Object Repository/TC_16/Page_Home Page/input_Search_q'), 'hoodie')

WebUI.click(findTestObject('Object Repository/TC_16/Page_Home Page/button_Search'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Search results for hoodie/img_Related search terms_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Selene Yoga Hoodie/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Selene Yoga Hoodie/div_Color_option-label-color-93-item-57'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Selene Yoga Hoodie/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Selene Yoga Hoodie/img_Related Products_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Diva Gym Tee/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Diva Gym Tee/div_Color_option-label-color-93-item-53'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Diva Gym Tee/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Diva Gym Tee/a_My Cart                    2             _098ac7'))

WebUI.click(findTestObject('Object Repository/TC_16/Page_Diva Gym Tee/span_View and Edit Cart'))


String prix1=WebUI.getText(findTestObject('Object Repository/TC_16/Page_Shopping Cart/span_42.00'))
String prix2=WebUI.getText(findTestObject('Object Repository/TC_16/Page_Shopping Cart/span_32.00'))
String prixTotal=WebUI.getText(findTestObject('Object Repository/TC_16/Page_Shopping Cart/span_74.00'))

double prix1Num = Double.parseDouble(prix1.replace('$', '').trim())
double prix2Num = Double.parseDouble(prix2.replace('$', '').trim())
double prixTotalNum = Double.parseDouble(prixTotal.replace('$', '').trim())

double totalAttendu = prix1Num + prix2Num 

WebUI.verifyEqual(prixTotalNum, totalAttendu, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
