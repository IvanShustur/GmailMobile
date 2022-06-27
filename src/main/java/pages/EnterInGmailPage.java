package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class EnterInGmailPage extends BasePage{
    private static final Logger log = LogManager.getLogger(EnterInGmailPage.class);

    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItButton;

    public void clickOnGotItButton(){
        log.info("Enter into Gmail account  manager");
        WaitUtils.forVisibilityOf(gotItButton);
        gotItButton.click();
    }

}
