package com.example.CarService.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class attendentController {

    @GetMapping("/attendent/{attendentId}")
    public String getAttendent(@PathVariable("attendentId") String attendentId, ModelMap model) {
        // Mocking attendant details (In real-world scenarios, you would fetch these from a database)
        String attendentName = "John Doe";  // Placeholder name
        String attendentSpeciality = "Engine Specialist";  // Placeholder speciality
        
        // Set parameters for displaying the attendant page using the ModelMap object
        model.addAttribute("attendentId", attendentId);
        model.addAttribute("attendentName", attendentName);
        model.addAttribute("attendentSpeciality", attendentSpeciality);
        
        // Return the name of the JSP page to render ("attendent.jsp")
        return "attendent";
    }
}
