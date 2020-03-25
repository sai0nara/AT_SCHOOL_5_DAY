package ru.lanit.framework.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ru.lanit.framework.webdriver.WebDriverManager;

public class TestGmail extends BasePageSteps {

    @Test
    public void testGmail() throws InterruptedException {
        WebDriver webDriver = WebDriverManager.getDriver();
        webDriver.get("http://google.com");
        webDriver.findElement(By.name("q")).click();
        webDriver.findElement(By.name("q")).sendKeys("Hello World!");
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        Thread.sleep(10000);
        System.out.println("Открыт браузер " + ((ChromeDriver) webDriver).getSessionId());
        webDriver.quit();

    }
}
