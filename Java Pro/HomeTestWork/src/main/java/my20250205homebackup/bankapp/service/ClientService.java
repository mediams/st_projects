package de.telran.bankapp.service;

import de.telran.bankapp.entity.Client;
import de.telran.bankapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getAll() {
        return repository.findAll();
    }

    public Client addClient(Client client) {
       return repository.addClient(client);
    }

    public Optional<Client> updateClient(Client client) {
        String id = client.getId();
        Optional<Client> optional = repository.findById(id);
        if (optional.isPresent()) {
            Client found = optional.get();
            found.setEmail(client.getEmail());
            found.setPhone(client.getPhone());
            found.setAddress(client.getAddress());
            found.setStatus(client.getStatus());
            found.setFirstName(client.getFirstName());
            found.setLastName(client.getLastName());
            found.setTaxCode(client.getTaxCode());
            return Optional.of(found);
        } else {
            return Optional.empty();
        }
    }
}
