package week16d01;

import java.time.Duration;
import java.time.LocalDateTime;

public class CanoeRental {
    private String name;
    CanoeType canoeType;
    LocalDateTime startTime;
    LocalDateTime endTime;
    private static final int BASE_PRICE = 5000;

    public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum(LocalDateTime endTime) {
        Duration diff = Duration.between(this.startTime, endTime);
        int seconds = (int)diff.getSeconds();
        int startedHours = seconds / 3600 + (seconds % 3600 > 0 ? 1 : 0);
        return startedHours * BASE_PRICE * canoeType.getValue();
    }

    public double calculateRentalSum(){
        if (endTime == null) {
            return 0;
        } else {
            return calculateRentalSum(this.endTime);
        }
    }

    public boolean isActive() {
        return endTime == null;
    }
}
