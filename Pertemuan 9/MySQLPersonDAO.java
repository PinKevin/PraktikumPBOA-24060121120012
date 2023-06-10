/*
	File      : MySQLPersonDAO.java  31/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : implementasi PersonDAO untuk MySQL
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // buat koneksi, nama, db, user, password menyesuaikan
        Class.forName( "com.mysql.jdbc.Driver" );
        Connection con = DriverManager.getConnection( "jdbc:mysql://localhost/pbo", "root", "" );
        // kerjakan kueri mysql
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate( query );
        // tutup koneksi database
        con.close();
    }
}
