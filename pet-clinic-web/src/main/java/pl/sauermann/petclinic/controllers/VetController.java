package pl.sauermann.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sauermann.petclinic.services.map.VetMapService;

@Controller
public class VetController {

    private final VetMapService vetMapService;

    public VetController(VetMapService vetMapService) {
        this.vetMapService = vetMapService;
    }

    @RequestMapping({"/vets", "/vets/*"})
    public String listVets(Model model){
        model.addAttribute("vets",vetMapService.findAll());
        return "vets/vets";
    }
}
