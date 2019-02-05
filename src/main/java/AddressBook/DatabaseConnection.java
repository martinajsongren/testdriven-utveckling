package AddressBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;


public class DatabaseConnection {
    private Connection con;


    /**
     *
     * @param server : the address to SQL server
     * @param username
     * @param password
     */
    public DatabaseConnection(String server,  String username, String password) {
        super();
        try {
            this.con = DriverManager.getConnection(server, username, password);
        } catch (SQLException e) {
            System.err.println("Connection to server could not be established");
            e.printStackTrace();
        }
    }
    public String getUserName(UUID id) {
        return null;
    }
    public String getUserStreetAddress(UUID id) {
        return null;
    }
    public String getUserPhone(UUID id) {
        return null;
    }
    public String getUserEmail(UUID id) {
        return null;
    }
    public Date getUserBirthday(UUID id) {
        return null;
    }
    /**
     * Find persons with a name that matches, the search should be a little fuzzy.
     * @param name : The name to look for.
     * @return : a map with the exact name and the person object
     */
    public Map<String, Person> searchUserByName(String name) {
        return null;
    }
    /**
     *
     * @param contact : a person object to be saved in the database
     * @return true/false depending on success
     */
    public boolean saveUser(Person contact) {
        return false;
    }
    public String getUser(UUID id) {
        return null;
    }
}
