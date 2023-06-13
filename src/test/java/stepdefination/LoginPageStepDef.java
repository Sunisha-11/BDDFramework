package stepdefination;

import crmpages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepDef {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void init()
    {

        loginPage = new LoginPage(driver);

    }

    @Given("user is on free crm login page")
    public void user_is_on_free_crm_login_page() {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/index.html");
    }


    @And("user enter username in username textbox")
    public void user_enter_username_in_username_textbox() {
        driver.findElement(By.name("username")).sendKeys("Speedwaytech2023");

    }
    @And("user enter password in password textbox")
    public void user_enter_password_in_password_textbox() {
        driver.findElement(By.name("password")).sendKeys("Speedwaytech@2023");;
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();;
    }
    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
System.out.println("user is on homePage");

    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
}
