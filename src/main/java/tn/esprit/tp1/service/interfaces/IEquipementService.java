
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Equipement;

import java.util.List;
import java.util.Set;

public interface IEquipementService {
    List<Equipement> retrieveAllEquipements();
    Equipement retrieveEquipement(Long idEquipement);
    Equipement addEquipement(Equipement equipement);
    void removeEquipement(Long idEquipement);
    Equipement modifyEquipement(Equipement equipement);
}
