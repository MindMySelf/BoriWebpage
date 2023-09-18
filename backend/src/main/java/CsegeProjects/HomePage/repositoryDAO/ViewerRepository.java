package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.client.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ViewerRepository extends JpaRepository<Viewer, UUID> {
}
