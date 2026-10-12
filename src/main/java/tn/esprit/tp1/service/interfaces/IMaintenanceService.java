
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Maintenance;

import java.util.List;
import java.util.Set;

public interface IMaintenanceService {
    List<Maintenance> retrieveAllMaintenances();
    Maintenance retrieveMaintenance(Long idMaintenance);
    Maintenance addMaintenance(Maintenance maintenance);
    void removeMaintenance(Long idMaintenance);
    Maintenance modifyMaintenance(Maintenance maintenance);
}
