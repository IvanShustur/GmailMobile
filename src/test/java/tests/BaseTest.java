package tests;


import actions.AssertActions;
import actions.LetterActions;
import actions.NavigateActions;
import factory.DriverProvider;
import org.testng.annotations.AfterMethod;


public class BaseTest {


 NavigateActions navigateActions = new NavigateActions();
 LetterActions letterActions = new LetterActions();
 AssertActions assertActions = new AssertActions();


    @AfterMethod(alwaysRun = true)
    public void closeApp() {
        DriverProvider.closeApp();
    }
}
