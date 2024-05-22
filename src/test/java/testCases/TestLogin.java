package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.ShippingPage;
import utilities.BrowserSetup;

public class TestLogin extends BrowserSetup {

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
    public void testLoginWithValidCredentials() throws InterruptedException {

        logInPage.addScreenshot("Before add data");
        logInPage.writeElement(logInPage.emailInputBox, logInPage.email);
        logInPage.writeElement(logInPage.passwordInputBox, logInPage.password);
        logInPage.addScreenshot("After add data");
        logInPage.clickOnElement(logInPage.logInButton);
        logInPage.addScreenshot("After login");
        logInPage.clickOnElement(logInPage.writerMenu);
        logInPage.clickOnElement(logInPage.nextPage);
        logInPage.clickOnElement(logInPage.writer);
        logInPage.clickOnElement(logInPage.writersBook);
        logInPage.addScreenshot("Before order");
        logInPage.clickOnElement(logInPage.oderBook);
        Thread.sleep(2000);
        logInPage.clickOnElement(logInPage.checkOutButton);
        logInPage.addScreenshot("After Check out");
    }

    @Test(priority = 1)
    public void testShippingWithValidCredentials() throws InterruptedException {

//        getBrowser().get(shippingPage.shippingUrl);

        shippingPage.writeElement(shippingPage.nameInputBox, shippingPage.name);
        shippingPage.writeElement(shippingPage.phoneNumberInputBox, shippingPage.phoneNumber);
        shippingPage.writeElement(shippingPage.emailInputBox, shippingPage.email);
        Thread.sleep(5000);

        Actions actions = new Actions(getBrowser());
        shippingPage.clickOnElement(shippingPage.selectDistrict);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        shippingPage.clickOnElement(shippingPage.selectDistrict);
        Thread.sleep(5000);

        shippingPage.clickOnElement(shippingPage.selectArea);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        shippingPage.clickOnElement(shippingPage.selectArea);

        Thread.sleep(2000);
        shippingPage.writeElement(shippingPage.addressInputBox, shippingPage.address);
        Thread.sleep(2000);
        shippingPage.clickOnElement(shippingPage.paymentOption);


    }
    @Test(priority = 2)
    public void testLogout() {

        shippingPage.clickOnElement(shippingPage.myAccountButton);
        Assert.assertTrue(homePage.displayStatus(shippingPage.logOutButton));
        shippingPage.clickOnElement(shippingPage.logOutButton);

    }

}