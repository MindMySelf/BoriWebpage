package CsegeProjects.HomePage.controller;

import CsegeProjects.HomePage.model.client.LoginID;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping
    public void logInClient(@RequestBody LoginID loginID) {}
}
