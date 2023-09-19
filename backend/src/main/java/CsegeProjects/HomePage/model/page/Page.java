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

    public UUID getId() {
        return id;
    }

    public Client getOwner() {
        return owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PageElement> getElements() {
        return elements;
    }

    public void setElements(List<PageElement> elements) {
        this.elements = elements;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }
}
