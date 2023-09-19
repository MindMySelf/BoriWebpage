package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.template.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface TemplateRepository extends JpaRepository<Template, UUID> {
}
