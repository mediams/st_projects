package de.telran.bankapp.controller;

import de.telran.bankapp.entity.Client;
import de.telran.bankapp.entity.enums.ClientStatus;
import de.telran.bankapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping(("/client"))
public class ClientController {

    private ClientService service;

    @Autowired
    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }

//    @GetMapping("{uuid}")
//    public Optional<Client> getClientById(@PathVariable String uuid) {
//        return clients.stream().filter(client -> client.getId().equals(uuid)).findAny();
//    }
//
//    @GetMapping("/search")
//    public List<Client> findByName(@RequestParam String name) {
//        return clients.stream().filter(client -> client.getFirstName().equals(name)).toList();
//    }

    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        Client created = service.addClient(client);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        Optional<Client> updated = service.updateClient(client);
        if (updated.isPresent()) {
            return new ResponseEntity<>(updated.get(), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @PatchMapping
//    public ResponseEntity<Client> changeStatus(@RequestParam String id, @RequestParam(required = false) String status){
//        Optional<Client> optional = clients.stream().filter(c -> c.getId().equals(id)).findAny();
//        if (optional.isPresent()) {
//            Client client = optional.get();
//            ClientStatus clientStatus = status == null ? ClientStatus.ACTIVE : ClientStatus.valueOf(status);
//            client.setStatus(clientStatus);
//            return new ResponseEntity<>(client, HttpStatus.ACCEPTED);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteClient(@PathVariable String id) {
//        clients.removeIf(client -> client.getId().equals(id));
//        return ResponseEntity.accepted().build();
//    }


}
