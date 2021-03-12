package ai.classifai.TestCases.BBoxTestCases;

import ai.classifai.TestCases.AnnotationTestCases.ValidProjectsActions;
import org.testng.annotations.Test;

public class TestBBoxValidProjectsActions extends BBoxBaseTest{

    @Test(priority = 1)
    public void createProject()
    {
        ValidProjectsActions.createProject(bboxPage, projectName);
    }

    @Test(priority = 2)
    public void openProject()
    {
        ValidProjectsActions.openProject(bboxPage, projectName);
    }

    @Test(priority = 3)
    public void deleteProject()
    {
        ValidProjectsActions.deleteProject(bboxPage, projectName);
    }
}
