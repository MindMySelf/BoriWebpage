package CsegeProjects.HomePage.service.builder;

import CsegeProjects.HomePage.model.page.Page;
import CsegeProjects.HomePage.repositoryDAO.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PageBuilder {
    private final PageRepository pageRepository;

    @Autowired
    public PageBuilder(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }
//    public Page pageBuilder() {
//        return Page.builder()
//    }
}
