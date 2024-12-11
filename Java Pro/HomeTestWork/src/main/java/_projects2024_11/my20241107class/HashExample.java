package _projects2024_11.my20241107class;

import _projects2024_11.my20241105class.BankAccount;

import java.util.*;

public class HashExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A"); //O(log n)
        treeSet.add("S");
        treeSet.add("D");
        treeSet.add("K");
        treeSet.add("X");
        System.out.println(treeSet);
        Set<String> hashSetTest = new HashSet<>(16, 0.9f);
        Set<String> hashSet = new HashSet<>(16, 0.75f);

        hashSet.add("A"); // O(1)
        hashSet.add("S");
        hashSet.add("D");
        hashSet.add("K");
        hashSet.add("X");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("X")); //O(1)

        BankAccount bankAccount1 = new BankAccount(10, 10, false);
        BankAccount bankAccount2 = new BankAccount(10, 10, true);


        Set<BankAccount> bankAccountSet = new HashSet<>();  // equals() must be consistent hashcode()
                                                            // o1.equals(o2) == true ---> hash1 == hash2
        bankAccountSet.add(bankAccount1);
        bankAccountSet.add(bankAccount2);
        System.out.println(bankAccountSet);

        bankAccountSet = new TreeSet<>();   // compareTo() must be consistent with equals()
                                            // o1.compareTo(o2) == 0 <----> o1.equals(o2.) == true
        bankAccountSet.add(bankAccount1);
        bankAccountSet.add(bankAccount2);
        System.out.println(bankAccountSet);
    }
}
