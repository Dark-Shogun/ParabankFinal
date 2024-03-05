package stepDefinition;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ScenarioContext;
import util.DataKey;
import static actions.Actions.isDisplayed;
import static org.hamcrest.core.Is.is;
import static util.WaitUtils.waitUnitCondition;


public class LoginSteps extends AbstractStep {
    private ChromeDriver driver;

    @When("User navigate to the website homepage")
    public void user_navigate_to_the_website_homepage() {
        System.setProperty("webdriver.chrome.driver", "src\\webDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
        if (driver.findElement(By.xpath("//img[@title='ParaBank']")).isDisplayed())
            log.info("parabank logo este");

        if (driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed())
            log.info("customer login este");
    }

    @When("User clicks on 'Login' button")
    public void user_clicks_on_Login_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//h1[normalize-space()='Error!']")).isDisplayed())
            log.info("Please enter a username and password");
        Thread.sleep(1000);

    }

    @When("User clicks on 'Register' button")
    public void user_clicks_on_Register_button() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//h1[normalize-space()='Signing up is easy!']")).isDisplayed())
            log.info("Signing up is easy!");
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//b[normalize-space()='Username:']")).isDisplayed())
            log.info("Username este");

        if (driver.findElement(By.xpath("//b[normalize-space()='Password:']")).isDisplayed())
            log.info("Password este");

//        if (driver.findElement(By.xpath("//b[normalize-space()='Confirm:']")).isDisplayed())
//            log.info("Confirm este");
        Assert.assertEquals("Confirm:", driver.findElement(By.xpath("//b[normalize-space()='Confirm:']")).getText());

//        driver.close();

       // driver.quit();
    }

    @When("User insert some of the mandatory fields")
            public void user_insert_some_of_the_mandatory_fields() throws InterruptedException {
        String firstName="Julieta";
        String password="1185";


        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstName);
        ScenarioContext.saveData(DataKey.USERNAME,firstName);
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("Julia1578");
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
        ScenarioContext.saveData(DataKey.PASSWORD,password);
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(password );
        driver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(4000);

        driver.quit();
            }


}
