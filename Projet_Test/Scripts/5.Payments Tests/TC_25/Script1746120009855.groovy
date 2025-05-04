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

WebUI.click(findTestObject('Object Repository/TC_25/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/TC_25/Page_Customer Login/input_Email_loginusername'), 'a@g.tt')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_25/Page_Customer Login/input_Password_loginpassword'), 'tHbsfdvtf1jw79vktusGkA==')

WebUI.click(findTestObject('Object Repository/TC_25/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/TC_25/Page_Home Page/button_Change'))

WebUI.click(findTestObject('Object Repository/TC_25/Page_Home Page/a_My Account'))

WebUI.click(findTestObject('Object Repository/TC_25/Page_My Account/a_My Orders'))

WebUI.click(findTestObject('Object Repository/TC_25/Page_My Orders/span_View Order'))

boolean commande = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_25/Page_Order  000048518/span_Order  000048518'), 
    0)

boolean commandeInfo = WebUI.verifyElementPresent(findTestObject('Object Repository/TC_25/Page_Order  000048518/strong_Order Information'), 
    0)

if (commande && commandeInfo) {
	WebUI.comment('Test réussi : les informations de la commande existent apres l\'achat.')
} else {
	WebUI.comment('Test échoué : les informations de la commande n\'existent pas apres l\'achat')
}


WebUI.closeBrowser()

