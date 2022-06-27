package actions.asserts;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class SubjectLetterAsserter {
    private static final Logger log = LogManager.getLogger();

    public void compareMessageBySubject(String exp, String actual) {
        log.info("Verify that subjects are equals");
        Assert.assertEquals(exp, actual,
                String.format("Expected subject [%s], but found is [%s]", exp, actual));
    }
}
