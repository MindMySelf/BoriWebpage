package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.page.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PageRepository extends JpaRepository<Page, UUID> {
    Page getPageById(UUID id);
}
