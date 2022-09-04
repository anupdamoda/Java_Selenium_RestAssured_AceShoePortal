package page.objects;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

public class HomePage extends BrowserDriver {
    public HomePage(BrowserDriver driver){
        super(driver);
    }
    public static By txt_Site_Title = By.xpath("//*[@id=\"ShoePortalTitle\"]");
    public static By btn_Site_hamburgermenu = By.xpath("//*[@id=\"menuToggle\"]/input");
    public static By txt_Site_FrontMessage = By.xpath("//*[@id=\"MainPageText\"]");
    public static By link_Site_hamburgermenu = By.xpath("//*[@id=\"menu\"]/a[2]/li");
}
