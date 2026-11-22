import java.sql.*;
public class MyClass {
  public static void main(String args[]) throws Exception {
    String url = "jdbc:h2:mem:testdb";
    String user = "sa";
    String password = "";
    String createTable = "CREATE TABLE students (" +
      "id INT PRIMARY KEY AUTO_INCREMENT," +
      "name VARCHAR(50)," +
      "age INT)";
    String insertValues = "INSERT INTO students(name,age) VALUES ('Abrar',24)";
    String selectAll = "SELECT * FROM students";
    Connection conn = DriverManager.getConnection(url, user, password);

    Statement stmt = conn.createStatement();
    stmt.execute(createTable);
    stmt.execute(insertValues);

    ResultSet rs = stmt.executeQuery(selectAll);

    while (rs.next()) {
      System.out.println("id " + rs.getInt("id") + " " + "name " + rs.getString("name") + " " + "age " + rs.getInt("age"));
    }
  }
}
