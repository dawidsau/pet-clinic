package pl.sauermann.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sauermann.petclinic.services.OwnerRepositoryService;
import pl.sauermann.petclinic.services.map.OwnerMapService;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    private final OwnerRepositoryService ownerRepositoryService;

    public OwnerController(OwnerRepositoryService ownerRepositoryService) {
        this.ownerRepositoryService = ownerRepositoryService;
    }

    @RequestMapping({"",".html", "/find"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerRepositoryService.findAll());
        return "owners/owners";
    }
}
