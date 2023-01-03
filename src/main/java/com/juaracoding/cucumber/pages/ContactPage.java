package com.juaracoding.cucumber.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class ContactPage {
    private WebDriver driver;

    public ContactPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Contact']")
    WebElement btn_contact;

    @FindBy(xpath = "//input[@placeholder='Your Full Name']")
    WebElement namalengkap;

    @FindBy(xpath = "//input[@placeholder='Enter email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Your Mobile Phone Number']")
    WebElement phonenumber;

    @FindBy(xpath = "//input[@placeholder='Your Subject']")
    WebElement subject;

    @FindBy(xpath = "//textarea[@placeholder='Your Message']")
    WebElement message;

    @FindBy(xpath = "//button[normalize-space()='Send Message']")
    WebElement btn_send;

    @FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='The name field is required.']")
    WebElement txtnullname;

    @FindBy(xpath = "//div[contains(@class,'invalid-feedback')][normalize-space()='The email field is required.']")
    WebElement txtnullemail;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    WebElement txteroremail;

    @FindBy(xpath = "//div[contains(@class,'invalid-feedback')][normalize-space()='The phone field is required.']")
    WebElement txtnullnumber;

    @FindBy(xpath = "//div[contains(@class,'invalid-feedback')][normalize-space()='The subject field is required.']")
    WebElement txtnullsubject;

    @FindBy(xpath = "//alert[@class='alert-success']")
    WebElement txtberhasil;

    public void setBtn_contact() throws InterruptedException {
        Thread.sleep(2000);
        btn_contact.click();
    }

    public void setnamalengkap(String namalengkap) {
        this.namalengkap.sendKeys(namalengkap);
    }

    public void clearnamalengkap() {
        namalengkap.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);;
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void clearEmail() {
        email.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);

    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber.sendKeys(phonenumber);
    }

    public void clearPhonenumber() {
        phonenumber.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);;
    }

    public void setSubject(String subject) {
        this.subject.sendKeys(subject);
    }

    public void clearSubject() {
        subject.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);;
    }

    public void setMessage(String message) {
        this.message.sendKeys(message);
    }

    public void clearMessage() {
        message.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);;
    }

    public void setBtn_send() throws InterruptedException {
        Thread.sleep(2000);
        btn_send.click();
    }

    public String gettxtberhasil() {
        return txtberhasil.getText();
    }

    public String gettxtnullname() {
        return txtnullname.getText();
    }

    public String gettxtnullemail() {
        return txtnullemail.getText();
    }

    public String gettxteroremail() {
        return txteroremail.getText();
    }

    public String gettxtnullnumber() {
        return txtnullnumber.getText();
    }

    public String gettxtnullsubject() {
        return txtnullsubject.getText();
    }

//    public String gettxtnullmessage() {
//        return txtnullmessage.getText();
//    }

}


