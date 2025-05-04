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

WebUI.click(findTestObject('Object Repository/TC_21/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/TC_21/Page_Customer Login/input_Email_loginusername'), 'aa@g.tt')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_21/Page_Customer Login/input_Password_loginpassword'), 'tHbsfdvtf1jw79vktusGkA==')

WebUI.click(findTestObject('Object Repository/TC_21/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/TC_21/Page_Home Page/img_Hot Sellers_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_21/Page_Radiant Tee/div_Color_option-label-color-93-item-50'))

WebUI.click(findTestObject('Object Repository/TC_21/Page_Radiant Tee/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_21/Page_Radiant Tee/a_My Cart                    1             _241c1f'))

WebUI.click(findTestObject('Object Repository/TC_21/Page_Radiant Tee/span_View and Edit Cart'))

WebUI.click(findTestObject('Object Repository/TC_21/Page_Shopping Cart/span_Proceed to Checkout'))

boolean champStreet1 = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_21/Page_Checkout/input_Street Address Line 1_street0'), 
    0)

boolean champStreet2 = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_21/Page_Checkout/input_Street Address Line 2_street1'), 
    0)

boolean champStreet3 = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_21/Page_Checkout/input_Street Address Line 3_street2'), 
    0)

boolean champCity = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_21/Page_Checkout/input_City_city'), 0)

boolean champCode = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_21/Page_Checkout/input_ZipPostal Code_postcode'), 
    0)

boolean champPhone = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_21/Page_Checkout/input_Phone Number_telephone'), 
    0)


if (champStreet1 && champStreet2 && champStreet3 && champCity && champCode && champPhone) {
	WebUI.comment('Test réussi : La page de paiement est bien affichée et les champs obligatoires sont présents.')
} else {
	WebUI.comment('Test échoué : La page de paiement ne s\'est pas chargée correctement ou des champs sont manquants.')
}


WebUI.closeBrowser()

