package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest {

    WebDriver driver;
    WebElement addRemoveElementsPageLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddRemoveElementsPageLink() {
        return driver.findElement(By.linkText("Add/Remove Elements"));
    }

    public void clickOnAddRemoveElementsPageLink() {
        getAddRemoveElementsPageLink().click();

    }
}
