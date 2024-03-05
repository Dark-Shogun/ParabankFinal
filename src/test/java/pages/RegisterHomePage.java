package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class RegisterHomePage extends PageObjects {

    @FindBy(xpath= "//*[@id=\"customerForm\"]/table/tbody/tr[1]/td[1]/b")
    WebElement firstName1;

    @FindBy(xpath= "//*[@id=\"customer.firstName\"]")
    WebElement firstNameField;

    @FindBy(xpath= "//*[@id=\"customer.lastName\"]")
    WebElement lastNameField;

    @FindBy(xpath= "//*[@id=\"customer.address.street\"]")
    WebElement adressField;

    @FindBy(xpath= "//*[@id=\"customer.address.city\"]")
    WebElement cityField;

    @FindBy(xpath= "//*[@id=\"customer.address.state\"]")
    WebElement stateField;

    @FindBy(xpath= "//*[@id=\"customer.address.zipCode\"]")
    WebElement zipCodeField;

    @FindBy(xpath= "//*[@id=\"customer.phoneNumber\"]")
    WebElement phoneNumberField;

    @FindBy(xpath= "//*[@id=\"customer.ssn\"]")
    WebElement ssnField;

    @FindBy(xpath= "//*[@id=\"customer.username\"]")
    WebElement userNameField;

    @FindBy(xpath= "//*[@id=\"customer.password\"]")
    WebElement passwordField;

    @FindBy(xpath= "//*[@id=\"repeatedPassword\"]")
    WebElement confirmField;

    @FindBy(xpath= "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    WebElement registerButton;

    @FindBy(xpath= "//*[@id=\"leftPanel\"]/ul/li[8]/a")
    WebElement logOutButton;

    @FindBy(xpath= "//*[@id=\"rightPanel\"]/h1")
    WebElement signUpEasy;




    public RegisterHomePage(WebDriver driver){
        super(driver);
    }
}
