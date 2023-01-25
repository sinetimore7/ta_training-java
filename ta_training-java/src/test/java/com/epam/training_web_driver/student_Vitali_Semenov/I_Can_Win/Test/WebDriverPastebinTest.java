package com.epam.training_web_driver.student_Vitali_Semenov.I_Can_Win.Test;

import com.epam.training_web_driver.student_Vitali_Semenov.I_Can_Win.HomePage.WebDriverPastebinHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverPastebinTest {
    private WebDriver driver;
    private String textInTheFieldNewPast = "Hello from WebDriver";
    private String textInFieldPastNameTitle = "helloweb";

    @BeforeClass(alwaysRun = true)
    public void browserOpen(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new WebDriverPastebinHomePage(driver)
                .openPage()
                .pressButtonAgreePrivacyPolicy();
    }

    @Test
    public void createNewPast(){
        String valueOnFieldSourceText = new WebDriverPastebinHomePage(driver)
                .enterTextInTheInputField(textInTheFieldNewPast)
                .pressPasteExpirationSelector()
                .pressPasteExpiration10Minutes()
                .enterTextInThePasteNameTitle(textInFieldPastNameTitle)
                .pressButtonCreateNewPaste()
                .getTextInTheFieldSourceText();

        Assert.assertEquals(valueOnFieldSourceText, textInTheFieldNewPast);
    }

    @AfterClass(alwaysRun = true)
    public void browserQuit(){
        driver.quit();
        driver = null;
    }
}
