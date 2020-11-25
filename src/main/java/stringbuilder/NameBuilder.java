package stringbuilder;

public class NameBuilder {

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title)  {

        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty ! ");
        }

        StringBuilder names = new StringBuilder("");

        if (title != null)  {
            names.append(title.getTitles()).append("").append(givenName);
        } else {
            names.append(givenName);
        }
        names.append(" ");
        if (middleName != null && !"".equals(middleName)) {
            names.append(middleName).append(" ");
        }
        names.append(familyName);

        return names.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {

        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty ! ");
        }

        StringBuilder names = new StringBuilder();

        if (title != null)  {
            names.append(title.getTitles()).append("").append(familyName);
        } else {
            names.append(familyName);
        }

        names.append(" ");

        if (middleName != null && !"".equals(middleName)) {
            names.append(middleName).append(" ");
        }
        names.append(givenName);

        return names.toString();
    }

    public String insertTitle(String name, Title title, String where) {
       StringBuilder sb = new StringBuilder(name);
        int index = sb.indexOf(where);
        sb.insert(index + 1, (title.getTitles() + " "));
        return sb.toString();
    }

    public String deleteNamePart(String name, String delete){

        int index = name.indexOf(delete);

        StringBuilder sb = new StringBuilder(name);
        sb.delete(index, index+ delete.length());

        return sb.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
