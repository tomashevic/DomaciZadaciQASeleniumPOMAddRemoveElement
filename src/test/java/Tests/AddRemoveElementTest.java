package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveElementTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");

    }

    @Test
    public void userCanAddRemoveElement() {
        String homePageUrl = driver.getCurrentUrl();
        homePage.clickOnAddRemoveElementsPageLink();
        Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
        addRemoveElementsPage.clickOnAddElementButton();
        addRemoveElementsPage.clickOnDeleteElementButton();

        boolean isPresent = false;

        try {
            isPresent = driver.findElement(By.className("added-manually")).isDisplayed();
        } catch (Exception e) {

        }

        Assert.assertFalse(isPresent);

    }
}
