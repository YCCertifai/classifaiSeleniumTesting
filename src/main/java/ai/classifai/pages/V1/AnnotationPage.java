package ai.classifai.pages.V1;

import ai.classifai.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class AnnotationPage extends BasePage {

    //Project pop up
    private By projectPopUp = By.id("model");

    //Open project element
    private By openProjectSelector = By.id("proxid");
    private By openProjectBtn = By.id("proxidsubmit");

    //Open project element
    private By newProjectTxtBox = By.id("newproxid");
    private By selectLabelBtn = By.className("chooseFileBtn");
    private By createProjectBtn = By.id("createnewprox");

    //Delete project element
    private By delProjectSelector = By.id("proxiddel");
    private By delProjectBtn = By.id("proxiddelBtn");

    //Listing area
    private By drawingListTitle = By.xpath("//div[@class='listing']/div[@class='listtitle'][3]");

    //Loading page
    private By loadingPage = By.id("loadingpage");

    public AnnotationPage(WebDriver driver)
    {
        super(driver);
    }

    public void openProject(String name)
    {
        selectDropDownByValue(openProjectSelector, name);
        click(openProjectBtn);
    }

    public void createProject(String name)
    {
        keyIn(newProjectTxtBox, name);
        click(createProjectBtn);
    }

    public void deleteProject(String name)
    {
        selectDropDownByValue(delProjectSelector, name);
        click(delProjectBtn);
    }

    public MainPage backToMainPage()
    {
        goBack();
        return new MainPage(driver);
    }

    private boolean isLoading()
    {
        return find(loadingPage).getAttribute("style").contains("display: block");
    }

    public void waitForLoading()
    {
        if (isLoading())
        {
            wait.until(ExpectedConditions.attributeContains(loadingPage,"style", "display: none"));
        }
    }

    public String getProjectTypeName()
    {
        return find(drawingListTitle).getText();
    }

    public boolean isProjectPopUpVisible()
    {
        return !find(projectPopUp).getAttribute("style").contains("display: none");
    }

}
