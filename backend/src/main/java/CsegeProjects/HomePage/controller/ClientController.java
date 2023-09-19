package CsegeProjects.HomePage.controller;

import CsegeProjects.HomePage.model.client.Client;
import CsegeProjects.HomePage.model.client.ClientDTO;
import CsegeProjects.HomePage.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping(value = "{id}")
    public Client getClientByID(@PathVariable("id")UUID id) {
        return clientService.getClientById(id);
    }
    @PostMapping(value = "add")
    public void createClient(@RequestBody ClientDTO clientDTO) {
        clientService.addNewClient(clientDTO);
    }
    @PutMapping(value = "put")
    public void updateClient(@RequestBody ClientDTO clientDTO) {
        clientService.updateClient(clientDTO);
    }
}
