package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Actions.GenericActions;
import page.Actions.LoginActions;
import page.objects.LoginPage;

import java.util.List;
import java.util.Map;

public class Steps {
//    @Given("the user is on login page")
//    public void the_user_is_on_login_page() {
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
//        ChromeDriver driver=new ChromeDriver();
//        driver.get("http://demo.guru99.com/");
//        System.out.println("The user is on login page");
//    }

    @Given("the user is on home page")
    public void the_user_is_on_home_page() {
        LoginActions.openBrowser();
        System.out.println("The user is on home page");
    }
    @And("user navigates to login page")
    public void user_navigates_to_login_page() throws InterruptedException {
        LoginActions.navigateToLoginPage();
        Thread.sleep(5000);
    }
    @When("the user enters the valid credentials")
    public void the_user_enters_the_valid_credentials(DataTable dataTable) {
        List<Map<String,String>> credentials = dataTable.asMaps(String.class,String.class);
        String username = credentials.get(0).get("Username");
        String password = credentials.get(0).get("Password");
        LoginActions.loginToShoePortal(username, password);
        System.out.println("User entered the username and password");
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("User hits the submit button");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("User is successfully logged in");
    }

}
