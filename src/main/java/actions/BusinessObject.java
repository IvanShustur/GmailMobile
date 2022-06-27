package actions;

import actions.asserts.SubjectLetterAsserter;
import pages.*;
import utils.FileManager;

public class BusinessObject {

    private EnterInGmailPage enterInGmailPage = new EnterInGmailPage();
    private AccountsGmailPage accountsGmailPage = new AccountsGmailPage();
    private BaseGmailPage baseGmailPage = new BaseGmailPage();
    private NewLetterPage letterPage = new NewLetterPage();
    private SentMessagesPage sentMessagesPage = new SentMessagesPage();
    private LastMessagePage lastMessagePage = new LastMessagePage();
    private SubjectLetterAsserter subjectLetterAsserter = new SubjectLetterAsserter();

    public void navigateToBasePage() {
        enterInGmailPage.clickOnGotItButton();
        accountsGmailPage.clickOnTakeMeToGmailButton();
    }

    public void openSentLetterFolder() throws InterruptedException {
        baseGmailPage.openSideBarMenu();
        baseGmailPage.openSentFolder();
    }

    public void compareSubjectOfMessage(){
        sentMessagesPage.openLastMessage();
        lastMessagePage.getLetterSubject();
        subjectLetterAsserter.compareMessageBySubject(FileManager.getLetter().getSubject(), lastMessagePage.getLetterSubject());
    }

    public void createLetter () throws InterruptedException {
        baseGmailPage.clickOnComposeButton();
        letterPage.fillInRecipient(FileManager.getLetter().getRecipient());
        letterPage.writeSubject(FileManager.getLetter().getSubject());
        letterPage.writeMessage(FileManager.getLetter().getMessage());
    }
    public  void sendLetter(){
        letterPage.clickOnSendLetterButton();
    }
}