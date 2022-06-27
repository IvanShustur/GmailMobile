package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utils.FileManager;



public class SendLetterTest extends BaseTest{


    @Test(description = "Verifies send letter")
    public void sendLetterTestCase() throws InterruptedException {

      navigateActions.navigateToBasePage();
      letterActions.createLetter();
      letterActions.sendLetter();
      navigateActions.openSentLetterFolder();
      assertActions.compareSubjectOfMessage();


//        enterInGmailPage.clickOnGotItButton();
//        accountsGmailPage.clickOnTakeMeToGmailButton();
//
//
//        baseGmailPage.clickOnComposeButton();
//        letterPage.fillInRecipient(FileManager.getLetter().getRecipient());
//        letterPage.writeSubject(FileManager.getLetter().getSubject());
//        letterPage.writeMessage(FileManager.getLetter().getMessage());
//        letterPage.clickOnSendLetterButton();
//
//        baseGmailPage.openSideBarMenu();
//        baseGmailPage.openSentFolder();
//
//        sentMessagesPage.openLastMessage();
//        lastMessagePage.getLetterSubject();
//        Assert.assertEquals(FileManager.getLetter().getSubject(), lastMessagePage.getLetterSubject() ,
//                String.format("Expected subject [%s], but found is [%s]", FileManager.getLetter().getSubject(), lastMessagePage.getLetterSubject()));


    }
}
