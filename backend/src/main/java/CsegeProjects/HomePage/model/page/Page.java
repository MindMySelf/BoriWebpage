package CsegeProjects.HomePage.model.page;

import CsegeProjects.HomePage.model.client.Client;
import CsegeProjects.HomePage.model.template.Template;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Page {
    @Id
    private UUID id;
    @Column
    private String title;
    @Column
    @OneToOne
    private Client owner;
    @Column
    @OneToMany
    private List<PageElement> elements;
    @Column
    @OneToOne
    private Template template;
}
