package CsegeProjects.HomePage.model.sheet;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "sheets")
public class Sheet {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @OneToMany
    private List<SheetElement> elements;

}
