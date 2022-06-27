package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;


public class NewLetterPage extends BasePage {

    private static final Logger log = LogManager.getLogger(NewLetterPage.class);

    @FindBy(id = "to")
    private WebElement recipientInputField;
    @FindBy(id = "subject")
    private WebElement subjectInputField;
    @FindBy(xpath = "//*[@text='Compose email']")
    private WebElement messageInputField;
//    @FindBy(xpath = "//android.widget.EditText)[2]")
//    private WebElement messageInputField;
    @FindBy(id = "send")
    private WebElement sendLetterButton;

    @FindBy(id = "from_account_name")
    private WebElement accountName;

    public void fillInRecipient(String recipient) {
        log.info("Type recipient into the field");

        WaitUtils.elementToBeClickable(recipientInputField);
        WaitUtils.forVisibilityOf(sendLetterButton);
        recipientInputField.sendKeys(recipient);
    }

    public void writeSubject(String subject) {
        log.info("Type subject into the field");
        subjectInputField.sendKeys(subject);
    }

    public void writeMessage(String message) throws InterruptedException {
        log.info("Write message");
        Thread.sleep(100);
        messageInputField.sendKeys(message);
    }

    public void clickOnSendLetterButton() {
        log.info("Send letter");
        sendLetterButton.click();
    }

}
