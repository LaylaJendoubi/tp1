package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.CategorieVehicule;
import tn.esprit.tp1.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehicule(Long idVehicule);
    Vehicule addVehicule(Vehicule vehicule);
    void removeVehicule(Long idVehicule);
    Vehicule modifyVehicule(Vehicule vehicule);

    // Atelier Keywords
    List<Vehicule> retrieveVehiculesByMarque(String marque);
    List<Vehicule> retrieveVehiculesByCategorie(CategorieVehicule categorie);
    List<Vehicule> retrieveVehiculesDisponibles();
    List<Vehicule> retrieveVehiculesByMarqueContaining(String chaine);
    List<Vehicule> retrieveVehiculesByModeleStartingWith(String chaine);
    List<Vehicule> retrieveVehiculesTarifSup100();
    List<Vehicule> retrieveVehiculesTarifInf50();
    List<Vehicule> retrieveVehiculesTarifSupEgal80();
    List<Vehicule> retrieveVehiculesByMarqueDisponibles(String marque);
    List<Vehicule> retrieveVehiculesSuvOuBerline();
    List<Vehicule> retrieveVehiculesByMarqueTarifInf100(String marque);
    List<Vehicule> retrieveDisponiblesTriesParTarifAsc();
    List<Vehicule> retrieveVehiculesTriesParTarifDesc();

    // Affectation Désaffectation
    Vehicule affecterVehicule(Long idVehicule, Long idAgence);
    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);
}