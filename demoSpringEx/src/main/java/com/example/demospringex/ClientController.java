package com.example.demospringex;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/client")
public class ClientController {

    List<Client> clients = new ArrayList<>();

    public ClientController() {
        clients.add(new Client(UUID.randomUUID().toString(), "Schmidt", "Hans", "DE123456789", "h.schmidt@example.com", "Musterstraße 1, Berlin", "+49 171 2345678", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Müller", "Anna", "DE987654321", "a.mueller@example.com", "Hauptstraße 23, Hamburg", "+49 172 9876543", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Klein", "Peter", "DE567890123", "p.klein@example.com", "Bahnhofstraße 45, München", "+49 173 5678901", ClientStatus.INACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Schneider", "Maria", "DE456789012", "m.schneider@example.com", "Gartenweg 5, Köln", "+49 174 4567890", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Fischer", "Lukas", "DE234567890", "l.fischer@example.com", "Ringstraße 10, Frankfurt", "+49 175 2345678", ClientStatus.BLOCKED));
        clients.add(new Client(UUID.randomUUID().toString(), "Weber", "Sophie", "DE890123456", "s.weber@example.com", "Marktplatz 3, Stuttgart", "+49 176 8901234", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Meyer", "Max", "DE345678901", "m.meyer@example.com", "Dorfstraße 7, Dresden", "+49 177 3456789", ClientStatus.INACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Wagner", "Julia", "DE678901234", "j.wagner@example.com", "Schulstraße 8, Nürnberg", "+49 178 6789012", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Becker", "Paul", "DE789012345", "p.becker@example.com", "Bergstraße 15, Leipzig", "+49 179 7890123", ClientStatus.BLOCKED));
        clients.add(new Client(UUID.randomUUID().toString(), "Hoffmann", "Clara", "DE012345678", "c.hoffmann@example.com", "Seestraße 11, Bremen", "+49 170 0123456", ClientStatus.ACTIVE));
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return clients;
    }

    @GetMapping("{id}")
    public Client getClientById(@PathVariable String id) {
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    @GetMapping("/search")
    public List<Client> findByName(@RequestParam String name) {
        List<Client> newClients = new ArrayList<>();
        for (Client client : clients) {
            if (client.getFirstName().equals(name)) {
                newClients.add(client);
            }
        }
        return newClients;
    }

    @GetMapping("/search/by-lastname/{lastName}")
    public ResponseEntity<Client> findByLastName(@PathVariable String lastName) {
        return clients.stream()
                .filter(client -> client.getLastName().equals(lastName))
                .findFirst()
                .map(ResponseEntity::ok) // Если найден, возвращаем 200 OK с клиентом
                .orElseGet(() -> ResponseEntity.notFound().build()); // Если нет, 404
    }

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client) {
        client.setId(UUID.randomUUID().toString());
        clients.add(client);
        return client;
    }

    @PutMapping("/update")
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        String id = client.getId();
        Optional<Client> clientOptional = clients.stream().filter(c -> id.equals(c.getId())).findAny();
        if (clientOptional.isPresent()) {
            Client foundClient = clientOptional.get();
            foundClient.setFirstName(client.getFirstName());
            foundClient.setLastName(client.getLastName());
            foundClient.setEmail(client.getEmail());
            foundClient.setPhone(client.getPhone());
            foundClient.setAddress(client.getAddress());
            foundClient.setTaxCode(client.getTaxCode());
            foundClient.setStatus(client.getStatus());

//            return new ResponseEntity<>(foundClient, HttpStatusCode.valueOf(202));
            return new ResponseEntity<>(foundClient, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PatchMapping
    public ResponseEntity<Client> patchClient(@RequestParam String id, @RequestParam(required = false) String status) {
        Optional<Client> clientOptional = clients.stream().filter(c -> id.equals(c.getId())).findAny();
        if (clientOptional.isPresent()) {
            Client foundClient = clientOptional.get();
            ClientStatus clientStatus = status == null ? ClientStatus.ACTIVE : ClientStatus.valueOf(status);
//            foundClient.setStatus(ClientStatus.valueOf(status));
            return new ResponseEntity<>(foundClient, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@RequestParam String id) {
        clients.removeIf(c -> id.equals(c.getId()));
        return ResponseEntity.accepted().build();
    }
}
