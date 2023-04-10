package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl =  "https://www.saucedemo.com/";
                //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);
        //Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());
        //Get Page Source
        System.out.println("Page source :" + driver.getPageSource());
        //Find the Email Field Element
        WebElement userName = driver.findElement(By.id("user-name"));
        //Type the username to username  field element
       userName.sendKeys("prime123");

        driver.findElement(By.name("password")).sendKeys("Prime123");
        //Close the Browser
        driver.close();
        driver.quit();

    }

}


