package ai.classifai.TestCases.AnnotationTestCases;

import ai.classifai.pages.V1.AnnotationPage;
import ai.classifai.pages.V1.MainPage;
import org.testng.Assert;

public class InvalidProjectsActions extends CommonActions {

    public static void testOpenNoneProject(AnnotationPage page)
    {
        page.openProject("none");
        Assert.assertTrue(page.isAlertPresent());
        assertAlertContext(page,"Please select an existing project name to continue.");
    }

    public static void testCreateEmptyProject(AnnotationPage page)
    {
        page.createProject("");
        Assert.assertTrue(page.isAlertPresent());
        assertAlertContext(page, "Project name cannot be empty!");
    }

    public static void testDeleteEmptyProject(AnnotationPage page)
    {
        page.deleteProject("none");
        Assert.assertTrue(page.isAlertPresent());
        assertAlertContext(page,"none or \"\" is not acceptable");
    }

    public static void testCreateRepeatedProject(AnnotationPage page, String projectName)
    {
        page.createProject(projectName);
        page.waitForLoading();
        page.refresh();
        page.createProject(projectName);
        Assert.assertTrue(page.isAlertPresent());
        assertAlertContext(page,"Project exists. Please use another project name.");
        page.deleteProject(projectName);
        page.alertClickOk();
    }
}
