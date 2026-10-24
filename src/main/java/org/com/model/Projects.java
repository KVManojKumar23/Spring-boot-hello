package org.com.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projects {

    private String title;
    private String description;
    private List<String> techStack;
    private String link;

}
