package pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class menuWithPageFactory extends BaseClass {


    @FindBy(id = "react-burger-menu-btn")
    public WebElement menubtn;

    @FindBy(id="logout_sidebar_link")
    public WebElement logout;


    public menuWithPageFactory(){

        PageFactory.initElements(driver,this);

    }


}



