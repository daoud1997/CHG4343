import javax.swing.*; 

/**************************************************************
* This class is an implementation of PDUserInterface
* that uses JOptionPane to display the menu of command choices.
*/

public class AbsorptionGUI {

    /** A reference to the PackedAbsorptionColumn object to be processed.
    Globally available to the command-processing methods.
    */

    private PackedAbsorptionColumn column = null;

       // Methods
    /** Method to display the command choices and process user
    commands.
    pre: The column exists and has an AbsorptionSystem and Packing.
    post: AbsorptionSystem and Packing are updated based on user commands.
    @param column A reference to the PackedAbsorptionColumn
    to be processed.
    */

    public void processCommands(PackedAbsorptionColumn column) {

        String[] commands = {"Add Absoprtion System",
							 "Add Packing",
        					"Choose packing material",
							"Choose...",
        					"Exit"};
        theColumn = column;       
        int choice;
        do {
            choice = JOptionPane.showOptionDialog(
            null, // No parent
            "Select action", // Prompt message
            "Packed Absorption Column", // Window title
            JOptionPane.YES_NO_CANCEL_OPTION, // Option type
            JOptionPane.QUESTION_MESSAGE, // Message type
            null, // Icon
            commands, // List of commands
            commands[commands.length - 1]); // Default choice
            switch (choice) {
                case 0: createAbsorptionColumn(); break;
                case 1: addAbsorptionSystem(); break;
                case 2: addPacking(); break;
                case 3: resetValues(); break;
                case 4: plotResult(); break;
                case 5: System.exit(0);
            }
        } while (choice < commands.length - 1);
        System.exit(0);
    }   
   
    /** Method to add an account.
    pre: The bank exists and has accounts and customers.
    post: A new account is created
    */
    private void inputData() {
        // Request the name
        String v1 = JOptionPane.showInputDialog("Enter the gas flow rate at the inlet: ");
        if (v1 == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
		String l2 = JOptionPane.showInputDialog("Enter the liquid flow rate at the inlet: ");
        if (l2 == null) 
            return; // Dialog was cancelled.
		double l_2 = Double.parseDouble(l2);
		String yA1 = JOptionPane.showInputDialog("Enter the mole fraction of the solute in the gas at the inlet: ");
        if (yA1 == null) 
            return; // Dialog was cancelled.
		double y_A1 = Double.parseDouble(yA1);
		String xA2 = JOptionPane.showInputDialog("Enter the gas flow rate at the inlet: ");
        if (xA2 == null) 
            return; // Dialog was cancelled.
		double x_A2 = Double.parseDouble(xA2);
		String r = JOptionPane.showInputDialog("Enter the percent recovery of solute: ");
        if (r == null) 
            return; // Dialog was cancelled.
		double rec = Double.parseDouble(r);
		String T = JOptionPane.showInputDialog("Enter the operating temperature: ");
        if (T == null) 
            return; // Dialog was cancelled.
		double temp = Double.parseDouble(T);
		String DABV = JOptionPane.showInputDialog("Enter the diffusion coefficient of the solute in the gas: ");
        if (DABV == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
		String D_AB_L = JOptionPane.showInputDialog("Enter the diffusion coefficient of the solute in the liquid: ");
        if (D_AB_L == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
		String muL = JOptionPane.showInputDialog("Enter the viscosity of the liquid: ");
        if (muL == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
		String muV = JOptionPane.showInputDialog("Enter the viscosity of the gas: ");
        if (muV == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
		String rhoL = JOptionPane.showInputDialog("Enter the viscosity of the liquid: ");
        if (rhoL == null) 
            return; // Dialog was cancelled.	
		double v_1 = Double.parseDouble(v1);		
		String rhoV = JOptionPane.showInputDialog("Enter the density of the gas: ");
        if (rhoV == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);		
		String MWA = JOptionPane.showInputDialog("Enter the molecular weight of the solute: ");
        if (MWA == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
		String MWL = JOptionPane.showInputDialog("Enter the molecular weight of the liquid: ");
        if (MWL == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
		String MWV = JOptionPane.showInputDialog("Enter the molecular weight of the gas: ");
        if (MWV == null) 
            return; // Dialog was cancelled.
		double v_1 = Double.parseDouble(v1);
        
		
		
		
		String age = JOptionPane.showInputDialog("Enter Customer Age");
        if (age == null) {
            return; // Dialog was cancelled.
        }
        int customerAge = Integer.parseInt(age);
		
		
		
             //Request type of packing material
        String[] packingMaterial = {"Rashing Rings",  "Pall Rings", "BerlSaddles", "Cancel"}; 
        int choice;
        boolean VIP=false;
        choice = JOptionPane.showOptionDialog(
        		null, // No parent
        		"Select customer type", // Prompt message
        		"Bank System", // Window title
        		JOptionPane.YES_NO_CANCEL_OPTION, // Option type
        		JOptionPane.QUESTION_MESSAGE, // Message type
        		null, // Icon
        		packingMaterial, // List of commands
        		packingMaterial[packingMaterial.length - 1]); // Default choice 
        if (choice == packingMaterial.length - 1)
            return; //Dialog was cancelled.
        int customerType = choice;
        //what type of senior?
        if(choice==0){
        	String[] seniorType = {"Senior",  "VIPsenior"}; 
            choice = JOptionPane.showOptionDialog(
            		null, // No parent
            		"Select customer type", // Prompt message
            		"Bank System", // Window title
            		JOptionPane.YES_NO_CANCEL_OPTION, // Option type
            		JOptionPane.QUESTION_MESSAGE, // Message type
            		null, // Icon
            		seniorType, // List of commands
            		seniorType[0]); // Default choice 
                     VIP = (choice==1);
           }
        //Request type of account
        String[] commands = {"Savings", "Checking", "Cancel"};
        choice = JOptionPane.showOptionDialog(
        		null, // No parent
        		"Select account type", // Prompt message
        		"Bank System", // Window title
        		JOptionPane.YES_NO_CANCEL_OPTION, // Option type
        		JOptionPane.QUESTION_MESSAGE, // Message type
        		null, // Icon
        		commands, // List of commands
        		commands[commands.length - 1]); // Default choice 
        if (choice == commands.length - 1){
            return; //Dialog was cancelled.
        } 
        String theNumber = theBank.addAccount(customerName, customerAge, customerType, VIP, choice); 
        String message = null;
        message = "Account " + theNumber + " created for " +customerName;
        // Display confirmation message.
        JOptionPane.showMessageDialog(null, message);
        } 
    /** Method to deposit.
    pre: The bank exists and has accounts.
    post: Balance in accounts increases.
    */
    private void addAbsorptionSystem() {
        // Request the account number.
        String accountNumber = JOptionPane.showInputDialog(
                               "Enter Account Number");
        if (accountNumber == null) {
            return; // Dialog was cancelled.
        } 
        String theAmount = JOptionPane.showInputDialog("Enter Amount");
        if (theAmount == null) {
            return; // Dialog was cancelled.
        }
        double amount = Double.parseDouble(theAmount);
        // Look up the name.
        String theBalance = theBank.makeDeposit(accountNumber, amount);
        String message = null;
        if (theBalance != null) { // Name was found.
            message = "Account " + accountNumber + " new balance $" +
                      theBalance;
        } else { // Name was not found.
            message = accountNumber + " does not exist";
        }
        // Display the result.
        JOptionPane.showMessageDialog(null, message);
        } 
    /** Method to withdrawal.

    pre: The bank exists and has accounts.

    post: Balance in accounts decreases.

    */

    private void addPacking() {

        // Request the account number.

        String accountNumber = JOptionPane.showInputDialog(

                               "Enter Account Number");

        if (accountNumber == null) {

            return; // Dialog was cancelled.

        } 

        String theAmount = JOptionPane.showInputDialog("Enter Amount");

        if (theAmount == null) {

            return; // Dialog was cancelled.

        }

       

        double amount = Double.parseDouble(theAmount);

       

        // Look up the name.

        String theBalance = theBank.makeWithdrawal(accountNumber, amount);

        String message = null;

        if (theBalance != null) { // Name was found.

            message = "Account " + accountNumber + " new balance $" +

                      theBalance;

        } else { // Name was not found.

            message = accountNumber + " does not exist";

        }

        // Display the result.

        JOptionPane.showMessageDialog(null, message);

        }

   

    /** Method to deposit.

    pre: The bank exists and has accounts.

   

    */
    private void resetValues() {

        // Request the account number.

        String accountNumber = JOptionPane.showInputDialog(

                               "Enter Account Number");

        if (accountNumber == null) {

            return; // Dialog was cancelled.

        } 

        // Look up the number.
        //the methos getAccount returns a sring with the account information

        String theAccount = theBank.getAccount(accountNumber);

        String message = null;

        if (theAccount != null) { // Name was found.

            message = theAccount;

        } else { // Name was not found.

            message = accountNumber + " does not exist";

        }

        // Display the result.

        JOptionPane.showMessageDialog(null, message);

        }
    
       private void plotResult() {

        // Request the account number.

        String accountNumber = JOptionPane.showInputDialog(

                               "Enter Account Number");

        if (accountNumber == null) {

            return; // Dialog was cancelled.

        } 
       String theBalance = theBank.addInterest(accountNumber);
        String message = null;
        if (theBalance != null) { // Name was found.

            message = "Account " + accountNumber + " new balance $" +

                      theBalance;

        } else { // Name was not found.

            message = accountNumber + " does not exist";

        }

        // Display the result.

        JOptionPane.showMessageDialog(null, message);

        } 

   }



