package pl.sauermann.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sauermann.petclinic.services.map.OwnerMapService;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    private final OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping({"",".html", "/find"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerMapService.findAll());
        return "owners/owners";
    }
}
