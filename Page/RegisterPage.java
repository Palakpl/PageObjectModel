package com.demo.nopcommerce.Page;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.demo.nopcommerce.Utilities.Utils;


public class RegisterPage {
        WebDriver driver;
        Utils utils;
        By RegisterLink = By.className("ico-register");
        By Gender = By.id("gender-male");
        By FirstName = By.id("FirstName");
        By LastName = By.id("LastName");
        By Emailid = By.id("Email");
        By Password = By.xpath("//*[@id=\"Password\"]");

        By Birthday = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");

        By Birthmonth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");

        By Birthyear  = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");

        By CompanyName = By.xpath("//*[@id=\"Company\"]");
        By ConfirmPassword = By.id("ConfirmPassword");
        By RegisterButton = By.xpath("//*[@id=\"register-button\"]");

        public RegisterPage (WebDriver driver)
        {
            this.driver = driver;
            utils = new Utils(driver);
        }
        public  void clickonRegisterClick()
        {
            utils.doClick(RegisterLink);
        }
        public  void doRegister(String firstname, String lastname, String email, String password, String confirmPassword, String companyname ,String BirthDay,String BirthMonth, String BirthYear) throws InterruptedException {
            utils.doClick(Gender);
            utils.doSendkey(FirstName,firstname);
            Thread.sleep(1000);
            utils.doSendkey(LastName,lastname);
            Thread.sleep(1000);
            utils.doSendkey(Emailid,email);
            utils.doSendkey(Birthday, BirthDay);
            utils.doSendkey(Birthmonth, BirthMonth);
            utils.doSendkey(Birthyear, BirthYear);

            utils.doSendkey(Password,password);
            utils.doSendkey(ConfirmPassword,confirmPassword);
            utils.doSendkey(CompanyName,companyname);
            utils.doClick(RegisterButton);
        }


}
