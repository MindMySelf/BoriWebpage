package CsegeProjects.HomePage.model.client;

import CsegeProjects.HomePage.model.page.Page;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Client {
    @Id
    private UUID id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column
    @OneToMany
    private List<Page> pages;
}
