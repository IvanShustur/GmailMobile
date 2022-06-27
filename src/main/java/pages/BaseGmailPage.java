package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class BaseGmailPage extends BasePage{
    private static final Logger log = LogManager.getLogger(BaseGmailPage.class);

    @FindBy(id = "compose_button")
    private WebElement composeButton;

    @FindBy(className = "android.widget.ImageButton")
    private WebElement sideBarButton;

    @FindBy(xpath = "//*[@text='Sent']")
    private WebElement sentMessagesFolder;

    public void openSentFolder() {
        log.info("Open sent messages folder");
        WaitUtils.forVisibilityOf(sentMessagesFolder).click();
    }



    public void clickOnComposeButton() throws InterruptedException {
        log.info("Click on creating new letter button");
        Thread.sleep(100);
        WaitUtils.forVisibilityOf(composeButton).click();
    }

    public void openSideBarMenu() throws InterruptedException {
        log.info("Open navigation panel");
        Thread.sleep(120);
        sideBarButton.click();
    }

}
