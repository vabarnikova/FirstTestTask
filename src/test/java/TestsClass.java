import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsClass extends WebDriverSettings{
    private String searchInput = "world";
    @Test
    public void verifySearchGoogle(){
        WebElement search  = driver.findElement(By.name("q"));
        search.sendKeys(searchInput);
        search.sendKeys(Keys.ENTER);
        boolean containsUrl = driver.getCurrentUrl().contains(searchInput);
        Assert.assertTrue(containsUrl);
    }
}
