package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutPage {

    By btn_checkout = By.id("checkout");
    By input_firstName = By.id("first-name");
    By input_lastName = By.id("last-name");
    By input_postalCode = By.id("postal-code");
    By btn_continue = By.id("continue");
    By btn_finish = By.id("finish");
    By thank_you_page = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public void clickBtnCheckout() {
        driver.findElement(btn_checkout).click();
    }

    public void inputFirstName(String firstName) {
        driver.findElement(input_firstName).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        driver.findElement(input_lastName).sendKeys(lastName);
    }

    public void inputPostalCode(String postalCode) {
        driver.findElement(input_postalCode).sendKeys(postalCode);
    }

    public void clickBtnContinue() {
        driver.findElement(btn_continue).click();
    }

    public void verifyBtnFinish() {
        assertThat(driver.findElement(btn_finish).isDisplayed()).isTrue();
    }

    public void clickBtnFinish() {
        driver.findElement(btn_finish).click();
    }

    public void verifyThankYouPage() {
        assertThat(driver.findElement(thank_you_page).isDisplayed()).isTrue();
    }

    public void verifyBtnCheckout() {
        By btn_checkout = By.id("checkout");
        assertThat(driver.findElement(btn_checkout).isDisplayed()).isTrue();
    }
}
