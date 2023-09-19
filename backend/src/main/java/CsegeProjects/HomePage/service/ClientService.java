package CsegeProjects.HomePage.service;

import CsegeProjects.HomePage.model.client.Client;
import CsegeProjects.HomePage.model.client.ClientDTO;
import CsegeProjects.HomePage.repositoryDAO.ClientRepository;
import CsegeProjects.HomePage.service.builder.ClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientBuilder clientBuilder;

    @Autowired
    public ClientService(ClientRepository clientRepository, ClientBuilder clientBuilder) {
        this.clientRepository = clientRepository;
        this.clientBuilder = clientBuilder;
    }

    public void addNewClient(ClientDTO client) {
        clientRepository.save(clientBuilder.buildClient(client));
    }

    public Client getClientById(UUID id) {
        return clientRepository.getClientById(id);
    }

    public void updateClient(ClientDTO updatedClient) {
        clientRepository.save(clientBuilder.buildClient(updatedClient));
    }
}
