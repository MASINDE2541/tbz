import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.projects.headerguru.com/eastwaymedical/book-appointment/')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Book appointment details/click_on book online tab'))

WebUI.click(findTestObject('Book appointment details/click_new patient'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Book appointment details/input_date of birth'))

WebUI.click(findTestObject('Book appointment details/input_day of birth'))

WebUI.delay(3)

WebUI.click(findTestObject('Book appointment details/input_time'))

WebUI.setText(findTestObject('Book appointment details/input_first name'), firstname)

WebUI.sendKeys(findTestObject('Book appointment details/input_lastname'), lastname)

WebUI.sendKeys(findTestObject('Book appointment details/input_email address'), email)

WebUI.sendKeys(findTestObject('Book appointment details/input_mobile no'), mobile)

WebUI.click(findTestObject('Book appointment details/click on d.o.b of patient'))

WebUI.click(findTestObject('Book appointment details/click_month'))

WebUI.click(findTestObject('Book appointment details/click on patient year of birth'))

WebUI.click(findTestObject('Book appointment details/click on date of patient'))

WebUI.click(findTestObject('Book appointment details/input_gender'))

WebUI.click(findTestObject('Book appointment details/click_provider'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Book appointment details/input reason for visit'), 'errrr ffffjhfbf')

