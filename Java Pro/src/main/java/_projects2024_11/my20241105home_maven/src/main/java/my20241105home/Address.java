package my20241105home;

public class Address implements Comparable<Address> {
    private int id;
    private String street;
    private int houseNumber;
    private int postCode;

    public Address(int id, String street, int houseNumber, int postCode) {
        this.id = id;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getPostCode() {
        return postCode;
    }



    @Override
    public String toString() {
        return "\nAddress{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", postCode=" + postCode +
                '}';
    }

    @Override
    public int compareTo(Address o) {
        return 0;
    }
}
