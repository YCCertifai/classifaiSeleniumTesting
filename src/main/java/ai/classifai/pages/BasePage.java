package ai.classifai.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;
    protected Actions actions;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
    }

    public WebElement find(By element){
        return wait.until(d -> d.findElement(element));
    }

    public void keyIn(By element, String word){
        find(element).sendKeys(word);
    }

    public void click(By element){
        try{
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public String getText(By element){
        return find(element).getText();
    }

    public void doubleClick(By element){
        actions.doubleClick(find(element)).perform();
    }

    public void selectDropDownByText(By element, String text){
        Select select = new Select(find(element));
        select.selectByVisibleText(text);
    }

    public void selectDropDownByValue(By element, String value){
        Select select = new Select(find(element));
        select.selectByValue(value);
    }

    public void goBack()
    {
        try {
            Thread.sleep(500);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        driver.navigate().back();
    }

    public boolean isAlertPresent()
    {
        try
        {
            driver.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException Ex)
        {
            return false;
        }
    }

    public String getAlertContext()
    {
        return driver.switchTo().alert().getText();
    }

    public void alertClickOk()
    {
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }

    public void refresh()
    {
        driver.navigate().refresh();
    }

}
