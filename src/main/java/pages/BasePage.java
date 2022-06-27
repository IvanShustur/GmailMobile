package pages;

import factory.DriverProvider;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverProvider.getDriver()), this);
    }
}
