import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

public class LoginTest extends BaseTest {

    @Test
    public void wrongCredentials(){
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();

        WebElement inputLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='username']")));
        inputLogin.sendKeys("Almas777");

        driver.findElement(By.cssSelector("[id='password']")).sendKeys("qwerty123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String actual_error = driver.findElement(By.xpath(".//*[@class='message']")).getText();
        String expected_error = "Sorry, we were not able to find a user with that username and password.";
        Assert.assertEquals(actual_error, expected_error);
    }

    @Test
    public void emptyCredentials(){

    }
}
