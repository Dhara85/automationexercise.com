package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ExtraSteps {
    @Then("I should see welcome text on contact us page {string}")
    public void iShouldSeeWelcomeTextOnContactUsPage(String expectedText) {
        Assert.assertEquals(new ContactUsPage().verifyGetInTouchText(), expectedText);
    }

    @And("I enter {string} name to name field")
    public void iEnterNameToNameField(String name) {
        new ContactUsPage().sendDataToNameField(name);
    }

    @And("I enter {string} email to email field")
    public void iEnterEmailToEmailField(String email) {
        new ContactUsPage().sendDataToEmailField(email);
    }

    @And("I enter {string} subject to subject field")
    public void iEnterSubjectToSubjectField(String subject) {
        new ContactUsPage().sendDataToSubjectField(subject);
    }

    @And("I enter {string} message to message field")
    public void iEnterMessageToMessageField(String message) {
        new ContactUsPage().sendDataToMessageField(message);
    }

    @And("I upload file")
    public void iUploadFile() {
        new ContactUsPage().uploadFile();
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I click on ok button popup")
    public void iClickOnOkButtonPopup() {
        new ContactUsPage().acceptPopupMessage();
    }

    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String expectedText) {
        Assert.assertEquals(new ContactUsPage().getDetailsSubmittedMessage(),expectedText);
    }

    @And("I click on home button")
    public void iClickOnHomeButton() {
        new ContactUsPage().clickOnHomeButton();
    }

    @Then("I am on text cases page and verify the test-cases URL {string}")
    public void iAmOnTextCasesPageAndVerifyTheTestCasesURL(String expectedURL) {
        Assert.assertEquals(new TestCasesPage().getCurrentURL(), expectedURL);
    }

    @When("I scroll down up to subscription link")
    public void iScrollDownUpToSubscriptionLink() {
        new HomePage().scrollDownToSubscriptionLink();
    }

    @Then("I enter email {string}")
    public void iEnterEmail(String email) {
        new HomePage().sendDataToSubscriptionEmail(email);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @And("I should see the success subscription message {string}")
    public void iShouldSeeTheSuccessSubscriptionMessage(String expectedMessage) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);
    }

    @When("I add product {string} to the cart")
    public void iAddProductToTheCart(String product) {
        new HomePage().mouseHoverAndClickAddToCartOnProduct(product);
    }

    @And("I click on view cart in popup")
    public void iClickOnViewCartInPopup() {
        new HomePage().clickOnViewCartLink();
    }

    @And("I should see the welcome text on shopping cart page {string}")
    public void iShouldSeeTheWelcomeTextOnShoppingCartPage(String expectedText) {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartWelcomeText(), expectedText);
    }

    @Then("I click on cross button to remove the product from the cart")
    public void iClickOnCrossButtonToRemoveTheProductFromTheCart() {
        new ShoppingCartPage().clickOnCrossButtonAcrossProductToRemove();
    }

    @And("I click on Proceed to Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutButton();
    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
        new ShoppingCartPage().clickOnRegisterLoginLinkOnCheckoutPopup();
    }

    @And("I send name {string} and email {string} to signup")
    public void iSendNameAndEmailToSignup(String name, String eMail) {
        new LoginPage().sendDataToSignupFields(name, eMail);
    }

    @And("I fill all details in signup page {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iFillAllDetailsInSignupPage(String title, String pass, String day, String month, String year, String fName, String lName, String add1, String add2, String country, String state, String city, String zipcode, String pNumber) {
        new SignupPage().sendDataToSignupForm(title, pass, day, month, year,fName, lName, add1, add2, country, state, city, zipcode, pNumber);
    }

    @And("I click on Create Account button")
    public void iClickOnCreateAccountButton() {
        new SignupPage().clickOnCreateAccountButton();
    }

    @Then("I see account created message {string}")
    public void iSeeAccountCreatedMessage(String expectedText) {
        Assert.assertEquals(new SignupPage().getAccountCreatedMessage(), expectedText);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SignupPage().clickOnContinueButtonAfterAccountCreated();
    }

    @Then("I should see the text {string} {string}")
    public void iShouldSeeTheText(String text, String name) {
        Assert.assertEquals(new HomePage().getLoggedInAsUserNameText(), text + name);
    }

    @And("I should see the text on checkout page {string}")
    public void iShouldSeeTheTextOnCheckoutPage(String expectedText) {
        Assert.assertEquals(new CheckoutPage().verifyTextOnCheckoutPage(expectedText), expectedText);
    }

    @And("I enter details into comment area {string}")
    public void iEnterDetailsIntoCommentArea(String comment) {
        new CheckoutPage().sendTextToCommentArea(comment);
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        new CheckoutPage().clickOnPlaceOrderButton();
    }

    @And("I enter payment details {string} {string} {string} {string} and {string}")
    public void iEnterPaymentDetailsAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }

    @And("I click on Pay and Confirm Order button")
    public void iClickOnPayAndConfirmOrderButton() {
        new PaymentPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("I should see the order confirmation message {string}")
    public void iShouldSeeTheOrderConfirmationMessage(String expectedMessage) {
        Assert.assertEquals(new PaymentPage().getOrderConfirmationMessage(), expectedMessage);
    }

    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new PaymentPage().clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I click on continue button after order success")
    public void iClickOnContinueButtonAfterOrderSuccess() {
        new PaymentPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }

    @Then("I should see the account deleted message {string}")
    public void iShouldSeeTheAccountDeletedMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getAccountDeletedMessage(), expectedText);
    }

    @Then("I click on continue button after deleting account")
    public void iClickOnContinueButtonAfterDeletingAccount() {
        new PaymentPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }

    @Then("I should see the subscription {string} text")
    public void iShouldSeeTheSubscriptionText(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }

    @And("I click on arrow up button at bottom right corner")
    public void iClickOnArrowUpButtonAtBottomRightCorner() {
        new HomePage().clickOnBottomRightArrowButton();
    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }

    @And("I scroll up")
    public void iScrollUp() {
        new HomePage().scrollUp();
    }
}
