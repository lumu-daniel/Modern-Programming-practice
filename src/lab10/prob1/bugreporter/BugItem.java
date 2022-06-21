package lab10.prob1.bugreporter;

public class BugItem {

    private String assignedTo,className,description,reportedBy;
    private int severity;

    public BugItem(String assignedTo, String className, String description, String reportedBy, int severity) {
        this.assignedTo = assignedTo;
        this.className = className;
        this.description = description;
        this.reportedBy = reportedBy;
        this.severity = severity;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getClassName() {
        return className;
    }

    public String getDescription() {
        return description;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public int getSeverity() {
        return severity;
    }
}
