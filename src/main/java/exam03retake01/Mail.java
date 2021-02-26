package exam03retake01;

import java.util.List;

public class Mail {

    private Contact from;
    private List<Contact> to;
    private String subject;
    private String message;


    public Mail(Contact from, List<Contact> to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public Contact getFrom() {
        return from;
    }

    public List<Contact> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public boolean hasCriteria(String criteria) {
        String[] array = criteria.split(":");
        String key = array[0];
        switch(key) {
            case "from":
                return from.hasCriteria(array[1]);
            case "to":
                for (Contact t : to) {
                    if (t.hasCriteria(array[1])) {
                        return true;
                    }
                }
                return false;
            default:
                return subject.contains(criteria) || message.contains(criteria);
        }
    }
}
