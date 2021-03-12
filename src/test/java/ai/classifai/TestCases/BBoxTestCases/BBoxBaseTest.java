package ai.classifai.TestCases.BBoxTestCases;

import ai.classifai.TestCases.BaseTest;
import ai.classifai.pages.V1.BoundingBoxPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BBoxBaseTest extends BaseTest {
    protected BoundingBoxPage bboxPage;

    @BeforeMethod
    public void toBBoxPage()
    {
        bboxPage = mainPage.toBoundingBoxPage();
    }

    @AfterMethod
    public void toMain()
    {
        mainPage = bboxPage.backToMainPage();
    }
}
