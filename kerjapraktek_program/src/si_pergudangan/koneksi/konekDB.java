package si_pergudangan.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class konekDB {

    private static Connection mysqlKonek;

    public static Connection getDB() throws SQLException {
        if (mysqlKonek == null) {
            try {
                String url_DB = "jdbc:mysql://localhost:3306/pendudukan";
                String user = "root";
                String pw = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlKonek = DriverManager.getConnection(url_DB, user, pw);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke Database", "Peringatan", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        return mysqlKonek;
    }
}
