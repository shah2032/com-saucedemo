package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if( browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")){
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new ChromeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());

        //Find the Username Field Element
        WebElement userName = driver.findElement(By.id("user-name"));
        //Type the username to username  field element
        userName.sendKeys("prime123");

        driver.findElement(By.name("password")).sendKeys("Prime123");
        //Close the Browser
        driver.close();
        driver.quit();
    }
}


