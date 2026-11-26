package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Maintenance;
import tn.esprit.tp1.service.interfaces.IMaintenanceService;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {
    IMaintenanceService maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getMaintenances() {
        List<Maintenance> listMaintenances = maintenanceService.retrieveAllMaintenances();
        return listMaintenances;
    }

    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        Maintenance maintenance = maintenanceService.retrieveMaintenance(maintenanceId);
        return maintenance;
    }

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        Maintenance maintenance1 = maintenanceService.addMaintenance(maintenance);
        return maintenance1;
    }

    @DeleteMapping("/remove-maintenance")
    public void removeMaintenance(@RequestParam Long idMaintenance) {
        maintenanceService.removeMaintenance(idMaintenance);
    }

    @PutMapping("/modify-maintenance")
    public void modifyMaintenance(@RequestBody Maintenance maintenance) {
        Maintenance maintenance1 = maintenanceService.modifyMaintenance(maintenance);
    }
    @GetMapping("/between")
    public List<Maintenance> getBetween(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate debut,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fin) {
        return maintenanceService.retrieveMaintenancesBetween(debut, fin);
    }
}