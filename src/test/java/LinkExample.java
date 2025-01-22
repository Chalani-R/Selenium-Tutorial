import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LinkExample {

    @BeforeMethod
    public void openLinkTestPage(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01ayavh0kwl4ol1lp3u2j7wn1mp8451092.node0https://www.google.com/");

    }

    @Test
    public void LinkTests(){

    }
    //(01)Take me to dashboard






    //(02)Find my destination
    //(03)Dublicate Link
    //(04)Count page Link
    //(06)Count layout Links

}
