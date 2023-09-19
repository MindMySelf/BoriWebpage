package CsegeProjects.HomePage.model.page;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class PageElement {
    @Id
    private UUID id;
}
