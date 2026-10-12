package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Agence;
import tn.esprit.tp1.service.interfaces.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {
    IAgenceService agenceService;
    @GetMapping("/retrieve-all-agences")
    public List<Agence>getAgences(){
        List <Agence> listAgences=agenceService.retrieveAllAgences();
        return listAgences;
    }
@GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId){
        Agence agence=agenceService.retrieveAgence(agenceId);
        return agence;
}
@PostMapping("add-Agence")
    public Agence addAgence(@RequestBody Agence agence){
        Agence agence1=agenceService.addAgence(agence);
        return agence1;
}
@DeleteMapping("/remove-agence")
    public void removeAgence(@RequestParam Long idAgence){
        agenceService.removeAgence(idAgence);
}
@PutMapping("/modify-agence")
    public void modifyAgence(@RequestBody Agence agence){
        Agence agence1=agenceService.modifyAgence(agence);
}

}
