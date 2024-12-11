package _projects2024_11.my20241105class;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount>{
    private int accountA;
    private int accountB;
    boolean isActive;

    public BankAccount(int accountA, int accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    public BankAccount(int accountA, int accountB, boolean isActive) {
        this.accountA = accountA;
        this.accountB = accountB;
        this.isActive = isActive;
    }
    //    @Override
//    public int hashCode() {
//        int result = accountA;
//        result = 31 * result + accountB;
//        result = 31 * result + Boolean.hashCode(isActive);
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountA == that.accountA && accountB == that.accountB && isActive == that.isActive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountA, accountB, isActive);
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(10, 10);
        BankAccount bankAccount2 = new BankAccount(20, 10);
        System.out.println(bankAccount1.equals(bankAccount2));
        System.out.println(bankAccount1.hashCode());
        System.out.println(bankAccount2.hashCode());
        System.out.println(bankAccount1.hashCode() == bankAccount2.hashCode());


    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountA=" + accountA +
                ", accountB=" + accountB +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int compareTo(BankAccount o) {
        int result = accountA - o.accountA;
        if (result == 0) result = accountB - o.accountB;
        if (result == 0) result = Boolean.compare(isActive, o.isActive);
        return result;
    }
}
