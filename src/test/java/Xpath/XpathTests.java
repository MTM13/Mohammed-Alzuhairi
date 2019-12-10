package Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathTests {
    @Test
    public void relativeXpathUsingParentChild(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String ExpectedUrl = "http://practice.cybertekschool.com/signup_confirmation";
        driver.get(ExpectedUrl);
        System.out.println("Printing the first link");
        System.out.println(driver.findElement(By.xpath("(html/body//div//div/a)[2]")).getText());
    }

    @Test
    public void relativeXpathUsingIndex() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String ExpectedUrl = "http://practice.cybertekschool.com/multiple_buttons";
        driver.get(ExpectedUrl);

        System.out.println(driver.findElement(By.xpath("//button[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//button[6]")).getText());


    }

    }
