package ai.classifai.TestCases.AnnotationTestCases;

import ai.classifai.pages.BasePage;
import org.testng.Assert;

public class CommonActions {

    public static void assertAlertContext(BasePage page, String value){
        if(page.isAlertPresent())
        {
            Assert.assertEquals(page.getAlertContext(), value);
            page.alertClickOk();
        }
    }
}
