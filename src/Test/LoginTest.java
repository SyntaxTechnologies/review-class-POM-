package Test;

import TestBase.BaseClass;
import pages.LoginPage;
import pages.menuPage;

public class LoginTest {

    public static void main(String[] args){

        BaseClass.setupWithSpecificUrl("https://www.saucedemo.com/");
        LoginPage login=new LoginPage();
        login.userName.sendKeys("standard_user");
        login.Password.sendKeys("secret_sauce");
        login.loginBtn.click();
        menuPage menu=new menuPage();
        menu.addbag.click();


    }
}
