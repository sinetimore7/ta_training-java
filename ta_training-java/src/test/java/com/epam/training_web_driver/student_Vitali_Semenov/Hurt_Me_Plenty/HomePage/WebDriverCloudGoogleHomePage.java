package com.epam.training_web_driver.student_Vitali_Semenov.Hurt_Me_Plenty.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverCloudGoogleHomePage {
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";


    @FindBy(xpath = "//input[@name = 'q']")
    private WebElement buttonSearch;

    @FindBy(xpath = "//div[@class='gs-title']//b[text()='Google Cloud Pricing Calculator']")
    private WebElement linkToTheSearchTerm;

    @FindBy(xpath = "//*[@id='input_90']")
    private WebElement numberOfInstancesField;

    @FindBy(xpath = "//md-select[@placeholder='Series']//span[@class='md-select-icon']")
    private WebElement selectorSeries;

    @FindBy(xpath = "//div[contains(text(), 'N1')]")
    private WebElement seriesN1;

    @FindBy(xpath = "//md-select[@placeholder='Instance type']//span[@class='md-select-icon']")
    private WebElement selectorMachineType;

    @FindBy(xpath = "//div[contains(text(), 'n1-standard-8 (vCPUs: 8, RAM: 30GB)')]")
    private WebElement machineTypeN1_St8_8_30Gb;



    private WebDriver driver;
    public WebDriverCloudGoogleHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriverCloudGoogleHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(10));
        return this;
    }

    public WebDriverCloudGoogleHomePage pressButtonSearch(){
        buttonSearch.click();
        return this;
    }

    public WebDriverCloudGoogleHomePage enterSearchTerm(String text){
        buttonSearch.sendKeys(text);
        return this;
    }

    public WebDriverCloudGoogleHomePage pressButtonEnter(){
        buttonSearch.sendKeys(Keys.ENTER);
        return this;
    }

    public WebDriverCloudGoogleHomePage pressLinkToTheSearchTerm(){
        linkToTheSearchTerm.click();
        return this;
    }

    public WebDriverCloudGoogleHomePage enterNumberOfInstance(String value){
        numberOfInstancesField.sendKeys(value);
        return this;
    }
    public WebDriverCloudGoogleHomePage enterNumberOfInstance1(String value){
        driver.findElement(new By.ByCssSelector("#input_90")).sendKeys(value);
        return this;
    }

    public WebDriverCloudGoogleHomePage pressSelectorSeries(){
        selectorSeries.click();
        return this;
    }

    public WebDriverCloudGoogleHomePage pressSeriesN1(){
        seriesN1.click();
        return this;
    }

    public WebDriverCloudGoogleHomePage pressSelectorMachineType(){
        selectorMachineType.click();
        return this;
    }

    public WebDriverCloudGoogleHomePage pressMachineTypeN1_St8_8_30Gb(){
        machineTypeN1_St8_8_30Gb.click();
        return this;
    }


}
