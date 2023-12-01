package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    //constractor
    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage login(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    private  void clickLink(String Link){
        driver.findElement(By.linkText(Link)).click();
    }
}
