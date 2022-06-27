package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopupsPage extends BasePage{
    private static final Logger log = LogManager.getLogger(PopupsPage.class);

    @FindBy(xpath = "//*[@text='DISMISS']")
    private WebElement dismissButton;

    public void clickOnDismissButton(){
        log.info("DISMISS UPGRADE");
        dismissButton.click();
    }
}
