package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{


    public String url = "https://www.wafilife.com/";

    public By logInButton = By.xpath("//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'লগইন / রেজিস্টার')]");



}
