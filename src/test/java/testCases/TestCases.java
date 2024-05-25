package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.ShippingPage;
import utilities.BrowserSetup;

public class TestCases extends BrowserSetup {

    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    ShippingPage shippingPage = new ShippingPage();


    @BeforeTest
    public void loadLogInPage() {

        getBrowser().get(homePage.url);
        homePage.clickOnElement(homePage.logInButton);


    }

    @Test(priority = 0,description = "User Login with Valid Credentials")
    @Description("Test Add using Allure :User Login with Valid Credentials")
    @Epic("Web Interface")
    @Feature("Essential Features")
    @Story("Authentication")
    public void testLoginWithValidCredentials() {

        logInPage.addScreenshot("Before add data");
        logInPage.writeElement(logInPage.emailInputBox, logInPage.email);
        logInPage.writeElement(logInPage.passwordInputBox, logInPage.password);
        logInPage.addScreenshot("After add data");
        logInPage.clickOnElement(logInPage.logInButton);
        Assert.assertTrue(homePage.displayStatus(homePage.logOutButton));
        logInPage.clickOnElement(shippingPage.logOutButton);

    }
    @Test(priority = 1,description = "User Login with InValid Credentials")
    @Description("Test Add using Allure :User Login with InValid Credentials")
    @Epic("Web Interface")
    @Feature("Essential Features")
    @Story("Authentication")
    public void testLoginWithInValidCredentials() {

        logInPage.addScreenshot("Before add data");
        logInPage.writeElement(logInPage.emailInputBox, logInPage.wrongEmail);
        logInPage.writeElement(logInPage.passwordInputBox, logInPage.wrongPassword);
        logInPage.addScreenshot("After add data");
        logInPage.clickOnElement(logInPage.logInButton);
        Assert.assertTrue(logInPage.displayStatus(logInPage.errorMessage));
        Assert.assertFalse(homePage.displayStatus(homePage.logOutButton));
    }

    @Test(priority = 2)
    public void testLoginWithValidEmailButWrongPassword() {

        logInPage.writeElement(logInPage.emailInputBox, logInPage.email);
        logInPage.writeElement(logInPage.passwordInputBox, logInPage.wrongPassword);
        logInPage.clickOnElement(logInPage.logInButton);
        Assert.assertTrue(logInPage.displayStatus(logInPage.errorMessage));
        Assert.assertFalse(homePage.displayStatus(homePage.logOutButton));

    }

    @Test(priority = 3)
    public void testLoginWithValidPasswordButWrongEmail() {

        logInPage.writeElement(logInPage.emailInputBox, logInPage.wrongEmail);
        logInPage.writeElement(logInPage.passwordInputBox, logInPage.password);
        logInPage.clickOnElement(logInPage.logInButton);
        Assert.assertTrue(logInPage.displayStatus(logInPage.errorMessage));
        Assert.assertFalse(homePage.displayStatus(homePage.logOutButton));

    }

    @Test(priority = 4)
    public void testLoginWithValidPasswordButInvalidEmail() {

        logInPage.writeElement(logInPage.emailInputBox, logInPage.invalidEmail);
        logInPage.writeElement(logInPage.passwordInputBox, logInPage.password);
        logInPage.clickOnElement(logInPage.logInButton);
        Assert.assertTrue(logInPage.displayStatus(logInPage.errorMessage));
        Assert.assertFalse(homePage.displayStatus(homePage.logOutButton));

    }
    @Test(priority = 5)
    public void testLoginWithOutEmailAndPassword() {

        logInPage.clickOnElement(logInPage.logInButton);
        Assert.assertTrue(logInPage.displayStatus(logInPage.errorMessage));
        Assert.assertFalse(homePage.displayStatus(homePage.logOutButton));

    }
}
