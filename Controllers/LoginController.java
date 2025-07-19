package Controllers;

import Models.Account.AccountModel;
import Views.AccountLoginPage;
import Views.AccountPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    private AccountLoginPage accountLoginPage;
    public LoginController() {
        this.accountLoginPage = new AccountLoginPage();
        this.accountLoginPage.addLoginButtonListener(new LoginListener());
        this.accountLoginPage.addCreateAccountButtonListener(new LoginListener());
    }
    class LoginListener implements ActionListener {
        String enteredName;
        String enteredPassword;        
        public void actionPerformed(ActionEvent e){
            enteredName = accountLoginPage.getUsername();
            enteredPassword = accountLoginPage.getPassword(); 
            if (enteredName.isEmpty()) {
                System.out.println("Please enter username");
            } else {
                if (e.getSource() == accountLoginPage.getLoginButton()){
                    boolean isFound = false;
                    int accountIndex = -1; // Initialize accountIndex to -1 to indicate no account found

                    for (int i = 0; i < MainController.accounts.size(); i++) {
                        AccountModel account = MainController.accounts.get(i);
                        if (account.getName().equals(enteredName) && account.checkAuthority(enteredPassword)) {
                            isFound = true;
                            accountIndex = i; // Store the index of the found account
                            accountLoginPage.dispose(); // Close the login page
                            break;
                        }
                    }

                    if (!isFound) {
                        // Show error message if account not found
                        System.out.println("Account not found");
                    } else {
                        // Use the stored accountIndex to get the correct account
                        new AccountPage(MainController.accounts.get(accountIndex));
                    }

                } else if (e.getSource() == accountLoginPage.getCreateAccountButton()) {
                    boolean isTaken = MainController.accountExists(enteredName);
                    if (!isTaken) {
                        MainController.accounts.add(new AccountModel(enteredName, enteredPassword));
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Account name is already taken.");
                    }
                }
            }
        }
    }
}
