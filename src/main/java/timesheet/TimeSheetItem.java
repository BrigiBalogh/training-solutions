package timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {

    private Employee employee;
    private Project project;
    private LocalDateTime beginDate;

    public TimeSheetItem(Employee employee, Project java, LocalDateTime of, LocalDateTime of1) {
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    public Project getEmployee() { return null;
    }

    public Project getProject() { return null;
    }

    public LocalDateTime getEndDate() { return null;
    }

    public long hoursBetweenDates() { return 0;
    }
}
