import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestsClass extends WebDriverSettings{

    @Test
    public void verifySearchGoogle(){
        WebElement search  = driver.findElement(By.name("q"));
        search.sendKeys("world");
        search.sendKeys(Keys.ENTER);
    }
}
