package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;
import pages.WebPage;

public class CheckoutStep {
    WebPage webPage;
    CheckoutPage checkoutPage;

    public CheckoutStep() {
        this.webPage = new WebPage();
        this.checkoutPage = new CheckoutPage();
    }

    @Given("user go to login page")
    public void userGoToLoginPage() {
        webPage.goToLoginPage();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPwd(String pwd) {
        webPage.inputPassword(pwd);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.clickBtnLogin();
    }

    @Then("user verify see cart icon")
    public void userVerifySeeCartIcon() {
        webPage.verifyIconCart();
    }

    @And("user click add to cart")
    public void userClickAddToCart() {
        webPage.itemAddToCart();
    }

    @And("user click cart icon")
    public void userClickCartIcon() {
        webPage.verifyIconCart();
    }

    @Then("user verify see checkout button")
    public void userVerifySeeCheckoutButton() {
        checkoutPage.verifyBtnCheckout();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        checkoutPage.clickBtnCheckout();
    }

    @And("user input first name {string}")
    public void userInputFirstName(String firstName) {
        checkoutPage.inputFirstName(firstName);
    }

    @And("user input last name {string}")
    public void userInputLastName(String lastName) {
        checkoutPage.inputLastName(lastName);
    }

    @And("user input postal code {string}")
    public void userInputPostalCode(String postalCode) {
        checkoutPage.inputPostalCode(postalCode);
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        checkoutPage.clickBtnContinue();
    }

    @Then("user verify see finish button")
    public void userVerifySeeFinishButton() {
        checkoutPage.verifyBtnFinish();
    }

    @And("user click finish button")
    public void userClickFinishButton() {
        checkoutPage.clickBtnFinish();
    }

    @Then("user verify see thank you page")
    public void userVerifySeeThankYouPage() {
        checkoutPage.verifyThankYouPage();
    }
}
