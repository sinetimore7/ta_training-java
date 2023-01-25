package com.epam.training_web_driver.student_Vitali_Semenov.Hurt_Me_Plenty.Test;

import com.epam.training_web_driver.student_Vitali_Semenov.Hurt_Me_Plenty.HomePage.WebDriverCloudGoogleHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverCloudGoogleTest {
    private WebDriver driver;
    String searchTerm = "Google Cloud Platform Pricing Calculator";

    @BeforeClass
    public void browserOpen() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverCloudGoogleHomePage googlePage = new WebDriverCloudGoogleHomePage(driver)
                .openPage()
                .pressButtonSearch()
                .enterSearchTerm(searchTerm)
                .pressButtonEnter()
                .pressLinkToTheSearchTerm();
        driver.switchTo().window(driver.getWindowHandle());
        googlePage.enterNumberOfInstance1("4");
                .pressSelectorSeries()
                .pressSeriesN1()
                .pressSelectorMachineType()
                .pressMachineTypeN1_St8_8_30Gb();
    }

    @Test
    public void check(){

    }



    @AfterClass(alwaysRun = true)
    public void browserQuit(){
        //driver.quit();
        driver = null;
    }
}
