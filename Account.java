import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner scan = new Scanner(System.in);
    DecimalFormat dm = new DecimalFormat("####,##");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Withdrawl Amount?");
        double amount = scan.nextDouble();

        if((checkingBalance - amount ) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + checkingBalance);
        } else {
            System.out.println("Insufficent Funds");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + savingBalance);
        System.out.println("Withdrawl Amount? ");
        double amount = scan.nextDouble();

        if((savingBalance - amount ) >= 0){
            calSavingWithdraw(amount);
            System.out.println("New Saving Balance: " + savingBalance);
        } else {
            System.out.println("Insufficent Funds");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Deposit Amount? ");
        double amount = scan.nextDouble();

        if((checkingBalance + amount) >=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Balance: " + checkingBalance);
        } else {
            System.out.println("Error Try Again");
        }
    }

    public void getSavingBalanceDepositInput(){
        System.out.println("Saving Account Balance: " + savingBalance);
        System.out.println("Deposit Amount? ");
        double amount = scan.nextDouble();

        if((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("Saving Balance: " + savingBalance);
        } else{
            System.out.println("Error Try Again");
        }
    }

}
