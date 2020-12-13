package springmvc;

public class StudentData {
    private static String studentName, studentNum;
    private static double gpa;

    public StudentData(String studentName, String studentNum, double gpa) {
        this.studentName = studentName;
        this.studentNum = studentNum;
        this.gpa = gpa;
    }

    public static String getStudentName() {
        return studentName;
    }

    public static void setStudentName(String studentName) {
        studentName = studentName;
    }

    public static String getStudentNum() {
        return studentNum;
    }

    public static void setStudentNum(String studentNum) {
        studentNum = studentNum;
    }

    public static double getGpa() {
        return gpa;
    }

    public static void setGpa(double gpa) {
        gpa = gpa;
    }
}
