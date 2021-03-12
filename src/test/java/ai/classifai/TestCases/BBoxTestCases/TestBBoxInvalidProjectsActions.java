package ai.classifai.TestCases.BBoxTestCases;

import ai.classifai.TestCases.AnnotationTestCases.InvalidProjectsActions;
import org.testng.annotations.Test;

public class TestBBoxInvalidProjectsActions extends BBoxBaseTest{

    @Test
    public void openNoneProject()
    {
        InvalidProjectsActions.testOpenNoneProject(bboxPage);
    }

    @Test
    public void createEmptyProject()
    {
        InvalidProjectsActions.testCreateEmptyProject(bboxPage);
    }

    @Test
    public void deleteNoneProject()
    {
        InvalidProjectsActions.testDeleteEmptyProject(bboxPage);
    }

    @Test
    public void createProjectRepeatedName()
    {
        InvalidProjectsActions.testCreateRepeatedProject(bboxPage, projectName);
    }
}
