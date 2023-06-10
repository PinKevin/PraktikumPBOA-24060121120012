/*
	File      : DAOManager.java  31/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO ( PersonDAO person ) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO () {
        return personDAO;
    }
}
