package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private final List<SimpleTime> timeTable;


    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> busTimeTable = new ArrayList<>();
        for (int i = firstHour; i<= lastHour; i++) {
            busTimeTable.add(new SimpleTime(i,everyMinute));
        }
        timeTable  = busTimeTable;

    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        for (int i = 0; i < timeTable.size(); i++) {
            if (timeTable.get(i).difference(actual) >= 0) {
                return timeTable.get(i);
            }
        }
        throw new IllegalStateException("No more buses today !");


    }
}
