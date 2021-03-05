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
}
