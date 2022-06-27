package actions;

import pages.BaseGmailPage;
import pages.NewLetterPage;
import utils.FileManager;

public class LetterActions {

    private BaseGmailPage baseGmailPage = new BaseGmailPage();
    private NewLetterPage letterPage = new NewLetterPage();


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
