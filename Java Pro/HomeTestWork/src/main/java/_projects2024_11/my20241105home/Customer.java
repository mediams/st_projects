package _projects2024_11.my20241105home;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;
    private int bonusAmount;
    private boolean isEmailConfirmed;

    public Customer(String name, String email, int bonusAmount, boolean isEmailConfirmed) {
        this.name = name;
        this.email = email;
        this.bonusAmount = bonusAmount;
        this.isEmailConfirmed = isEmailConfirmed;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bonusAmount=" + bonusAmount +
                ", isEmailConfirmed=" + isEmailConfirmed +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return bonusAmount == customer.bonusAmount &&
                isEmailConfirmed == customer.isEmailConfirmed &&
                Objects.equals(name, customer.name) &&
                Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, bonusAmount, isEmailConfirmed);
    }

    public static void main(String[] args) {
        Set<Customer> customerSet = new TreeSet<>();
        customerSet.add(new Customer("Name 01", "e@ya.com", 2, true));
        customerSet.add(new Customer("Name 02", "e@ya.com", 2, true));
        customerSet.add(new Customer("Name 03", "e@ya.com", 2, true));
        customerSet.add(new Customer("Name 04", "e@ya.com", 2, true));

        System.out.println(customerSet);

        Set<Customer> customerSet2 = new HashSet<>();
        customerSet2.add(new Customer("Name 11", "e@ya.com", 2, true));
        customerSet2.add(new Customer("Name 12", "e@ya.com", 2, true));
        customerSet2.add(new Customer("Name 13", "e@ya.com", 2, true));
        customerSet2.add(new Customer("Name 14", "e@ya.com", 2, true));

        System.out.println(customerSet2);
    }
}
