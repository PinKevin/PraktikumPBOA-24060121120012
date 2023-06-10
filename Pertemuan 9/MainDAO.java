/*
	File      : MainDAO.java  31/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : Main program akses DAO
*/

public class MainDAO {
    public static void main ( String[] args ) {
        Person person = new Person( "Kevin" );
        DAOManager m = new DAOManager();
        m.setPersonDAO( new MySQLPersonDAO() );
        try {
            m.getPersonDAO().savePerson( person );
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
