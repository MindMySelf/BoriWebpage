package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.sheet.Sheet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SheetRepository extends JpaRepository<Sheet, UUID> {
}
