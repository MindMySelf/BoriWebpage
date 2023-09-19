package CsegeProjects.HomePage.model.page;

import CsegeProjects.HomePage.model.client.Client;
import CsegeProjects.HomePage.model.template.Template;

import java.util.List;

public record PageDTO(String title, Client owner, List<PageElement> elements, Template template) {
}
