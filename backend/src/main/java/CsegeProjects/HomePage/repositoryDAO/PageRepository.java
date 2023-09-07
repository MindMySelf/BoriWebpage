package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.page.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PageRepository extends JpaRepository<Page, UUID> {
}
