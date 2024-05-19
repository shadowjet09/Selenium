package com.example.saucedemotest.stepdefs;

import com.example.saucedemotest.pages.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeSteps {
    private WebDriver driver;
    private HomePage homePage;

    public HomeSteps() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.homePage = new HomePage(driver);
    }

    @Then("I should see the product title on the home page")
    public void i_should_see_the_product_title_on_the_home_page() {
        homePage.validateOnHomePage();
        driver.quit();
    }
}
