class BankAccount {
    String AccountHolderName;
    int AccountBalance;

    void Bank_Details()
    {
        System.out.println("Bank holder name is " + AccountHolderName + " has balance of " + AccountBalance);
    }
}
class BankAccountMain {
    public static void main(String[] args){
        BankAccount obj = new BankAccount();
        obj.AccountHolderName = "Sudheer";
        obj.AccountBalance = 50000;
        obj.Bank_Details();
    }
}
