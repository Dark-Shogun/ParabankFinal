package pages;


import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;

@Getter
public class ParabankHomePage extends PageObjects {

    @FindBy(xpath= "//*[@id=\"topPanel\"]/a[2]/img")
    WebElement HomePageLogoText;

    @FindBy(xpath = "//input[@value = 'Log In']")
    WebElement LoginButton;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    WebElement RegisterButton;

    public ParabankHomePage(WebDriver driver) {
        super(driver);
    }


}
