package CsegeProjects.HomePage.model.sheet;

import jakarta.persistence.*;

@Entity
@Table(name = "sheet-elements")
public class SheetElement {
    @Id
    private Long id;
    @Column
    private String elementType;
    @Column
    private String content;
    @ManyToOne
    private Sheet sheet;
}
