package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import util.DataKey;
import util.ScenarioContext;

import static actions.Actions.click;
import static actions.Actions.isDisplayed;
import static actions.Actions.sendKey;
import static org.junit.Assert.assertEquals;
import static util.ScenarioContext.getData;
import static util.ScenarioContext.saveData;
import static util.WaitUntil.waitUntilTime;


public class LoginStepForSingleton extends AbstractStep {

    @Given("User navigate to the website1 homepage")
    public void user_navigate_to_the_website1_homepage() throws InterruptedException {

        click(parabankHomePage.getLoginButton());
        Thread.sleep(1000);
//        click(parabankHomePage.getRegisterButton());
//        Thread.sleep(4000);
    }

    @When("User click to the register button")
    public void user_click_to_the_register_button() throws InterruptedException {
        click(parabankHomePage.getRegisterButton());
        Thread.sleep(1000);
        //isDisplayed(registerHomePage.getFirstName1());
        sendKey(registerHomePage.getFirstNameField(), "Jorikk");
        sendKey(registerHomePage.getLastNameField(),"Vartaanov");
        sendKey(registerHomePage.getAdressField(), "Calea Basarabiei");
        sendKey(registerHomePage.getCityField(), "Hamburg");
        //sendKey(registerHomePage.getStateField(), "Germania");
        //sendKey(registerHomePage.getZipCodeField(), "B5481457418");
       // sendKey(registerHomePage.getPhoneNumberField(), "+373687458210");
        sendKey(registerHomePage.getSsnField(), "85471558944");
        sendKey(registerHomePage.getUserNameField(),"JorikCiumak");
        sendKey(registerHomePage.getPasswordField(),"afganistan1990");
        sendKey(registerHomePage.getConfirmField(),"afganistan1990");
        waitUntilTime(4000);
        click(registerHomePage.getRegisterButton());
        waitUntilTime(4000);


    }

    @When("User click to the logOut button")
    public void user_click_to_the_logOut_button() throws InterruptedException{
        isDisplayed(registerHomePage.getLogOutButton());
        click(registerHomePage.getLogOutButton());
        Thread.sleep(4000);

    }

    @And("User give {}")
    public void user_give_userName(String userName){
             saveData(DataKey.USERNAME,userName);
       // assertEquals(registerHomePage.getSignUpEasy().getText(),"Signing up is easy!");
        sendKey(registerHomePage.getZipCodeField(),getData(DataKey.USERNAME).toString());
        waitUntilTime(4000);


    }


}
