package page.objects;

import org.openqa.selenium.By;

public class LoginPage {
    public static By txt_username = By.xpath("//*[@id=\"usr\"]");
    public static By txt_password = By.xpath("//*[@id=\"pwd\"]");
    public static By btn_login = By.xpath("//*[@id=\"second_form\"]/input");
    public static By btn_newregister = By.xpath("//*[@id=\"NewRegistration\"]");
}
