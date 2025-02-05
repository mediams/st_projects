package de.telran.bankapp.repository;

import de.telran.bankapp.entity.Client;
import de.telran.bankapp.entity.enums.ClientStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ClientRepository {

    List<Client> clients = new ArrayList<>();

    public ClientRepository() {
        // Добавление 10 клиентов через конструктор
        clients.add(new Client(UUID.randomUUID().toString(), "Schmidt", "Hans", "DE123456789", "h.schmidt@example.com", "Berlin, Germany", "+49 30 1234567", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Müller", "Anna", "DE987654321", "a.mueller@example.com", "Munich, Germany", "+49 89 7654321", ClientStatus.INACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Klein", "Peter", "DE567890123", "p.klein@example.com", "Hamburg, Germany", "+49 40 6789012", ClientStatus.BLOCKED));
        clients.add(new Client(UUID.randomUUID().toString(), "Schneider", "Maria", "DE456789012", "m.schneider@example.com", "Frankfurt, Germany", "+49 69 1234567", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Fischer", "Lukas", "DE234567890", "l.fischer@example.com", "Stuttgart, Germany", "+49 711 9876543", ClientStatus.INACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Weber", "Sophie", "DE890123456", "s.weber@example.com", "Cologne, Germany", "+49 221 4567890", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Meyer", "Max", "DE345678901", "m.meyer@example.com", "Düsseldorf, Germany", "+49 211 2345678", ClientStatus.BLOCKED));
        clients.add(new Client(UUID.randomUUID().toString(), "Wagner", "Julia", "DE678901234", "j.wagner@example.com", "Dresden, Germany", "+49 351 8765432", ClientStatus.ACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Becker", "Anna", "DE789012345", "p.becker@example.com", "Leipzig, Germany", "+49 341 7654321", ClientStatus.INACTIVE));
        clients.add(new Client(UUID.randomUUID().toString(), "Hoffmann", "Clara", "DE012345678", "c.hoffmann@example.com", "Bremen, Germany", "+49 421 1234567", ClientStatus.ACTIVE));
    }

    public List<Client> findAll() {
        return clients;
    }

    public Optional<Client> findById(String id) {
        return clients.stream().filter(client -> client.getId().equals(id)).findAny();
    }

    public Client addClient(Client client) {
        client.setId(UUID.randomUUID().toString());
        clients.add(client);
        return client;
    }
}
