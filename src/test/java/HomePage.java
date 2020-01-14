import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage {

    public WebDriver driver;

    @Test
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.domuso.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
