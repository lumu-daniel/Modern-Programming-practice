package lab2_soln.prob2A;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        GradeReport gradeReport = student.getGradeReport();
        System.out.println(gradeReport.getMark());
    }
}
