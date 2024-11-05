package my20241105class;

import java.util.Objects;

public class BankAccount {
    private int accountA;
    private int accountB;
    boolean isActive;

    public BankAccount(int accountA, int accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
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
}
