package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();


    public void addMail(Mail mail1) {
        mails.add(mail1);
    }

    public List<Mail> findByCriteria1(String criteria) {
        List<Mail> ret = new ArrayList<>();
        String[] array = criteria.split(":");
        for (Mail m : mails) {
            if (m.hasCriteria(criteria)) {
                ret.add(m);
            }
        }
        return ret;
    }

    public List<Mail> findByCriteria(String criteria)
    {
        List<Mail> ret = new ArrayList<>();
        String[] array = criteria.split(":");
        if (array[0].equals("from"))
        {
            for (int i = 0; i < mails.size();i++)
            {
                Mail m = mails.get(i);
                if (m.getFrom().getEmail().equals(array[1]) ||
                    m.getFrom().getName().equals(array[1])) {
                    ret.add(m);
                }
            }
        }
        else if (array[0].equals("to"))
            {
                for (int i = 0; i < mails.size();i++) {
                    Mail m = mails.get(i);
                    for (Contact to : m.getTo()) {
                        if (to.getName().equals(array[1]) ||
                            to.getEmail().equals(array[1])) {
                            ret.add(m);
                            break;
                        }
                    }
                }
            }
        else {
            for (int i = 0; i < mails.size();i++) {
                Mail m = mails.get(i);
                if (m.getSubject().contains(criteria) ||
                        m.getMessage().contains(criteria)) {
                    ret.add(m);
                }
            }
        }

        return ret;
    }

    public List<Mail> getMails() {
        return mails;
    }
}
