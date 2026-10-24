package org.com.services;

import java.util.ArrayList;
import java.util.List;

import org.com.model.Experiences;
import org.com.model.Person;
import org.com.model.Projects;
import org.com.model.Skills;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService {

    public Person getPerson() {
        Person person = new Person();
        person.setName("K V Manoj Kumar");
        person.setDomain("Full Stack Java");
        person.setRole("Software Engineer");
        person.setBio(
                "I craft high-performance, scalable web systems and modern user experiences using Spring Boot, Java, React, and AWS.");
        person.setEmail("manojkv2399@gmail.com");
        person.setPhone("+91-8971033422");
        person.setAddress("Bengalore");
        person.setGitHub("https://github.com/KVManojKumar23");
        person.setLinkedIn("https://www.linkedin.com/in/kvmanojkumar");
        return person;
    }

    public List<Skills> getSkills() {
        List<Skills> skills = new ArrayList<>();
        skills.add(new Skills("Java", 85));
        skills.add(new Skills("Spring Boot", 85));
        skills.add(new Skills("Angular", 85));
        skills.add(new Skills("Docker & Kubernetes", 70));
        skills.add(new Skills("AWS EC2", 70));
        return skills;
    }

    public List<Projects> getProjects() {
        List<Projects> projects = new ArrayList<>();
        projects.add(new Projects("IFMS", "Inventory Management System for a manufacturing company", List.of("Java", "Spring Boot"), "https://IFMS.com/"));
        projects.add(new Projects("Navigator", "WorkFlow Management System for PCB Design", List.of("Java", "Spring Boot", "Angular", "MySQL"), "https://Navigator.com/"));
        return projects;
    }

    public List<Experiences> getExperiences() {
        List<Experiences> experiences = new ArrayList<>();
        experiences.add(new Experiences("Software Developer", "Snipe", "2023-2024", "Developed and maintained the backend of the IFMS application using Spring Boot, Java, and AWS EC2."));
        experiences.add(new Experiences("Software Engineer", "Alura", "2024-2025", "Developed and maintained the backend of the Navigator application using Spring Boot, Java, and AWS EC2."));
        return experiences;
    }   

}
