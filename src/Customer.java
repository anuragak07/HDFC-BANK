public class Customer extends HDFC_BANK{

    public void withdrawAmount(double amount){
        if(totalBalance>amount){
            totalBalance =totalBalance-amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }
    public void printBalance(){
        System.out.println("The Remaining Balance is "+ totalBalance);
        System.out.println("Thanking For using HDFC");

    }
}
