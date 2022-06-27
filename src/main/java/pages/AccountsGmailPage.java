package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class AccountsGmailPage extends BasePage{
    private static final Logger log = LogManager.getLogger(AccountsGmailPage.class);

    @FindBy(xpath = "//*[@text='TAKE ME TO GMAIL']")
    private WebElement takeMeToGmailPage;

    public void clickOnTakeMeToGmailButton(){
        log.info("Open Gmail base page");
        WaitUtils.forVisibilityOf(takeMeToGmailPage);
        takeMeToGmailPage.click();
    }
}
