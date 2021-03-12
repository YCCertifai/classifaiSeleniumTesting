package ai.classifai.pages.V1;

import ai.classifai.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    //category
    private By tabularCategory = By.xpath("//div[@class='flex-container']/classifai-card[1]");
    private By imageCategory = By.xpath("//div[@class='flex-container']/classifai-card[2]");
    private By videoCategory = By.xpath("//div[@class='flex-container']/classifai-card[3]");
    private By voiceCategory = By.xpath("//div[@class='flex-container']/classifai-card[4]");

    //project
    private By projectPopUp = By.id("model");
    private By projectPopUpCloseBtn = By.className("close-modal");
    private By boundingBox = By.xpath("//div[@class='imageLbl'][1]");
    private By polygon = By.xpath("//div[@class='imageLbl'][2]");

    //language
    private By languageDropDownList = By.tagName("select");


    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    public String getTabularCategoryName()
    {
        return getText(tabularCategory);
    }

    public String getImageCategoryName()
    {
        return getText(imageCategory);
    }

    public String getVideoCategoryName()
    {
        return getText(videoCategory);
    }

    public String getVoiceCategoryName()
    {
        return getText(voiceCategory);
    }

    public void clickTabular() { click(tabularCategory);}

    public void clickImage() { click(imageCategory);}

    public void clickVideo() { click(videoCategory);}

    public void clickVoice() { click(voiceCategory);}

    private void selectCategory(By category, By projectType)
    {
        click(category);
        click(projectType);
    }

    public void selectLanguage(String language)
    {
        selectDropDownByText(languageDropDownList, language);
    }

    public BoundingBoxPage toBoundingBoxPage()
    {
        selectCategory(imageCategory, boundingBox);
        return new BoundingBoxPage(driver);
    }

    public SegmentationPage toSegmentationPage()
    {
        selectCategory(imageCategory, polygon);
        return new SegmentationPage(driver);
    }

    public boolean isProjectPopUp()
    {
        return find(projectPopUp).getAttribute("style").contains("display: block");
    }

    public void closePopUp()
    {
        find(projectPopUpCloseBtn).click();
    }
}
