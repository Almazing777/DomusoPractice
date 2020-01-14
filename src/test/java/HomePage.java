import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseTest{

    @Test
    public void setUp(){
        Webdriver driver = new ChromeDriver();
        driver.get("https://www.domuso.com/");
        driver.manage.timeouts.implicitlywait(5, Seconds)
    }

}
