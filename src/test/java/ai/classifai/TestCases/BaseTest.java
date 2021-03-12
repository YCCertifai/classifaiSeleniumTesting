package ai.classifai.TestCases;

import static org.junit.Assert.assertTrue;

import ai.classifai.pages.V1.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Unit test for simple App.
 */
public class BaseTest
{
    private WebDriver driver;
    protected final String URL = "http://localhost:9999/";
    protected MainPage mainPage;

    protected final String projectName = "seleniumTest";

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        mainPage = new MainPage(driver);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
