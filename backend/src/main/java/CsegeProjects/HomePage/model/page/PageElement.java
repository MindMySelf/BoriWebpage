package CsegeProjects.HomePage.model.page;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public abstract class PageElement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}
