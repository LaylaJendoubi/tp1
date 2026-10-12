package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Equipement;
import tn.esprit.tp1.service.interfaces.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {
    IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        List<Equipement> listEquipements = equipementService.retrieveAllEquipements();
        return listEquipements;
    }

    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        Equipement equipement = equipementService.retrieveEquipement(equipementId);
        return equipement;
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        Equipement equipement1 = equipementService.addEquipement(equipement);
        return equipement1;
    }

    @DeleteMapping("/remove-equipement")
    public void removeEquipement(@RequestParam Long idEquipement) {
        equipementService.removeEquipement(idEquipement);
    }

    @PutMapping("/modify-equipement")
    public void modifyEquipement(@RequestBody Equipement equipement) {
        Equipement equipement1 = equipementService.modifyEquipement(equipement);
    }
}