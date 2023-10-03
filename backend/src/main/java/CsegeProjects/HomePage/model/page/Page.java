package CsegeProjects.HomePage.model.page;

import CsegeProjects.HomePage.model.client.Client;
import CsegeProjects.HomePage.model.template.Template;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String title;

    @OneToOne
    private Client owner;

    @OneToMany
    private List<PageElement> elements;

    @OneToOne
    private Template template;

}
