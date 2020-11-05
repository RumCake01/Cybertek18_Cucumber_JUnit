package com.cybertek.Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_Login_Step_Def {


    @Given("use is on the login page")
    public void use_is_on_the_login_page() {
        System.out.println("--> User is on the login page");
    }

    @When("user logs in as librarian")
    public void user_logs_in_as_librarian() {
        System.out.println("--> User logs in as Librarian");
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("--> User should see dashboard");
    }





}
