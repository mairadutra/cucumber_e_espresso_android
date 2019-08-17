package com.example.heitorcolangelo.espressotests.test;

import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;
import com.example.heitorcolangelo.espressotests.R;
import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.TestCase.assertNotNull;

public class LoginActivitySteps {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class);

    private LoginActivity activity;

    @Before("@login-feature")
    public void setUp(){
        mActivityRule.launchActivity(new Intent());
        activity = mActivityRule.getActivity();

    }

    @After("@login-feature")
    public void tearDown(){

        mActivityRule.finishActivity();
    }

    @Given("^I am on login screen$")
    public void I_am_on_login_screen() {
        assertNotNull(activity);
    }

    @When("^I tap login button$")
    public void I_tap_login_button() {
        onView(withId(R.id.login_button)).perform(click());
    }

    @Then("^I should see popup screen$")
    public void I_should_see_popup_screen() {
        onView(withText("Important")).inRoot(isDialog()).check(matches(isDisplayed()));
        onView(withText("Fields cannot be empty")).inRoot(isDialog()).check(matches(isDisplayed()));

    }

}
