package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDBMS {

    public static void insertData(Student stu) {
        String query = Query.insertData;
        try (Connection con = DB.connect();
             PreparedStatement pstm = con.prepareStatement(query)) {
            pstm.setInt(1, stu.getRollNo());
            pstm.setString(2, stu.getName());
            pstm.setString(3, stu.getEmail());
            int rowsAffected = pstm.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateName(int rollNo, String name) {
        String query = Query.updateName;
        try (Connection con = DB.connect();
             PreparedStatement pstm = con.prepareStatement(query)) {
            pstm.setString(1, name);
            pstm.setInt(2, rollNo);
            int rowsAffected = pstm.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmail(int rollNo, String email) {
        String query = Query.updateEmail;
        try (Connection con = DB.connect();
             PreparedStatement pstm = con.prepareStatement(query)) {
            pstm.setString(1, email);
            pstm.setInt(2, rollNo);
            int rowsAffected = pstm.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void deleteData(int rollNo) {
        String query = Query.deleteData;
        try (Connection con = DB.connect();
             PreparedStatement pstm = con.prepareStatement(query)) {
            pstm.setInt(1, rollNo);
            int rowsAffected = pstm.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted.");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void readData() {
        String query = Query.selectData;
        try (Connection con = DB.connect();
             PreparedStatement pstm = con.prepareStatement(query);
             ResultSet rs = pstm.executeQuery()) {
            while (rs.next()) {
                int rollNo = rs.getInt("RollNo");
                String name = rs.getString("Name");
                String email = rs.getString("email");
                System.out.println(rollNo + " " + name + " " + email);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
}
