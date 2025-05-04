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

WebUI.click(findTestObject('Object Repository/TC_23/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/TC_23/Page_Customer Login/input_Email_loginusername'), 'a@g.tt')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_23/Page_Customer Login/input_Password_loginpassword'), 'tHbsfdvtf1jw79vktusGkA==')

WebUI.click(findTestObject('Object Repository/TC_23/Page_Customer Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Home Page/img_Hot Sellers_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Radiant Tee/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Radiant Tee/div_Color_option-label-color-93-item-50'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Radiant Tee/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Radiant Tee/span_1'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Radiant Tee/span_View and Edit Cart'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Shopping Cart/span_Proceed to Checkout'))

WebUI.setText(findTestObject('TC_23/Page_Checkout/input_Street Address Line 1_street0'), '&')

WebUI.setText(findTestObject('Object Repository/TC_23/Page_Checkout/input_Street Address Line 2_street1'), 'é')

WebUI.setText(findTestObject('Object Repository/TC_23/Page_Checkout/input_Street Address Line 3_street2'), '"')

WebUI.setText(findTestObject('Object Repository/TC_23/Page_Checkout/input_City_city'), 'azerty')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC_23/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/TC_23/Page_Checkout/input_ZipPostal Code_postcode'), '1234')

WebUI.setText(findTestObject('Object Repository/TC_23/Page_Checkout/input_Phone Number_telephone'), '123456789')

WebUI.click(findTestObject('Object Repository/TC_23/Page_Checkout/input_Carrier Title_ko_unique_5'))

WebUI.click(findTestObject('Object Repository/TC_23/Page_Checkout/button_Next'))

WebUI.delay(3)

// Vérifier si des messages d'erreur apparaissent sur les champs invalides
boolean erreurAdresse = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_23/Page_Checkout/span_Street address is invalid'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

boolean erreurCodePostal = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_23/Page_Checkout/span_Please enter a valid zip code'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

boolean erreurTelephone = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_23/Page_Checkout/span_Please enter a valid phone number'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

// Vérifier si le bouton "Next" est toujours actif (ce qui serait une erreur)
boolean boutonNextActif = WebUI.verifyElementClickable(findTestObject('Object Repository/TC_23/Page_Checkout/button_Next'), 
    FailureHandling.CONTINUE_ON_FAILURE)

// Vérification des résultats du test
if (((erreurAdresse && erreurCodePostal) && erreurTelephone) && !(boutonNextActif)) {
    WebUI.comment('Test réussi : Les erreurs sont bien détectées et la validation est bloquée.')
} else {
    WebUI.comment('Test échoué : La validation n’a pas fonctionné correctement.')
}

WebUI.closeBrowser()

