package CsegeProjects.HomePage.repositoryDAO;

import CsegeProjects.HomePage.model.client.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ViewerRepository extends JpaRepository<Viewer, UUID> {
}
