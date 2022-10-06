package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Page.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTest {
    WebDriver driver;
    BasePage basePage;
    RegisterPage registerPage;
    Properties properties;
@BeforeMethod
    public void openBrowser()
    {
        basePage = new BasePage();
        properties = basePage.initialiseProperties();
        String webEngine = properties.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(properties.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }
    @Test(priority = 2)
    public  void registerTest() throws InterruptedException {
        registerPage.clickonRegisterClick();
        Thread.sleep(2000);
        registerPage.doRegister(properties.getProperty("firstname"),properties.getProperty("lastname"),properties.getProperty("email"), properties.getProperty("password"),properties.getProperty("confirmpassword"), properties.getProperty("companyname"), properties.getProperty("BirthDay"), properties.getProperty("BirthMonth"), properties.getProperty("BirthYear"));
    }
//    @AfterMethod
//    public void tearDown()
//    {
//        driver.quit();
//    }

}
