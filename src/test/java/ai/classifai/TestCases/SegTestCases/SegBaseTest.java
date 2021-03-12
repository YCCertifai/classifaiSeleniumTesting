package ai.classifai.TestCases.SegTestCases;

import ai.classifai.TestCases.BaseTest;
import ai.classifai.pages.V1.SegmentationPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SegBaseTest extends BaseTest {
    protected SegmentationPage segPage;

    @BeforeMethod
    public void toBBoxPage()
    {
        segPage = mainPage.toSegmentationPage();
    }

    @AfterMethod
    public void toMain()
    {
        segPage.backToMainPage();
    }
}
