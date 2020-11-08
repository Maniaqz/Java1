import java.sql.*;

public class Main {

    private static Connection conn;
    private  static Statement stmt;
    private static PreparedStatement pstmt;

    public static void main(String[] args) {
    try {
        connect();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }

// Создание таблицы

        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Employees (" +
                    "EmpID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                    " Name TEXT NOT NULL," +
                    " GroupName TEXT NOT NULL," +
                    " Score INTEGER NOT NULL);");
        } catch (SQLException e) {
            e.printStackTrace();
        }

// Внесение значений

        try {
            stmt.executeUpdate("INSERT INTO Employees (Name, GroupName, Score) " +
                    "VALUES ('Sam', 'Sales', 35)");
            stmt.executeUpdate("INSERT INTO Employees (Name, GroupName, Score) " +
                    "VALUES ('Bob', 'HR', 30)");
            stmt.executeUpdate("INSERT INTO Employees (Name, GroupName, Score) " +
                    "VALUES ('Chuck', 'CEO', 56)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

// Внесение значений с защитой от SQL-инъекции

        try {
            pstmt = conn.prepareStatement("INSERT INTO Employees (Name, GroupName, Score) " +
                    "VALUES (?, ?, ?)");

            conn.setAutoCommit(false);

            for (int i = 0; i < 3; i++) {
                pstmt.setString(1, "Bob" + (i + 1));
                pstmt.setString(2, "Student");
                pstmt.setInt(3, 20);
                pstmt.addBatch();
            }

            pstmt.executeBatch();

            conn.setAutoCommit(true);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

// Обновление данных (2 задание)

        try {
            stmt.executeUpdate("UPDATE Employees SET Score = 50 WHERE Name = 'Bob1'");
            stmt.executeUpdate("UPDATE Employees SET Score = 55 WHERE Name = 'Bob2'");
            stmt.executeUpdate("UPDATE Employees SET Score = 65 WHERE Name = 'Bob3'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

// Получение данных

        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString("Name") + " " + rs.getString("GroupName"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

// Удаление данных

        try {
            stmt.executeUpdate("DELETE FROM Employees WHERE GroupName = 'HR'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

// Удаление таблицы

//        try {
//            stmt.executeUpdate("DROP TABLE IF EXISTS Employees");
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }



        disconnect();

    }

    private static void connect () throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = conn.createStatement();
    }

    private static void disconnect() {
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
