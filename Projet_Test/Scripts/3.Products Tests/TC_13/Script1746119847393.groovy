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

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_S'))

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/div_Color_option-label-color-93-item-57'))

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/span_Add to Cart'))

WebUI.delay(5)

WebUI.verifyTextPresent('You added Olivia 1/4 Zip Light Jacket to your shopping cart.', false)

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/a_My Cart                    1             _241c1f'))

WebUI.click(findTestObject('Object Repository/Page_Olivia 14 Zip Light Jacket/span_View and Edit Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/img_Subtotal_product-image-photo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/a_Olivia 14 Zip Light Jacket'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/dd_S'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/dd_Purple'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/span_77.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/span_77.00_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.click(findTestObject('Object Repository/Page_Men/a_Jackets'))

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Men/img_Add to Compare_product-image-photo'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/div_Color_option-label-color-93-item-58'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_Add to Cart'))

WebUI.delay(5)

WebUI.verifyTextPresent('You added Montana Wind Jacket to your shopping cart.', false)

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/a_My Cart                    2             _098ac7'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_View and Edit Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/img_Subtotal_product-image-photo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/a_Olivia 14 Zip Light Jacket'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/dd_S'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/dd_Purple'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/span_77.00_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/img_Remove item_product-image-photo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/a_Montana Wind Jacket'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/dd_M'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/dd_Red'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/span_49.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shopping Cart/span_49.00_1'), 0)

WebUI.closeBrowser()

