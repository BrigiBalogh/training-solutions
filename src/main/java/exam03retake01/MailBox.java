package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();


    public void addMail(Mail mail1) {
    }

    public List<Mail> findByCriteria(String criteria)
    {
        String[] array = criteria.split(":");
        if (array[0].equals("from"))
        {
            for (int i = 0; i < mails.size();i++)
            {

            }
        }
        else
            {

            }

        return
    }

    public List<Mail> getMails() {
        return mails;
    }
}
