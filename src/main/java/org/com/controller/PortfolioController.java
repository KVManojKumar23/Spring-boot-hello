package org.com.controller;

import java.util.List;

import org.com.model.Experiences;
import org.com.model.Person;
import org.com.model.Projects;
import org.com.model.Skills;
import org.com.services.PortfolioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class PortfolioController {

    private final PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping ("/portfolio")
    public String portfolio(Model model) {
        Person person = portfolioService.getPerson();
        model.addAttribute("name", person.getName());
        model.addAttribute("title", person.getRole());
        model.addAttribute("bio", person.getBio());
        model.addAttribute("location", person.getAddress());
        model.addAttribute("email", person.getEmail());
        model.addAttribute("github", person.getGitHub());
        model.addAttribute("linkedin", person.getLinkedIn());

        List<Skills> skills = portfolioService.getSkills();
        model.addAttribute("skills", skills);
        List<Projects> projects = portfolioService.getProjects();
        model.addAttribute("projects", projects);
        List<Experiences> experiences = portfolioService.getExperiences();
        model.addAttribute("experiences", experiences);
        return "portfolio";
    }

}
