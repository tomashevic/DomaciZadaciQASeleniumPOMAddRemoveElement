package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElementsPage extends BaseTest {

    WebDriver driver;

    WebElement addElementButton;

    WebElement deleteElementButton;

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddElementButton() {
        return driver.findElement(By.cssSelector("button[onclick='addElement()']"));
    }

    public WebElement getDeleteElementButtoneElementButton() {
        return driver.findElement(By.className("added-manually"));
    }

    public void clickOnAddElementButton() {
        getAddElementButton().click();
    }

    public void clickOnDeleteElementButton() {
        getDeleteElementButtoneElementButton().click();

    }
}
