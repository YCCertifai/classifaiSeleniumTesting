package ai.classifai.TestCases.AnnotationTestCases;

import ai.classifai.pages.V1.AnnotationPage;
import org.testng.Assert;

public class ValidProjectsActions extends CommonActions{

    public static void createProject(AnnotationPage page, String projectName)
    {
        page.createProject(projectName);
        page.waitForLoading();
        Assert.assertFalse(page.isProjectPopUpVisible());
    }

    public static void openProject(AnnotationPage page, String projectName)
    {
        page.openProject(projectName);
        page.waitForLoading();
        Assert.assertFalse(page.isProjectPopUpVisible());
    }

    public static void deleteProject(AnnotationPage page, String projectName)
    {
        page.deleteProject(projectName);
        Assert.assertTrue(page.isAlertPresent());
        assertAlertContext(page, projectName + " is successfully deleted!");
    }
}
