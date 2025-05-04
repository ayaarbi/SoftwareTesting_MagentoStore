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

WebUI.click(findTestObject('Object Repository/Page_Jackets - Tops - Women/img_Add to Compare_product-image-photo'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_Color_option-label-color-93-item-50'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/a_My Cart                    1             _241c1f'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_View and Edit Cart'))

WebUI.clearText(findTestObject('Object Repository/Page_Shopping Cart/input_Qty_cart695895qty'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Shopping Cart/input_Qty_cart695895qty'), '3')

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Update Shopping Cart'))

// Nettoyer le texte pour retirer les caractères non numériques (comme le symbole '$')
String prixUnitaireS = WebUI.getText(findTestObject('Object Repository/Page_Shopping Cart/span_77.00'))
prixUnitaireS = prixUnitaireS.replaceAll("[^0-9]", "")  // Supprimer tout caractère non numérique
int prixUnitaireI = Integer.parseInt(prixUnitaireS)

String qteS = WebUI.getAttribute(findTestObject('Object Repository/Page_Shopping Cart/input_Qty_cart695895qty'), 'value')

int qteI = Integer.parseInt(qteS)

int prixTotaleExpected = prixUnitaireI * qteI

// Nettoyer le texte du prix total
String prixTotalS = WebUI.getText(findTestObject('Object Repository/Page_Shopping Cart/span_231.00'))
prixTotalS = prixTotalS.replaceAll("[^0-9]", "")  // Supprimer tout caractère non numérique
int prixTotalI = Integer.parseInt(prixTotalS)

// Comparer les prix attendus et réels
assert prixTotaleExpected == prixTotalI

WebUI.closeBrowser()

