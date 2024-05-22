package pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage{


        public String email = "mobahis711@mcatag.com";
        public String password = "#5w6ZKATk6hnDYY";

        public By emailInputBox = By.xpath("//input[@id='username']");
        public By passwordInputBox = By.xpath("//input[@id='password']");
        public By logInButton = By.xpath("//input[@name='login']");
        public By writerMenu = By.xpath("//span[contains(text(),'লেখক')]");
        public By nextPage = By.xpath("//a[contains(text(),'→')]");
        public By writer = By.xpath("//h3[normalize-space()='Md. Asaduzzaman']");
        public By writersBook = By.xpath("//div[@class='product_thumbnail_wrapper']//a");
        public By oderBook = By.xpath("//div[@class='body-wrapper']//button[2]");
        public By checkOutButton = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");


        public String wrongEmail = "jiwom54235@re.com";
        public String invalidEmail = "invalid_email";
        public String wrongPassword = "112233445566778899";
        public By errorMessage = By.xpath("//ul[@class='woocommerce-error']");



}
