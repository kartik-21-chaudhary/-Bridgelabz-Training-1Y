class BankAccount {
    String name;
    int accNo;
    double balance;
    BankAccount(String n, int a, double b) {
        name = n;
        accNo = a;
        balance = b;
    }
    void deposit(double amt) {
        balance += amt;
    }
    void withdraw(double amt) {
        if(balance >= amt)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }
    void show() {
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Aman",1234,10000);
        b.deposit(2000);
        b.withdraw(3000);
        b.show();
    }
}