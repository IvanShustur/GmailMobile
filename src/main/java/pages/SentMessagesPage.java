package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

import java.util.List;

public class SentMessagesPage extends BasePage {

    private static final Logger log = LogManager.getLogger(SentMessagesPage.class);

    @FindBy(xpath = "//android.view.View")
    private List<WebElement> sentMessagesList;

    @FindBy(id = "compose_button")
    private WebElement composeButton;

    public void openLastMessage() {
        log.info("Open last message");
        WaitUtils.forVisibilityOf(composeButton);
        WaitUtils.forVisibilityOfList(sentMessagesList);
        sentMessagesList.get(0).click();
    }
}
