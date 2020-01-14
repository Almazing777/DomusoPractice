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

        String actualError = driver.findElement(By.xpath(".//*[@class='message']")).getText();
        String expectedError = "Sorry, we were not able to find a user with that username and password.";
        Assert.assertEquals(actualError, expectedError);
    }

    @Test
    public void emptyCredentials(){
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();

        WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
        submitButton.click();
        String loginError = driver.findElement(By.cssSelector("[id='username-error']")).getText();
        String loginExpectedError = "Login required";
        Assert.assertEquals(loginError, loginExpectedError);

        String passwordError = driver.findElement(By.cssSelector("[id='password-error']")).getText();
        String pwExpectedError = "Password required";
        Assert.assertEquals(passwordError, pwExpectedError);

    }
}
