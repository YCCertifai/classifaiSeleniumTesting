package ai.classifai.TestCases.MainPageTestCases;

import ai.classifai.TestCases.BaseTest;
import ai.classifai.pages.V1.SegmentationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestToSegProject extends BaseTest {

    @Test
    public void testToBBoxProject()
    {
        SegmentationPage segPage = mainPage.toSegmentationPage();
        Assert.assertEquals(segPage.getProjectTypeName(), "Polygon");
    }
}
