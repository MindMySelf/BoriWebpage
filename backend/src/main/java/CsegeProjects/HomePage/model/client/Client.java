package CsegeProjects.HomePage.model.client;

import CsegeProjects.HomePage.model.page.Page;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.UUID;

@Entity
public class Client {
    @Id
    private UUID id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    @OneToMany
    private List<Page> pages;
}
