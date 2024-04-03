import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class test1_makedonec {
    @Test
    public void testTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://bulavka.by/");
//
//        String title = driver.getTitle();
//      Assert.assertEquals("bulavka", title);
//
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

//        WebElement textBox = driver.findElement(By.className("form-input__input"));
//        textBox.sendKeys("лодка" + Keys.ENTER);

             WebElement login =  driver.findElement(By.xpath("//a[contains(text(),'Вход')]"));
             login.click();

        WebElement nickName = driver.findElement(By.name("login") );
        nickName.sendKeys("+375292135385");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("yZ8x5@RHq9wGkSN");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        WebElement capcha = driver.findElement(By.id("recaptcha-anchor"));
        capcha.click();




//        WebElement message = driver.findElement(By.id("message"));
//        String value = message.getText();
//        Assert.assertEquals("Received!", value);

//        driver.quit();
    }
}
