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

WebUI.click(findTestObject('Object Repository/TC_19/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/TC_19/Page_Customer Login/input_Email_loginusername'), 'a@g.tt')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_19/Page_Customer Login/input_Password_loginpassword'), 'tHbsfdvtf1jw79vktusGkA==')

WebUI.click(findTestObject('Object Repository/TC_19/Page_Customer Login/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/TC_19/Page_Home Page/input_Search_q'), 'hoodie')

WebUI.click(findTestObject('Object Repository/TC_19/Page_Home Page/button_Search'))

WebUI.click(findTestObject('Object Repository/TC_19/Page_Search results for HOODIE/img_Related search terms_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_19/Page_Selene Yoga Hoodie/span_Add to Wish List'))

WebUI.waitForElementVisible(findTestObject('Object Repository/TC_19/Page_My Wish List/a_Selene Yoga Hoodie'), 10)

// Vérifier que le produit est bien affiché dans le wishList
boolean produitPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_19/Page_My Wish List/a_Selene Yoga Hoodie'), 5, FailureHandling.CONTINUE_ON_FAILURE)

// Vérification finale du test
if (produitPresent) {
	WebUI.comment('Test réussi : Le produit est dans le whishList.')
} else {
	WebUI.comment('Test échoué : Le produit n\'existe pas.')
}


WebUI.closeBrowser()

