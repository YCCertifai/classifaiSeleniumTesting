package ai.classifai.TestCases.MainPageTestCases;

import ai.classifai.TestCases.BaseTest;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCategoryClickable extends BaseTest {
    @AfterMethod
    public void closePopUpIfExists()
    {
        if (mainPage.isProjectPopUp())
        {
            mainPage.closePopUp();
        }
    }

    @Test
    public void testTabularClickable()
    {
        mainPage.clickTabular();
        Assert.assertFalse(mainPage.isProjectPopUp());
    }

    @Test
    public void testImageClickable()
    {
        mainPage.clickImage();
        Assert.assertTrue(mainPage.isProjectPopUp());
    }

    @Test
    public void testVideoClickable()
    {
        mainPage.clickVideo();
        Assert.assertFalse(mainPage.isProjectPopUp());
    }

    @Test
    public void testVoiceClickable()
    {
        mainPage.clickVoice();
        Assert.assertFalse(mainPage.isProjectPopUp());
    }

}
