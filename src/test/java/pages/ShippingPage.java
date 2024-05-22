package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage{


    public String shippingUrl = "https://www.wafilife.com/checkout";

    public String name = "Automated User";
    public String phoneNumber = "+12182741899";
    public String email = "mobahis711@mcatag.com";
    public String address = "129,Majortila,Islampur";
    public By nameInputBox = By.xpath("//input[@id='billing_first_name']");
    public By phoneNumberInputBox = By.xpath("//input[@id='billing_phone']");
    public By emailInputBox = By.xpath("//input[@id='billing_email']");
    public By selectDistrict = By.xpath("//span[@id='select2-billing_state-container']");
    public By selectArea = By.xpath("//select[@id='billing_area']");
    public By addressInputBox= By.xpath("//textarea[@id='billing_address_1']");
    public By paymentOption = By.xpath("//input[@id='payment_method_bkash']");
    public By myAccountButton = By.xpath("//div[@class='login-links']//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'আমার অ্যাকাউন্ট')]");
    public By logOutButton = By.xpath("//a[contains(text(),'লগআউট')]");
}
