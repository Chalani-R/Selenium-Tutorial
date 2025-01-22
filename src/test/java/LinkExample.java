import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkExample {

    @Test
    public void LinkTests(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    //(01)Take me to dashboard






    //(02)Find my destination
    //(03)Dublicate Link
    //(04)Count page Link
    //(06)Count layout Links

}
