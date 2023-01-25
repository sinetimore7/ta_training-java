package com.epam.training_web_driver.student_Vitali_Semenov.Bring_It_On.Test;

import com.epam.training_web_driver.student_Vitali_Semenov.Bring_It_On.HomePage.WebDriverPastebinHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverPastebinTest {
    private WebDriver driver;
    private String textInTheFieldNewPast = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
    private String textInFieldPastNameTitle = "how to gain dominance among developers";

    @BeforeClass(alwaysRun = true)
    public void browserOpen(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new WebDriverPastebinHomePage(driver)
                .openPage()
                .pressButtonAgreePrivacyPolicy()
                .enterTextInTheInputField(textInTheFieldNewPast)
                .pressSelectorSyntaxHighlighting()
                .pressPasteSyntaxHighlightingBash()
                .pressPasteExpirationSelector()
                .pressPasteExpiration10Minutes()
                .enterTextInThePasteNameTitle(textInFieldPastNameTitle)
                .pressButtonCreateNewPaste();
    }

    @Test
    public void checkNameNewPasteTitle(){
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, textInFieldPastNameTitle + " - Pastebin.com");
    }

    @Test
    public void checkCodInTheBashField(){
        String textOnBashField = new WebDriverPastebinHomePage(driver)
                .getTextInTheBashField();

        Assert.assertEquals(textOnBashField, textInTheFieldNewPast);
    }

    @Test
    public void checkTypeOfSyntaxInTheBashField(){
        String syntaxTypeOfTheCodeInTheBashField = new WebDriverPastebinHomePage(driver)
                .getSyntaxTypeOfTheCodInTheBashField();

        Assert.assertEquals(syntaxTypeOfTheCodeInTheBashField, "Bash");
    }

    @AfterClass(alwaysRun = true)
    public void browserQuit(){
        driver.quit();
        driver = null;
    }
}
