import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTests extends BaseTest{


    @Test
    public void navBarTest(){
        driver.findElement(By.xpath("//a[@class='Header-nav-folder-title'][contains(text(),'Property Managers')]")).click();
        WebElement title = driver.findElement(By.xpath("//h1[contains(text(),'Explore the Domuso Difference')]"));
        Assert.assertTrue(title.isDisplayed());

        driver.findElement(By.xpath("//a[@class='Header-nav-folder-title'][contains(text(),'Residents')]")).click();
        WebElement title2 = driver.findElement(By.xpath("//h1[contains(text(), 'Resident Hub')]"));
        Assert.assertTrue(title2.isDisplayed());

        driver.findElement(By.xpath("//a[@class='Header-nav-folder-title'][contains(text(),'About')]")).click();
        WebElement title3 = driver.findElement(By.xpath("//p[contains(text(),'Get to know us.')]"));
        Assert.assertTrue(title3.isDisplayed());

    }

    @Test
    public void UITest(){
        WebElement logo = driver.findElement(By.cssSelector("[class='Header-branding']"));
        Assert.assertTrue(logo.isDisplayed());

        WebElement wallPaper = driver.findElement(By.cssSelector("[id='block-yui_3_17_2_1_1559595529751_6808']"));
        Assert.assertTrue(wallPaper.isDisplayed());

        WebElement header = driver.findElement(By.cssSelector("[id='block-yui_3_17_2_1_1559598408625_34374']"));
        Assert.assertTrue(header.isDisplayed());
    }



}
