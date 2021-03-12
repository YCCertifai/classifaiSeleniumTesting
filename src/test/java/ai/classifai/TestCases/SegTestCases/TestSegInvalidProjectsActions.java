package ai.classifai.TestCases.SegTestCases;

import ai.classifai.TestCases.AnnotationTestCases.InvalidProjectsActions;
import org.testng.annotations.Test;

public class TestSegInvalidProjectsActions extends SegBaseTest{

    @Test
    public void openNoneProject()
    {
        InvalidProjectsActions.testOpenNoneProject(segPage);
    }

    @Test
    public void createEmptyProject()
    {
        InvalidProjectsActions.testCreateEmptyProject(segPage);
    }

    @Test
    public void deleteNoneProject()
    {
        InvalidProjectsActions.testDeleteEmptyProject(segPage);
    }


}
