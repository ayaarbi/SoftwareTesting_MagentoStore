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

WebUI.setText(findTestObject('Object Repository/TC_17/Page_Home Page/input_Search_q'), 'hoodie')

WebUI.click(findTestObject('Object Repository/TC_17/Page_Home Page/button_Search'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Search results for hoodie/img_Related search terms_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Selene Yoga Hoodie/div_XSSMLXL'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Selene Yoga Hoodie/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Selene Yoga Hoodie/div_Color_option-label-color-93-item-57'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Selene Yoga Hoodie/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Selene Yoga Hoodie/img_Related Products_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Diva Gym Tee/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Diva Gym Tee/div_Color_option-label-color-93-item-53'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Diva Gym Tee/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Diva Gym Tee/img_29.00_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Elisa EverCool Tee/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Elisa EverCool Tee/div_Color_option-label-color-93-item-52'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Elisa EverCool Tee/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Elisa EverCool Tee/a_My Cart                    3             _2914b4'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Elisa EverCool Tee/span_View and Edit Cart'))

String prix1 = WebUI.getText(findTestObject('Object Repository/TC_17/Page_Shopping Cart/span_42.00'))

String prix2 = WebUI.getText(findTestObject('Object Repository/TC_17/Page_Shopping Cart/span_32.00'))

prix3 = WebUI.getText(findTestObject('Object Repository/TC_17/Page_Shopping Cart/span_29.00'))

prixTotal = WebUI.getText(findTestObject('Object Repository/TC_17/Page_Shopping Cart/span_103.00'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Shopping Cart/a_Remove item'))

WebUI.click(findTestObject('Object Repository/TC_17/Page_Shopping Cart/span_Update Shopping Cart'))

String prix1Mij = WebUI.getText(findTestObject('Object Repository/TC_17/Page_Shopping Cart/span_42.00'))

String prix2Mij = WebUI.getText(findTestObject('TC_17/Page_Shopping Cart/span_29.00 - 1'))

String prixTotalMij = WebUI.getText(findTestObject('Object Repository/TC_17/Page_Shopping Cart/span_71.00'))

//avant suppression
double prix1Num = Double.parseDouble(prix1.replace('$', '').trim())

double prix2Num = Double.parseDouble(prix2.replace('$', '').trim())

double prix3Num = Double.parseDouble(prix3.replace('$', '').trim())

double prixTotalNum = Double.parseDouble(prixTotal.replace('$', '').trim())

// Vérifier si le prix total initial est correct
double totalAttenduInitial = (prix1Num + prix2Num) + prix3Num

WebUI.verifyEqual(prixTotalNum, totalAttenduInitial, FailureHandling.CONTINUE_ON_FAILURE)

//après suppression
double prix1MijNum = Double.parseDouble(prix1Mij.replace('$', '').trim())

double prix2MijNum = Double.parseDouble(prix2Mij.replace('$', '').trim())

double prixTotalMijNum = Double.parseDouble(prixTotalMij.replace('$', '').trim())

// Calculer le total attendu après suppression
double totalAttenduMij = prix1MijNum + prix2MijNum

// Vérifier si le prix total après suppression est correct
WebUI.verifyEqual(prixTotalMijNum, totalAttenduMij, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

