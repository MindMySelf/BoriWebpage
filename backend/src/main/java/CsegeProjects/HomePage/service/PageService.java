package CsegeProjects.HomePage.service;

import CsegeProjects.HomePage.model.page.Page;
import CsegeProjects.HomePage.repositoryDAO.PageRepository;
import CsegeProjects.HomePage.service.builder.PageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PageService {
    private final PageRepository pageRepository;
    private final PageBuilder pageBuilder;

    @Autowired
    public PageService(PageRepository pageRepository, PageBuilder pageBuilder) {
        this.pageRepository = pageRepository;
        this.pageBuilder = pageBuilder;
    }

    public List<Page> getAllPages() {
        return pageRepository.findAll();
    }
    public Page getPageByID(UUID id) {
        return pageRepository.getPageById(id);
    }
}
