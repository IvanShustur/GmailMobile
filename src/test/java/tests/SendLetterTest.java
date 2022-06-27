package tests;

import org.testng.annotations.Test;




public class SendLetterTest extends BaseTest{


    @Test(description = "Verifies send letter")
    public void sendLetterTestCase() throws InterruptedException {

      navigateActions.navigateToBasePage();
      letterActions.createLetter();
      letterActions.sendLetter();
      navigateActions.openSentLetterFolder();
      assertActions.compareSubjectOfMessage();

    }
}
