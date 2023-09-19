package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {
    Client getClientById(UUID id);
}
