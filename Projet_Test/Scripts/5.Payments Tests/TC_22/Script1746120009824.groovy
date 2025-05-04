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

WebUI.click(findTestObject('Object Repository/TC_22/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/TC_22/Page_Customer Login/input_Email_loginusername'), 'aa@g.tt')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_22/Page_Customer Login/input_Password_loginpassword'), 'tHbsfdvtf1jw79vktusGkA==')

WebUI.click(findTestObject('Object Repository/TC_22/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Home Page/img_Hot Sellers_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Radiant Tee/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Radiant Tee/div_Color_option-label-color-93-item-50'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Radiant Tee/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Radiant Tee/img_28.00_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Iris Workout Top/div_XS'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Iris Workout Top/div_Color_option-label-color-93-item-50'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Iris Workout Top/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Iris Workout Top/a_My Cart                    2             _098ac7'))

WebUI.click(findTestObject('Object Repository/TC_22/Page_Iris Workout Top/button_Proceed to Checkout'))

boolean resume = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_22/Page_Checkout/span_Order Summary'), 0)

WebUI.click(findTestObject('Object Repository/TC_22/Page_Checkout/div_2                        Items in Cart'))

boolean resProd1 = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_22/Page_Checkout/strong_Radiant Tee'), 0)

boolean resProd2 = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_22/Page_Checkout/strong_Iris Workout Top'), 0)

if (resume && resProd1 && resProd2) {
	WebUI.comment('Test réussi : Il ya un résumé de commande avant la validation.')
} else {
	WebUI.comment('Test échoué : Pas du résumé de commande avant la validation.')
}

WebUI.closeBrowser()

