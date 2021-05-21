package Test;

import TestBase.BaseClass;
import pages.loginPageWithPageFactory;
import pages.menuWithPageFactory;

public class logInWithPageFactory {


    public static void main(String[] args) {

        BaseClass.setupWithSpecificUrl("https://www.saucedemo.com/");
        loginPageWithPageFactory login= new loginPageWithPageFactory();
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginBtn.click();

        menuWithPageFactory menu=new menuWithPageFactory();
        menu.menubtn.click();

        menu.logout.click();

    }


}
