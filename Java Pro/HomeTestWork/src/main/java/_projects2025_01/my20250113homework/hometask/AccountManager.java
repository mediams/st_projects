package _projects2025_01.my20250113homework.hometask;

public class AccountManager {
    private Object lockMinus = new Object();
    private Object lockPlus = new Object();
    private BankAccount bankAccount;

    public AccountManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public synchronized void moveMoneyAToB(int amount) {
        synchronized (lockMinus) {
            bankAccount.setAccountA(bankAccount.getAccountA() - amount);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockPlus) {
                bankAccount.setAccountB(bankAccount.getAccountB() + amount);
            }
        }

//        synchronized (lockPlus) {
//            bankAccount.setAccountB(bankAccount.getAccountB() + amount);
//        }
    }

    public synchronized BankAccount getBankAccount() {
        return bankAccount;
    }
}
