package CsegeProjects.HomePage.model.page;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;

@Entity
@DiscriminatorValue("IMAGE")
public class ImagePageElement extends PageElement{
    @Lob
    private byte[] imageBlob;
}
