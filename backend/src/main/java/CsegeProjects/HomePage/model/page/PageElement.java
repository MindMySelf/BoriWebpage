package CsegeProjects.HomePage.model.page;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "element_type", discriminatorType = DiscriminatorType.STRING)
public abstract class PageElement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}
