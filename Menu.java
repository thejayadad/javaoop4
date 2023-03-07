import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Menu extends Account {




        Scanner scan = new Scanner(System.in);
        DecimalFormat dm = new DecimalFormat("####,##");

        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

        public void getLogin() throws IOException{
                int x = 1;

                do{
                    try {
                        data.put(4545, 9090);
                        data.put(1234, 9191);
                        System.out.println("Welcome to banks ATM");
                        System.out.println("Please enter your customer number");
                        setCustomerNumber(scan.nextInt());
                        System.out.println("Enter your Pin #");
                        setPinNumber(scan.nextInt());
                    } catch (Exception e) {
                        System.out.println("Invalid Characters");
                    }
                    int custNum = getCustomerNumber();
                    int pn = getPinNumber();
                    if(data.containsKey(custNum) && data.get(custNum) == pn){
                        getAccountType();
                    } else {
                        System.out.println("Wrong Information");
                    }
                } while(x ==2);
    }
    public void getAccountType(){
        System.out.println("Please select from the options below");
        System.out.println(" 1) Checking");
        System.out.println(" 2) Saving");
        System.out.println(" 3) Exit");

        int selection = scan.nextInt();

        switch(selection){
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank you for choosing us, have a great day");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println(" 1) - View Balance");
        System.out.println(" 2) - Withdrawl Funds");
        System.out.println(" 3) - Deposit Funds");
        System.out.println(" 4) - Exit");
        System.out.println("Choice: ");

        int selection = scan.nextInt();

        switch(selection){
            case 1:
                System.out.println("Checking Account Balance: " + getCheckingBalance());
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for choosing us, have a great day");
                break;

            default:
                System.out.println("Invalid Choice");
                getChecking();
        }
    }

    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println(" 1) - View Balance");
        System.out.println(" 2) - Withdrawl Funds");
        System.out.println(" 3) - Deposit Funds");
        System.out.println(" 4) - Exit");
        System.out.println("Choice: ");

        int selection = scan.nextInt();
        switch(selection){
            case 1:
                System.out.println("Savings Account Balance " + getSavingBalance());
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingBalanceDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for choosing us, have a great day");
                break;
            default:
                System.out.println("Invalid Choice");
                getChecking();
        }

    }

}
