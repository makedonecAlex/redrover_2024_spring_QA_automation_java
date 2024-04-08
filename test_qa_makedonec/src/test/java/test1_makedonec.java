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
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/");
//
        String title = driver.getTitle();
      Assert.assertEquals("XYZ Bank", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(800));

        WebElement loginButton = driver.findElement(By.xpath
                ("//button[normalize-space()='Customer Login']"));
        loginButton.click();


       WebElement userSelect =  driver.findElement(By.xpath("//select[@id='userSelect']"));
       userSelect.click();

       WebElement userSelectTo =  driver.findElement(By.xpath("//option[@value='5']"));
       userSelectTo.click();

        WebElement nickName = driver.findElement(By.xpath("//button[normalize-space()='Login']") );
        nickName.click();

        WebElement nameUser = driver.findElement(By.xpath("//span[@class='fontBig ng-binding']") );
        String resultNameUser = nameUser.getText();
        Assert.assertEquals(resultNameUser,  "Neville Longbottom" );


        WebElement numberAccount = driver.findElement(By.xpath("//strong[normalize-space()='1013']"));
        String resultNumberAccount = numberAccount.getText();
        Assert.assertEquals(resultNumberAccount,"1013");

        driver.quit();
    }
}
