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

WebUI.click(findTestObject('Object Repository/TC_20/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/TC_20/Page_Customer Login/input_Email_loginusername'), 'a@g.tt')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_20/Page_Customer Login/input_Password_loginpassword'), 'tHbsfdvtf1jw79vktusGkA==')

WebUI.click(findTestObject('Object Repository/TC_20/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/TC_20/Page_Home Page/img_Hot Sellers_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_20/Page_Radiant Tee/span_Add to Compare'))

WebUI.click(findTestObject('Object Repository/TC_20/Page_Radiant Tee/img_28.00_product-image-photo'))

WebUI.click(findTestObject('Object Repository/TC_20/Page_Karissa V-Neck Tee/span_Add to Compare'))

WebUI.click(findTestObject('Object Repository/TC_20/Page_Karissa V-Neck Tee/a_Compare Products        2 items'))

WebUI.waitForElementVisible(findTestObject('Object Repository/TC_20/Page_Products Comparison List - Magento Commerce/a_Karissa V-Neck Tee'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/TC_20/Page_Products Comparison List - Magento Commerce/a_Radiant Tee'), 
    0)

// Vérifier que le produit est bien affiché dans le wishList
boolean produit1Present = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_20/Page_Products Comparison List - Magento Commerce/a_Karissa V-Neck Tee'), 5, FailureHandling.CONTINUE_ON_FAILURE)
boolean produit2Present = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_20/Page_Products Comparison List - Magento Commerce/a_Radiant Tee'), 5, FailureHandling.CONTINUE_ON_FAILURE)

// Vérification finale du test
if (produit1Present && produit2Present) {
	WebUI.comment('Test réussi : Les produits sont dans la liste de comparaison.')
} else {
	WebUI.comment('Test échoué : Les produits n\'existent pas.')
}


WebUI.closeBrowser()

