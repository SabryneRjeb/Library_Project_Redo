package com.library.steps_definitions;

import com.library.pages.HomePage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_Function {
       HomePage logIn = new HomePage();
    @Given("user login as student with {string} and {string}")
    public void user_login_as_student_with_and(String userName, String password) {
        logIn.getUrl();
        logIn.emailAddressInputBox.sendKeys(ConfigurationReader.getProperty(userName));
        logIn.passwordInputBox.sendKeys(ConfigurationReader.getProperty(password));
        logIn.signInButton.click();
    }


    @Then("the student on Homepage")
    public void the_student_on_homepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("books"));
    }


    @Given("user login as librarian with {string} and {string}")
    public void user_login_as_librarian_with_and(String userName, String password) {
        logIn.emailAddressInputBox.sendKeys(ConfigurationReader.getProperty(userName));
        logIn.passwordInputBox.sendKeys(ConfigurationReader.getProperty(password));
        logIn.signInButton.click();

    }


    @Then("the librarian on Homepage")
    public void the_librarian_on_homepage() {
      Assert.assertTrue(Driver.getDriver().getTitle().contains("dashboard"));
    }


}
