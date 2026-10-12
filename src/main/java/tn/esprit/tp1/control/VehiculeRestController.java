package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Vehicule;
import tn.esprit.tp1.service.interfaces.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {
    IVehiculeService vehiculeService;

    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getVehicules() {
        List<Vehicule> listVehicules = vehiculeService.retrieveAllVehicules();
        return listVehicules;
    }

    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        Vehicule vehicule = vehiculeService.retrieveVehicule(vehiculeId);
        return vehicule;
    }

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        Vehicule vehicule1 = vehiculeService.addVehicule(vehicule);
        return vehicule1;
    }

    @DeleteMapping("/remove-vehicule")
    public void removeVehicule(@RequestParam Long idVehicule) {
        vehiculeService.removeVehicule(idVehicule);
    }

    @PutMapping("/modify-vehicule")
    public void modifyVehicule(@RequestBody Vehicule vehicule) {
        Vehicule vehicule1 = vehiculeService.modifyVehicule(vehicule);
    }
}