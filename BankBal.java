class BankBal{
    int accountNumber;
    String holderName;
    int balance;


    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Transaction Successful");
        System.out.println("----------------------");
        System.out.println("Account Holder: "+ holderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Transaction: Deposit");
        System.out.println("Amount: "+amount);
        System.out.println("Updated Balance: " + balance);
    }
    public void displayBalance(){
        System.out.println("Account Holder: "+ holderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Available Balance: " + balance);
    }
    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Transaction Successful");
            System.out.println("----------------------");
            System.out.println("Account Holder: "+ holderName);
            System.out.println("Account Number: "+ accountNumber);
            System.out.println("Transaction: Withdrawl");
            System.out.println("Amount: "+amount);
            System.out.println("Updated Balance: " + balance);
        }
    }
    public static void main(String[] args){
        BankBal cust1 = new BankBal();
        cust1.accountNumber = 123456789;
        cust1.holderName = "Anurag";
        cust1.balance = 1200;

        cust1.deposit(200); //Here customer 1 is making a deposit of 200;
        cust1.withdraw(300); //And making a withdraw of 300
        cust1.displayBalance();
    }
}