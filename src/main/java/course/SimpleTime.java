package course;

public class SimpleTime {

    private int hour;
    private int minute;


    public SimpleTime(int hour, int minute) {
        timeSetting(hour,minute);
    }

    public SimpleTime(String str) {
        if( str == null) {
            throw new InvalidTimeException("Time is null.");
        }
        if(str.length() != "hh:mm".length() || str.charAt(2) != ':') {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int dataHour;

        try {
            dataHour = Integer.parseInt(str.substring(0,2));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int dataMinute;
        try {
            dataMinute = Integer.parseInt(str.substring(3,5));
        }catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        timeSetting(dataHour, dataMinute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private void timeSetting(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if(minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }
}
