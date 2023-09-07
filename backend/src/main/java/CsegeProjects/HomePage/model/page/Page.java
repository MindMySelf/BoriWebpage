package CsegeProjects.HomePage.model.page;

import CsegeProjects.HomePage.model.client.Owner;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Page {
    @Id
    private UUID id;
    @Column
    private String title;
    @Column
    private Owner owner;
}
