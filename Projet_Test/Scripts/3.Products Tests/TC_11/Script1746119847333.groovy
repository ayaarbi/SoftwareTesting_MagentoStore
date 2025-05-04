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

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Set Descending Direction_product-image-photo'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/price'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/titre_produit'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_XS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_S'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_M'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_L'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_XSSMLXL'))

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/black_color'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/img_black'), 0)

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_Black_option-label-color-93-item-50'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/img_blue'), 0)

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_Blue_option-label-color-93-item-57'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/img_purple'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/button_Add to Cart'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/a_Details'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/a_More Information'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/a_Reviews'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/span_Add to Wish List'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/span_Add to Compare'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_Skip to the end of the images gallery_f_cfa597'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_Skip to the end of the images gallery_f_cfa597_1'))

WebUI.closeBrowser()

