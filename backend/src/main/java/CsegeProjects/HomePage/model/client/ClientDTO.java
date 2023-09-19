package CsegeProjects.HomePage.model.client;

import java.util.UUID;

public record ClientDTO(UUID id, String name, String email, String password) {
}
