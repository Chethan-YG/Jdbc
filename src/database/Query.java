package database;

public class Query {
    public static String insertData = "INSERT INTO Student (RollNo, Name, email) VALUES (?, ?, ?);";
    public static String updateName = "UPDATE Student SET Name=? WHERE RollNo=?;";
    public static String updateEmail = "UPDATE Student SET email=? WHERE RollNo=?;";
    public static String deleteData = "DELETE FROM Student WHERE RollNo=?;";
    public static String selectData = "SELECT RollNo, Name, email FROM Student;";
}
