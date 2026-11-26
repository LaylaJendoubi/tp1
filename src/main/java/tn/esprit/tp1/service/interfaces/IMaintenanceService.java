package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Maintenance;

import java.time.LocalDate;
import java.util.List;

public interface IMaintenanceService {
    List<Maintenance> retrieveAllMaintenances();
    Maintenance retrieveMaintenance(Long idMaintenance);
    Maintenance addMaintenance(Maintenance maintenance);
    void removeMaintenance(Long idMaintenance);
    Maintenance modifyMaintenance(Maintenance maintenance);

    //Keywords (scénario 16)
    List<Maintenance> retrieveMaintenancesBetween(LocalDate debut, LocalDate fin);
}