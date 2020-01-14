import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedTests extends BaseTest{

    @Test
    public void mouseHover(){
        Actions builder = new Actions(driver);

        WebElement pmTab = driver.findElement(By.xpath("//a[@class='Header-nav-folder-title'][contains(text(),'Property Managers')]"));
        builder
                .moveToElement(pmTab)
                .build()
                .perform();

        WebElement residentsTab = driver.findElement(By.xpath("//a[@class='Header-nav-folder-title'][contains(text(),'Residents')]"));
        builder
                .moveToElement(residentsTab)
                .build()
                .perform();

        WebElement aboutTab = driver.findElement(By.xpath("//a[@class='Header-nav-folder-title'][contains(text(),'About')]"));
        builder
                .moveToElement(aboutTab)
                .build()
                .perform();
    }


    @Test
    public void scrollDownAndType(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Almas");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Mendy");

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        emailField.sendKeys("mendy@yahoo.com");

        WebElement signUpButton = driver.findElement(By.xpath("//span[@class='newsletter-form-button-label']"));
        signUpButton.click();

        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='yui_3_17_2_1_1579025461944_6473']")));
        Assert.assertTrue(confirmationMessage.isDisplayed());

    }

}
