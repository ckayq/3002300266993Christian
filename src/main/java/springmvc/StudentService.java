package springmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentService {
    static Connection con;
    static PreparedStatement preparedStmt;
    private DriverManager ConnectionProvider;
    int status = 0;

    public int add(String studentName, String studentNum, double gpa) {
        try {

            String insertStmt = "INSERT INTO studentrecord VALUES(?, ?, ?);";

            preparedStmt = con.prepareStatement(insertStmt);

            preparedStmt.setString(1, StudentData.getStudentName());
            preparedStmt.setString(2, StudentData.getStudentNum());
            preparedStmt.setDouble(3, StudentData.getGpa());

            status = preparedStmt.executeUpdate();
            con.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }

        return status;
    }

    public boolean edit(String studentName, String studentNum, double gpa) {
        boolean flag = false;
        try {

            String updateStmt = "UPDATE studentrecord SET sname=?, snum=?, gpa=?";

            preparedStmt = con.prepareStatement(updateStmt);

            preparedStmt.setString(1, studentName);
            preparedStmt.setString(2, studentNum);
            preparedStmt.setDouble(3, gpa);

            int resultSet = preparedStmt.executeUpdate();
            flag = true;
            if(resultSet > 0) {
                StudentData.setStudentName(studentName);
                StudentData.setStudentNum(studentNum);
                StudentData.setGpa(gpa);
            }

            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return flag;
    }


    public boolean delete(String studentname) {

        boolean flag = false;

        try {

            String deleteStmt = "DELETE FROM studentrecord WHERE sname=?";

            preparedStmt = con.prepareStatement(deleteStmt);

            preparedStmt.setString(1, studentname);

            preparedStmt.executeUpdate();

            flag = true;

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return flag;
    }
}
