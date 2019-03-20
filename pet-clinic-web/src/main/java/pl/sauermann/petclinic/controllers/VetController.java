package pl.sauermann.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sauermann.petclinic.services.VetRepositoryService;

@Controller
public class VetController {

    private final VetRepositoryService vetRepositoryService;

    public VetController(VetRepositoryService vetRepositoryService) {
        this.vetRepositoryService = vetRepositoryService;
    }

    @RequestMapping({"/vets", "/vets.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetRepositoryService.findAll());
        return "vets/vets";
    }
}
