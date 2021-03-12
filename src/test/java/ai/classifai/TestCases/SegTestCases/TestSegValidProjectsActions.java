package ai.classifai.TestCases.SegTestCases;

import ai.classifai.TestCases.AnnotationTestCases.ValidProjectsActions;
import org.testng.annotations.Test;

public class TestSegValidProjectsActions extends SegBaseTest{

    private final String projectName = "seleniumTest";

    @Test(priority = 1)
    public void createProject()
    {
        ValidProjectsActions.createProject(segPage, projectName);
    }

    @Test(priority = 2)
    public void openProject()
    {
        ValidProjectsActions.openProject(segPage, projectName);
    }

    @Test(priority = 3)
    public void deleteProject()
    {
        ValidProjectsActions.deleteProject(segPage, projectName);
    }
}
