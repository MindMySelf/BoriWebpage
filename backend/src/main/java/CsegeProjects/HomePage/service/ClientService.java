package CsegeProjects.HomePage.service;

import CsegeProjects.HomePage.model.client.Client;
import CsegeProjects.HomePage.repositoryDAO.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addNewClient(Client client) {
        clientRepository.save(client);
    }

    public Client getClientById(UUID id) {
        return clientRepository.getClientById(id);
    }

    public void updateClient(Client updatedClient) {
        clientRepository.save(updatedClient);
    }
}
