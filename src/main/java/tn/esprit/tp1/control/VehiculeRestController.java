package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.CategorieVehicule;
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
        return vehiculeService.retrieveAllVehicules();
    }

    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        return vehiculeService.retrieveVehicule(vehiculeId);
    }

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @DeleteMapping("/remove-vehicule")
    public void removeVehicule(@RequestParam Long idVehicule) {
        vehiculeService.removeVehicule(idVehicule);
    }

    @PutMapping("/modify-vehicule")
    public void modifyVehicule(@RequestBody Vehicule vehicule) {
        vehiculeService.modifyVehicule(vehicule);
    }

    //Keywords
    @GetMapping("/by-marque")
    public List<Vehicule> getByMarque(@RequestParam String marque) {
        return vehiculeService.retrieveVehiculesByMarque(marque);
    }
    @GetMapping("/by-categorie")
    public List<Vehicule> getByCategorie(@RequestParam CategorieVehicule categorie) {
        return vehiculeService.retrieveVehiculesByCategorie(categorie);
    }
    @GetMapping("/disponibles")
    public List<Vehicule> getDisponibles() {
        return vehiculeService.retrieveVehiculesDisponibles();
    }
    @GetMapping("/marque-contient")
    public List<Vehicule> getMarqueContient(@RequestParam String chaine) {
        return vehiculeService.retrieveVehiculesByMarqueContaining(chaine);
    }
    @GetMapping("/modele-commence")
    public List<Vehicule> getModeleCommence(@RequestParam String chaine) {
        return vehiculeService.retrieveVehiculesByModeleStartingWith(chaine);
    }
    @GetMapping("/tarif-sup-100")
    public List<Vehicule> getTarifSup100() {
        return vehiculeService.retrieveVehiculesTarifSup100();
    }
    @GetMapping("/tarif-inf-50")
    public List<Vehicule> getTarifInf50() {
        return vehiculeService.retrieveVehiculesTarifInf50();
    }
    @GetMapping("/tarif-sup-egal-80")
    public List<Vehicule> getTarifSupEgal80() {
        return vehiculeService.retrieveVehiculesTarifSupEgal80();
    }
    @GetMapping("/by-marque-disponibles")
    public List<Vehicule> getByMarqueDisponibles(@RequestParam String marque) {
        return vehiculeService.retrieveVehiculesByMarqueDisponibles(marque);
    }
    @GetMapping("/suv-ou-berline")
    public List<Vehicule> getSuvOuBerline() {
        return vehiculeService.retrieveVehiculesSuvOuBerline();
    }
    @GetMapping("/by-marque-tarif-inf-100")
    public List<Vehicule> getByMarqueTarifInf100(@RequestParam String marque) {
        return vehiculeService.retrieveVehiculesByMarqueTarifInf100(marque);
    }
    @GetMapping("/disponibles-tri-asc")
    public List<Vehicule> getDisponiblesTriAsc() {
        return vehiculeService.retrieveDisponiblesTriesParTarifAsc();
    }
    @GetMapping("/tri-desc")
    public List<Vehicule> getTriDesc() {
        return vehiculeService.retrieveVehiculesTriesParTarifDesc();
    }

    //affectation et desafectation
    @PutMapping("/affecterVehicule/{idVehicule}/{idAgence}")
    public Vehicule affecterVehicule(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        return vehiculeService.affecterVehicule(idVehicule, idAgence);
    }
    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }
    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }
}