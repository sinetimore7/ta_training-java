package com.epam.training_web_driver.student_Vitali_Semenov.I_Can_Win.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverPastebinHomePage {
    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    private WebDriver driver;

    @FindBy(xpath = "//button[text()='AGREE']")
    private WebElement buttonAgreePrivacyPolicy;
    @FindBy(xpath = "//textarea[@id='postform-text']")
    private WebElement inputFieldNewPaste;

    @FindBy(xpath = "//div[@class='form-group field-postform-expiration']//span[@role='presentation']")
    private WebElement selectorPasteExpiration;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    private WebElement pasteExpiration10Minutes;

    @FindBy(xpath = "//input[@name='PostForm[name]']")
    private WebElement buttonPasteNameTitle;

    @FindBy(xpath = "//button[text()='Create New Paste']")
    private WebElement buttonCreateNewPaste;

    @FindBy(xpath = "//div[text()='Hello from WebDriver']")
    private WebElement fieldSourceText;

    public WebDriverPastebinHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriverPastebinHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(10));
        return this;
    }

    public WebDriverPastebinHomePage pressButtonAgreePrivacyPolicy(){
        (buttonAgreePrivacyPolicy).click();
        return this;
    }

    public WebDriverPastebinHomePage enterTextInTheInputField(String text){
        (inputFieldNewPaste).sendKeys(text);
        return this;
    }

    public WebDriverPastebinHomePage enterTextInThePasteNameTitle(String text){
        (buttonPasteNameTitle).sendKeys(text);
        return this;
    }

    public WebDriverPastebinHomePage pressPasteExpirationSelector(){
        (selectorPasteExpiration).click();
        return this;
    }

    public WebDriverPastebinHomePage pressPasteExpiration10Minutes(){
        (pasteExpiration10Minutes).click();
        return this;
    }

    public WebDriverPastebinHomePage pressButtonCreateNewPaste(){
        (buttonCreateNewPaste).click();
        return this;
    }

    public String getTextInTheFieldSourceText(){
        return fieldSourceText.getText();
    }



}
