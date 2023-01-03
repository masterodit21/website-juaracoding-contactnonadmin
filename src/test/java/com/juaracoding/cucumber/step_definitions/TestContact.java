package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.cucumber.pages.ContactPage;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.AssertJUnit;

public class TestContact {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ContactPage contactPage = new ContactPage();

	public TestContact() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

//    Test Case 1
	@When("User berada di web Juara Coding")
	public void user_berada_di_web_juara_coding() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web Juara Coding");
	}

	@When("User click menu contact")
	public void user_click_menu_contact() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		contactPage.setBtn_contact();
		extentTest.log(LogStatus.PASS, "User click button contact");
	}

	@When("User input nama lengkap")
	public void user_input_nama_lengkap() {
		contactPage.setnamalengkap("wicaksono");
		extentTest.log(LogStatus.PASS, "User input nama lengkap");
	}

	@When("User input email")
	public void user_input_email() {
		contactPage.setEmail("wicaksono@mail.com");
		extentTest.log(LogStatus.PASS, "User input email valid");
	}

	@When("User input mobile phone")
	public void user_input_mobile_phone() {
		contactPage.setPhonenumber("089172366171");
		extentTest.log(LogStatus.PASS, "User input Phone number valid");
	}

	@When("User input Subject")
	public void user_input_subject() {
		contactPage.setSubject("test");
		extentTest.log(LogStatus.PASS, "User input Subject");
	}

	@When("User input Message")
	public void user_input_message() {
		contactPage.setMessage("Test ya kak");
		extentTest.log(LogStatus.PASS, "User input messsage");
	}

	@When("User click send")
	public void user_click_send() throws InterruptedException {
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("Pesan berhasil di kirim")
	public void pesan_berhasil_di_kirim() {
		AssertJUnit.assertEquals(contactPage.gettxtberhasil(), "Thank You for contact us");
		extentTest.log(LogStatus.PASS, "Pesan berhasil di kirim");
	}

// test 2

	@When("tc02 User input email")
	public void tc02_user_input_email() {
		contactPage.setEmail("wicaksono@mail.com");
		extentTest.log(LogStatus.PASS, "User input email valid");
	}

	@When("tc02 User input mobile phone")
	public void tc02_user_input_mobile_phone() {
		contactPage.setPhonenumber("089172366171");
		extentTest.log(LogStatus.PASS, "User input Phone number valid");
	}

	@When("tc02 User input Subject")
	public void tc02_user_input_subject() {
		contactPage.setSubject("test");
		extentTest.log(LogStatus.PASS, "User input Subject");
	}

	@When("tc02 User input Message")
	public void tc02_user_input_message() {
		contactPage.setMessage("Test ya kak");
		extentTest.log(LogStatus.PASS, "User input messsage");
	}

	@When("tc02 User click send")
	public void tc02_user_click_send() throws InterruptedException {
		Hooks.delay(3);
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("Pesan gagal di kirim")
	public void pesan_gagal_di_kirim() {
		AssertJUnit.assertEquals(contactPage.gettxtnullname(), "The name field is required.");
		extentTest.log(LogStatus.PASS, "Pesan gagal di kirim");
	}
// test 3
	@When("tcc03 User input nama lengkap")
	public void tcc03_user_input_nama_lengkap() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		contactPage.setnamalengkap("wicaksono");
		extentTest.log(LogStatus.PASS, "User input nama lengkap");
	}

	@When("tcc03 User Kosongkan email")
	public void tcc03_user_kosongkan_email() {
		contactPage.clearEmail();
		extentTest.log(LogStatus.PASS, "User Kosongkan email");
	}

	@When("tcc03 User click send")
	public void tcc03_user_click_send() throws InterruptedException {
		Hooks.delay(3);
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("tcc03 Pesan gagal di kirim")
	public void tcc03_pesan_gagal_di_kirim() {
		AssertJUnit.assertEquals(contactPage.gettxtnullemail(), "The email field is required.");
		extentTest.log(LogStatus.PASS, "Pesan gagal di kirim");
	}

// test 4
	@When("tcc04 User input email")
	public void tcc04_user_input_email() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		contactPage.setEmail("wicaksono@mail.com");
		extentTest.log(LogStatus.PASS, "User input email valid");
	}

	@When("tcc04 Kosongkan mobile phone")
	public void tcc04_user_kosongkan_mobile_phone() {
		contactPage.clearPhonenumber();
		extentTest.log(LogStatus.PASS, "User Kosongkan Mobile Phone");
	}

	@When("tcc04 User click send")
	public void tcc04_user_click_send() throws InterruptedException {
		Hooks.delay(3);
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("tcc04 Pesan gagal di kirim")
	public void tcc04_pesan_gagal_di_kirim() {
		AssertJUnit.assertEquals(contactPage.gettxtnullnumber(), "The phone field is required.");
		extentTest.log(LogStatus.PASS, "Pesan gagal di kirim");
	}

// test 5

	@When("tcc05 User input mobile phone")
	public void tcc05_user_input_mobile_phone() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		contactPage.setPhonenumber("089172366171");
		extentTest.log(LogStatus.PASS, "User input Phone number valid");
	}

	@When("tcc05 User Kosongkan Subject")
	public void tcc05_user_kosongkan_subject() {
		contactPage.clearSubject();
		extentTest.log(LogStatus.PASS, "User Kosongkan Subject");
	}

	@When("tcc05 User click send")
	public void tcc05_user_click_send() throws InterruptedException {
		Hooks.delay(3);
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("tcc05 Pesan gagal di kirim")
	public void tcc05_pesan_gagal_di_kirim() {
		AssertJUnit.assertEquals(contactPage.gettxtnullsubject(), "The subject field is required.");
		extentTest.log(LogStatus.PASS, "Pesan gagal di kirim");
	}

// test 6

	@When("tcc06 User input Subject")
	public void tcc06_user_input_subject() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		contactPage.setSubject("test");
		extentTest.log(LogStatus.PASS, "User input Subject");
	}

	@When("tcc06 User Kosongkan Message")
	public void tcc06_user_kosongkan_message() {
		contactPage.clearMessage();
		extentTest.log(LogStatus.PASS, "User Kosongkan Message");
	}

	@When("tcc06 User click send")
	public void tcc06_user_click_send() throws InterruptedException {
		Hooks.delay(3);
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("tcc06 Pesan gagal di kirim")
	public void tcc06_pesan_gagal_di_kirim() {
		extentTest.log(LogStatus.FAIL, "Pesan gagal di kirim (tidak muncul alert)");
	}

// test 7

	@When("tcc07 User input nama lengkap")
	public void tcc07_user_input_nama_lengkap() throws InterruptedException {
		contactPage.setBtn_contact();
		contactPage.setnamalengkap("wicaksono");
		extentTest.log(LogStatus.PASS, "User input nama lengkap");
	}

	@When("tcc07 User input email")
	public void tcc07_user_input_email() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		contactPage.setEmail("wicaksonomail.com");
		extentTest.log(LogStatus.PASS, "User input email valid");
	}

	@When("tcc07 User input mobile phone")
	public void tcc07_user_input_mobile_phone() {
		contactPage.setPhonenumber("089172366171");
		extentTest.log(LogStatus.PASS, "User input Phone number valid");
	}

	@When("tcc07 User input Subject")
	public void tcc07_user_input_subject() {
		contactPage.setSubject("test");
		extentTest.log(LogStatus.PASS, "User input Subject");
	}

	@When("tcc07 User input Message")
	public void tcc07_user_input_message() {
		contactPage.setMessage("Test ya kak");
		extentTest.log(LogStatus.PASS, "User input messsage");
	}

	@When("tcc07 User click send")
	public void tcc07_user_click_send() throws InterruptedException {
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("tcc07 Pesan gagal di kirim")
	public void tcc07_pesan_gagal_di_kirim() {
		AssertJUnit.assertEquals(contactPage.gettxteroremail(), "The email field must contain a valid email address.");
		extentTest.log(LogStatus.PASS, "Pesan gagal di kirim");
	}

// test 8

	@When("tcc08 User input nama lengkap")
	public void tcc08_user_input_nama_lengkap() throws InterruptedException {
		contactPage.setBtn_contact();
		contactPage.setnamalengkap("wicaksono");
		extentTest.log(LogStatus.PASS, "User input nama lengkap");
	}

	@When("tcc08 User input email")
	public void tcc08_user_input_email() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		contactPage.setEmail("wicaksono@mail.com");
		extentTest.log(LogStatus.PASS, "User input email valid");
	}

	@When("tcc08 User input mobile phone")
	public void tcc08_user_input_mobile_phone() {
		contactPage.setPhonenumber("katanya kalo huruf ga bisa");
		extentTest.log(LogStatus.PASS, "User input Phone number invalid");
	}

	@When("tcc08 User input Subject")
	public void tcc08_user_input_subject() {
		contactPage.setSubject("test");
		extentTest.log(LogStatus.PASS, "User input Subject");
	}

	@When("tcc08 User input Message")
	public void tcc08_user_input_message() {
		contactPage.setMessage("Test ya kak");
		extentTest.log(LogStatus.PASS, "User input messsage");
	}

	@When("tcc08 User click send")
	public void tcc08_user_click_send() throws InterruptedException {
		contactPage.setBtn_send();
		extentTest.log(LogStatus.PASS, "User click button send");
	}

	@Then("tcc08 Pesan gagal di kirim")
	public void tcc08_pesan_gagal_di_kirim() {
		AssertJUnit.assertEquals(contactPage.gettxtberhasil(), "Thank You for contact us");
		extentTest.log(LogStatus.FAIL, "Pesan gagal di kirim");
	}

}