package page.Actions;

import Utility.BrowserDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import page.objects.HomePage;
import page.objects.LoginPage;


public class LoginActions extends HomePage {
    public LoginActions(BrowserDriver driver){
        super(driver);
    }
    public static void openBrowser(){
        driver.navigate().to("https://anupdamoda.github.io/AceOnlineShoePortal/");
        driver.manage().window().maximize();
    }
    public static void navigateToLoginPage() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(HomePage.btn_Site_hamburgermenu).click();
        Thread.sleep(10000);
        driver.findElement(HomePage.link_Site_hamburgermenu).click();
    }

    public static void loginToShoePortal(String userName, String password ){
        driver.findElement(LoginPage.txt_username).sendKeys(userName);
        driver.findElement(LoginPage.txt_password).sendKeys(password);
        driver.findElement(LoginPage.btn_login).click();
    }
}
