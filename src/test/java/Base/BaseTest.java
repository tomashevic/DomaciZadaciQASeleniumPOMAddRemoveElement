package Base;

import Pages.AddRemoveElementsPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public HomePage homePage;

    public AddRemoveElementsPage addRemoveElementsPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
