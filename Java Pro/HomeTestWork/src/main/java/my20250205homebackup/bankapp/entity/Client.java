package de.telran.bankapp.entity;

import de.telran.bankapp.entity.enums.ClientStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Client {

    private String id;
    private String lastName;
    private String firstName;
    private String taxCode;
    private String email;
    private String address;
    private String phone;
    private ClientStatus status;

}
