package my20250113homework.hometask;

public class AccountManager {

    private BankAccount bankAccount;

    public AccountManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public synchronized void moveMoneyAToB(int amount) {
        bankAccount.setAccountA(bankAccount.getAccountA() - amount);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bankAccount.setAccountB(bankAccount.getAccountB() + amount);
    }

    public synchronized BankAccount getBankAccount() {
            return bankAccount;
    }
}
