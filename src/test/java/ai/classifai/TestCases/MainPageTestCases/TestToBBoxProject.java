package ai.classifai.TestCases.MainPageTestCases;

import ai.classifai.TestCases.BaseTest;
import ai.classifai.pages.V1.BoundingBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestToBBoxProject extends BaseTest {

    @Test
    public void testToBBoxProject()
    {
        BoundingBoxPage bboxPage = mainPage.toBoundingBoxPage();
        Assert.assertEquals(bboxPage.getProjectTypeName(), "Bounding Box");
    }
}
