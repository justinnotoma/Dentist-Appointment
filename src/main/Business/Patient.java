package main.Business;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class Patient {
    private String patID;
    private String password;
    private String firstName;
    private String lastName;
    private String addr;
    private String email;
    private String insCo;

    public Patient() {
        patID = "A0";
        password = "";
        firstName = "";
        lastName = "";
        addr = "";
        email = "";
        insCo = "";
    }

    public Patient(String patID, String password, String firstName, String lastName, String addr, String email, String insCo) {
        this.patID = patID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addr = addr;
        this.email = email;
        this.insCo = insCo;
    }

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
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Patients WHERE email=?");
            stmt.setString(1, email);
            ResultSet data = stmt.executeQuery();

            if (data.next()) {
                setPatID(data.getString("patId"));
                setPassword(data.getString("passwd"));
                setFirstName(data.getString("firstName"));
                setLastName(data.getString("lastName"));
                setAddr(data.getString("addr"));
                setEmail(data.getString("email"));
                setInsCo(data.getString("insCo"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    Get and set functions
    public String getPatID() { return patID; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getAddr() { return addr; }
    public String getEmail() { return email; }
    public String getInsCo() { return insCo; }

    public void setPatID(String patID) { this.patID = patID; }
    public void setPassword(String password) { this.password = password; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAddr(String addr) { this.addr = addr; }
    public void setEmail(String email) { this.email = email; }
    public void setInsCo(String insCo) { this.insCo = insCo; }
}
