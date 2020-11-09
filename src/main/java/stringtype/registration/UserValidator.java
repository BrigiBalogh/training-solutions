package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return !"".equals(username);
    }

    public boolean isValidPassword(String password1,String password2){
        return password1.length() >=8
            && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int index= email.indexOf('@');
        String data=email.substring(index+1);
        int data2=data.indexOf('.');
        return index > 0
             && data2 > 0
             && data2 < data.length() -1;
    }
}
