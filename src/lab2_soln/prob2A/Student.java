package lab2_soln.prob2A;

public class Student {

    private GradeReport gradeReport;

    public Student() {
        this.gradeReport = new GradeReport(this);
        gradeReport.setMark("20%");
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
