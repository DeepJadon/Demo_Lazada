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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

TestData accounts = findTestData(DataFile)

int rownum = CustomKeywords.'com.excel.WriteExcel.findRow'(SheetName, TestCaseID)

'Launch & Login FlipKart Application'
WebUI.callTestCase(findTestCase('ReusableFunction/LaunchandLoginApplication'), [('rownum') : rownum], FailureHandling.STOP_ON_FAILURE)

'Search Product by Name'
WebUI.callTestCase(findTestCase('ReusableFunction/SearchProductByName'), [:], FailureHandling.STOP_ON_FAILURE)

'Add Product to Cart'
WebUI.callTestCase(findTestCase('ReusableFunction/AddProducttoCart'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout from Application'
WebUI.callTestCase(findTestCase('ReusableFunction/LogoutFromApplication'), [:], FailureHandling.STOP_ON_FAILURE)