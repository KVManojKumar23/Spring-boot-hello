package org.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class Experiences {

    private String role;
    private String company;
    private String period;
    private String summary;

}
