import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
}
