package crmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage

{
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    //webelements repository
  //  @FindBy(xpath="//input[@name='username']")
  //  WebElement username;
  //  @FindBy(name="password")
   // WebElement password;
   // @FindBy(xpath = "//input[@type='submit']")
   // WebElement loginbtn;

  //  public void enterUsername()
    {
   //     username.sendKeys("speedway2023");
    }
  //  public void enterPassword()
    {
   //     password.sendKeys("Speedway@2023");

    }
    //public void clickOnLoginBtn()
    {
     //   loginbtn.click();
    }

}
