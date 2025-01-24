import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {
    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml;jsessionid=node0saz6xnztw96y16yp77scwo1qg8457242.node0");
    }
    @Test
    public void buttonTests(){
        //(01)Click and Confirm title

        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Actual Title same as expected");
        }else {
            System.out.println("Actual Title not same as expected");
        }
        //Assert.assertEquals(actualTitle,expectedTitle,"Title miss matched");

        //(02) Find the

    }




}
