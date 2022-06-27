package tests;


import actions.AssertActions;
import actions.BusinessObject;
import actions.LetterActions;
import actions.NavigateActions;
import actions.asserts.SubjectLetterAsserter;
import factory.DriverProvider;
import org.testng.annotations.AfterMethod;
import pages.*;


public class BaseTest {


 NavigateActions navigateActions = new NavigateActions();
 LetterActions letterActions = new LetterActions();
 AssertActions assertActions = new AssertActions();


    @AfterMethod(alwaysRun = true)
    public void closeApp() {
        DriverProvider.closeApp();
    }
}
