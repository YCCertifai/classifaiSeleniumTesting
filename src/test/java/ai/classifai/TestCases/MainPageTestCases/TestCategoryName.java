package ai.classifai.TestCases.MainPageTestCases;

import ai.classifai.TestCases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCategoryName extends BaseTest {

    @Test
    public void testCategoryInEnglish()
    {
        mainPage.selectLanguage("EN");

        Assert.assertEquals(mainPage.getTabularCategoryName(), "Tabular");
        Assert.assertEquals(mainPage.getImageCategoryName(), "Image");
        Assert.assertEquals(mainPage.getVideoCategoryName(), "Video");
        Assert.assertEquals(mainPage.getVoiceCategoryName(), "Voice");
    }

    @Test
    public void testCategoryInMalay()
    {
        mainPage.selectLanguage("MS");

        Assert.assertEquals(mainPage.getTabularCategoryName(), "Jadual");
        Assert.assertEquals(mainPage.getImageCategoryName(), "Imej");
        Assert.assertEquals(mainPage.getVideoCategoryName(), "Video");
        Assert.assertEquals(mainPage.getVoiceCategoryName(), "Suara");
    }

    @Test
    public void testCategoryInChinese()
    {
        mainPage.selectLanguage("CN");

        Assert.assertEquals(mainPage.getTabularCategoryName(), "表格");
        Assert.assertEquals(mainPage.getImageCategoryName(), "图像");
        Assert.assertEquals(mainPage.getVideoCategoryName(), "视频");
        Assert.assertEquals(mainPage.getVoiceCategoryName(), "语音");
    }
}
