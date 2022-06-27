package utils.entities;


public class Letter {
    private String recipient;
    private String subject;
    private String message;

    public Letter(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }

    public String getRecipient() {return recipient;}

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
    public Letter() {};
}
