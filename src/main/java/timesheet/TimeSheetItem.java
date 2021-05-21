package timesheet;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private Employee employee;
    private Project project;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;

    public TimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        this.employee = employee;
        this.project = project;
        if(notSameDay(beginDate,endDate)) {
            throw new IllegalArgumentException("The dates are not on same day.");
        } else if (beginDateIsLater(beginDate, endDate)) {
            throw new IllegalArgumentException("The begin date is later than end date");
        }
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public long hoursBetweenDates() {
        long hours =0;
        Duration.between(beginDate, endDate).toHours();
        return hours;
    }

    public boolean employeeNameis(String name) {
        return employee.getName().equals(name);
    }

    public boolean isAt(int year, int month) {
        return beginDate.getYear() == year && beginDate.getMonthValue() == month;
    }

    private boolean notSameDay(LocalDateTime beginDate, LocalDateTime endDate) {
        return !beginDate.toLocalDate().equals(endDate.toLocalDate());
    }

    private boolean beginDateIsLater(LocalDateTime beginDate, LocalDateTime endDate) {
        return beginDate.isAfter(endDate);

    }
}
