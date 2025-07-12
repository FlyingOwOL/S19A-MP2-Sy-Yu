package Controllers;

import Models.Account.AccountModel; // Import the AccountModel class
import java.util.ArrayList;

public class LoginController {
    // This array list holds all the accounts registered in the system
    private ArrayList<AccountModel> accounts;

    /**
     * This constructor initializes the LoginController with the specified accounts.
     * 
     * @param accounts the list of accounts registered in the system
     */
    public LoginController(ArrayList<AccountModel> accounts) {
        this.accounts = accounts;
    }

    /**
     * This method checks if the provided username and password match an existing account.
     * 
     * @param username the username of the account
     * @param password the password of the account
     * 
     * @return the AccountModel if the credentials match, null otherwise
     */
    public AccountModel checkMatch(String username, String password) {
        // We loop through the accounts to find a match for the username and password
        for (AccountModel account : accounts) {
            // We check if the account's name matches the username and if the password is correct
            if (account.getName().equals(username) && account.checkAuthority(password)) {
                return account;
            }
        }
        // If no match is found, we return null
        return null;
    }

    /**
     * This method checks if the provided username is already taken.
     * 
     * @param username the username to check
     * 
     * @return true if the username is taken, false otherwise
     */
    public boolean isUsernameTaken(String username) {
        // We loop through the accounts to check if the username already exists.
        for (AccountModel account : accounts) {
            if (account.getName().equals(username)) {
                return true;
            }
        }
        // If the username is not taken, we return false
        return false;
    }

    /**
     * This method registers a new account with the provided username and password.
     * 
     * @param username the username for the new account
     * @param password the password for the new account
     * 
     * @return true if the registration is successful, false if the username is already taken
     */
    public boolean register(String username, String password) {
        /*  If the username is not taken, 
        we create a new AccountModel and add it to the accounts list*/
        if (isUsernameTaken(username)) {
            return false;
        }

        // Create a new AccountModel with the provided username and password
        accounts.add(new AccountModel(username, password));
        return true;
    }

}
