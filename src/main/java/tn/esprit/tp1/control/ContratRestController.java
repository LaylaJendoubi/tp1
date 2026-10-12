package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Contrat;
import tn.esprit.tp1.service.interfaces.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {
    IContratService contratService;

    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats() {
        List<Contrat> listContrats = contratService.retrieveAllContrats();
        return listContrats;
    }

    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        Contrat contrat = contratService.retrieveContrat(contratId);
        return contrat;
    }

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        Contrat contrat1 = contratService.addContrat(contrat);
        return contrat1;
    }

    @DeleteMapping("/remove-contrat")
    public void removeContrat(@RequestParam Long idContrat) {
        contratService.removeContrat(idContrat);
    }

    @PutMapping("/modify-contrat")
    public void modifyContrat(@RequestBody Contrat contrat) {
        Contrat contrat1 = contratService.modifyContrat(contrat);
    }
}