package CsegeProjects.HomePage.model.page;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("STRING")
public class TextPageElement extends PageElement{
    private String context;
}
