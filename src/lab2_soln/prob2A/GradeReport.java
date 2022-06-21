package lab2_soln.prob2A;

public class GradeReport {
    private Student student;
    private String mark;

    public GradeReport(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
