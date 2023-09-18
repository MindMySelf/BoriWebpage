package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.sheet.Sheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface SheetRepository extends JpaRepository<Sheet, UUID> {
}
