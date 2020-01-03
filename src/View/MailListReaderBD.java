package View;

import Model.Mail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {

    public static List<Mail> read(String name) {
        String sql = "SELECT direccion FROM direc_email";
        Connection con = connect("kata5.db");
        List<Mail> list = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while(result.next()) {
                list.add(new Mail(result.getString("direccion")));
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    private static Connection connect(String name) {
        Connection con = null;
        String url = "jdbc:sqlite:" + name;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
