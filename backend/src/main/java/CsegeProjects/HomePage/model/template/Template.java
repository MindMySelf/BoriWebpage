package CsegeProjects.HomePage.model.template;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "templates")
public class Template {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String css;
    @Column(nullable = false)
    private String html;

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCss() {
        return css;
    }

    public String getHtml() {
        return html;
    }
}
