package actions;


import actions.asserts.SubjectLetterAsserter;
import pages.LastMessagePage;
import pages.SentMessagesPage;
import utils.FileManager;

public class AssertActions {
    private SentMessagesPage sentMessagesPage = new SentMessagesPage();
    private LastMessagePage lastMessagePage = new LastMessagePage();
    private SubjectLetterAsserter subjectLetterAsserter = new SubjectLetterAsserter();


    public void compareSubjectOfMessage(){

        lastMessagePage.getLetterSubject();
        subjectLetterAsserter.compareMessageBySubject(FileManager.getLetter().getSubject(), lastMessagePage.getLetterSubject());
    }
}
