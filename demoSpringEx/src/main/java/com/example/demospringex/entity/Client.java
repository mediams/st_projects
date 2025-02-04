package com.example.demospringex.entity;

import com.example.demospringex.ClientStatus;

//@AllArgsConstructor
public class Client {

    private String id;
    private String lastName;
    private String firstName;
    private String taxCode;
    private String email;
    private String address;
    private String phone;
    private ClientStatus status;

    public Client() {
    }

    public Client(String id, String lastName, String firstName, String taxCode, String email, String address, String phone, ClientStatus status) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.taxCode = taxCode;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ClientStatus getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(ClientStatus status) {
        this.status = status;
    }
}
