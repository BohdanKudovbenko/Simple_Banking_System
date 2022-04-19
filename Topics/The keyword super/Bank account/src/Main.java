class BankAccount {

    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public Long getBalance() {
        return balance;
    }
}

class CheckingAccount extends BankAccount {
    protected double fee;

    CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}

class SavingsAccount extends BankAccount {
    protected double interestRate;

    SavingsAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;

    }

    public double getInterestRate() {
        return interestRate;
    }
}