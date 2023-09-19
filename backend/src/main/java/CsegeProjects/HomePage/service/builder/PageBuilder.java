package CsegeProjects.HomePage.service.builder;

import CsegeProjects.HomePage.model.page.Page;
import CsegeProjects.HomePage.model.page.PageDTO;
import CsegeProjects.HomePage.repositoryDAO.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PageBuilder {
    private final PageRepository pageRepository;

    @Autowired
    public PageBuilder(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }
    public Page pageBuilder(PageDTO pageDTO) {
        return Page.builder()
                .id(UUID.randomUUID())
                .title(pageDTO.title())
                .owner(pageDTO.owner())
                .template(pageDTO.template())
                .elements(pageDTO.elements())
                .build();
    }
}
