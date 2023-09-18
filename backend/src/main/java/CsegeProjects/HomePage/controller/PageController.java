package CsegeProjects.HomePage.controller;

import CsegeProjects.HomePage.model.page.Page;
import CsegeProjects.HomePage.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pages")
public class PageController {
    private final PageService pageService;

    @Autowired
    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping(value = "all")
    public List<Page>getAllPages() {
        return pageService.getAllPages();
    }
    @GetMapping(value = "{id}")
    public Page getPageByID(@PathVariable("id") UUID id) {
        return pageService.getPageByID(id);
    }
}
