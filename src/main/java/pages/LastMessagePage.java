package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class LastMessagePage extends BasePage {

    @FindBy(id = "subject_and_folder_view")
    private WebElement subjectElement;

    public String getLetterSubject() {
        WaitUtils.forVisibilityOf(subjectElement);
        String subject = subjectElement.getText();
        String[] arr = subject.split(" ");
        return arr[0];
    }
}
