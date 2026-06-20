package PackagesAndAM.account;

class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void depositMoney(double money) {
        if(money <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance += money;
            System.out.println("Deposit successful. Current balance: " + balance);
        }
    }

    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (balance >= money) {
            balance -= money;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            money = balance;
            balance = 0;
            System.out.println("Insufficient balance. Withdrawing remaining balance: " + money);
        }
        return money;
    }
}
