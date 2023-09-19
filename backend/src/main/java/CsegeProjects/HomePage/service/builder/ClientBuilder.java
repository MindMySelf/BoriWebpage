package CsegeProjects.HomePage.service.builder;

import CsegeProjects.HomePage.model.client.Client;
import CsegeProjects.HomePage.model.client.ClientDTO;
import CsegeProjects.HomePage.model.client.Role;
import CsegeProjects.HomePage.repositoryDAO.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ClientBuilder {
    private final ClientRepository clientRepository;
    @Autowired
    public ClientBuilder(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public Client buildClient(ClientDTO clientDTO) {
        return Client.builder()
                .id(UUID.randomUUID())
                .email(clientDTO.email())
                .name(clientDTO.name())
                .password(clientDTO.password())
                .role(Role.USER)
                .build();
    }
}
