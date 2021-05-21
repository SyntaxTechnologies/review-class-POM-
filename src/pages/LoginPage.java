package pages;

import TestBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BaseClass {

     public WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
     public WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
     public WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));

}
