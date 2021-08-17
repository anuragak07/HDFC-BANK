public class HDFC_BANK {
    protected  String Name;
    protected double totalBalance;
    protected double WithdrawlAmount;

    public static void main(String[] args){
        System.out.println("Welcome to HDFC");
        Customer customer = new Customer();
        customer.Name ="Anurag Prasad";
        System.out.println(customer.Name);
        customer.totalBalance=5000;
        customer.WithdrawlAmount=2500;
        System.out.println("The Current Balance is "+ customer.totalBalance);
        System.out.println("Withdrawl Amount is " + customer.WithdrawlAmount);
        customer.withdrawAmount(customer.WithdrawlAmount);

        customer.printBalance();
    }
}
