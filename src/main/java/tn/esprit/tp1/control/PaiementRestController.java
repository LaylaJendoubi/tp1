package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Paiement;
import tn.esprit.tp1.service.interfaces.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {
    IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        List<Paiement> listPaiements = paiementService.retrieveAllPaiements();
        return listPaiements;
    }

    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        Paiement paiement = paiementService.retrievePaiement(paiementId);
        return paiement;
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        Paiement paiement1 = paiementService.addPaiement(paiement);
        return paiement1;
    }

    @DeleteMapping("/remove-paiement")
    public void removePaiement(@RequestParam Long idPaiement) {
        paiementService.removePaiement(idPaiement);
    }

    @PutMapping("/modify-paiement")
    public void modifyPaiement(@RequestBody Paiement paiement) {
        Paiement paiement1 = paiementService.modifyPaiement(paiement);
    }
}