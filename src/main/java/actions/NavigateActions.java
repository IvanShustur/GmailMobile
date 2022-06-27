package actions;

import pages.AccountsGmailPage;
import pages.BaseGmailPage;
import pages.EnterInGmailPage;
import pages.SentMessagesPage;

public class NavigateActions {
    private EnterInGmailPage enterInGmailPage = new EnterInGmailPage();
    private AccountsGmailPage accountsGmailPage = new AccountsGmailPage();
    private BaseGmailPage baseGmailPage = new BaseGmailPage();
    private SentMessagesPage sentMessagesPage = new SentMessagesPage();

    public void navigateToBasePage() {
        enterInGmailPage.clickOnGotItButton();
        accountsGmailPage.clickOnTakeMeToGmailButton();
    }

    public void openSentLetterFolder() throws InterruptedException {
        baseGmailPage.openSideBarMenu();
        baseGmailPage.openSentFolder();
        sentMessagesPage.openLastMessage();
    }
}
