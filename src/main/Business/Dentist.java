package main.Business;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class Dentist {
    String id;
    String password;
    String firstName;
    String lastName;
    String email;
    int office;

    public Dentist() {
        id = "";
        password = "";
        firstName = "";
        lastName = "";
        email = "";
        office = -1;
    }

    public Dentist(String id, String password, String firstName, String lastName, String email, int office) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.office = office;
    }

//    Database methods
    private Connection createConnection() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Dotenv dotenv = Dotenv.configure().directory(".env").load();
            String connURL = dotenv.get("DATABASE_URL");

            return DriverManager.getConnection(connURL);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectDB(String email) {
        try {
            Connection conn = createConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Dentists WHERE email=?");
            stmt.setString(1, email);
            ResultSet data = stmt.executeQuery();

            if (data.next()) {
                setId(data.getString("id"));
                setPassword(data.getString("passwd"));
                setFirstName(data.getString("firstName"));
                setLastName(data.getString("lastName"));
                setEmail(data.getString("email"));
                setOffice(data.getInt("office"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    Set and Get methods
    public String getId() { return id; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public int getOffice() { return office; }

    public void setId(String id) { this.id = id; }
    public void setPassword(String password) { this.password = password; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setOffice(int office) { this.office = office; }

}
