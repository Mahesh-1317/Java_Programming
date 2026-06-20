package PackagesAndAM.account;

class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Peter Parker");

        account.depositMoney(1000);
        System.out.println("Withdrawn amount: " + account.withdrawMoney(500));
        account.depositMoney(-44);
        account.withdrawMoney(-100);
        account.withdrawMoney(0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
    }
}
