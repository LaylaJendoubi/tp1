
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Vehicule;

import java.util.List;
import java.util.Set;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehicule(Long idVehicule);
    Vehicule addVehicule(Vehicule vehicule);
    void removeVehicule(Long idVehicule);
    Vehicule modifyVehicule(Vehicule vehicule);
}
