package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.tp1.entities.Agence;
import tn.esprit.tp1.entities.CategorieVehicule;
import tn.esprit.tp1.entities.Equipement;
import tn.esprit.tp1.entities.StatutVehicule;
import tn.esprit.tp1.entities.Vehicule;
import tn.esprit.tp1.repository.AgenceRepository;
import tn.esprit.tp1.repository.EquipementRepository;
import tn.esprit.tp1.repository.VehiculeRepository;
import tn.esprit.tp1.service.interfaces.IVehiculeService;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {
    VehiculeRepository vehiculeRepository;
    AgenceRepository agenceRepository;
    EquipementRepository equipementRepository;

    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeRepository.findAll();
    }
    public Vehicule retrieveVehicule(Long idVehicule) {
        return vehiculeRepository.findById(idVehicule).get();
    }
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
    public void removeVehicule(Long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
    }
    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    // =================== Atelier Keywords ===================
    @Override
    public List<Vehicule> retrieveVehiculesByMarque(String marque) {
        return vehiculeRepository.findByMarque(marque);
    }
    @Override
    public List<Vehicule> retrieveVehiculesByCategorie(CategorieVehicule categorie) {
        return vehiculeRepository.findByCategorie(categorie);
    }
    @Override
    public List<Vehicule> retrieveVehiculesDisponibles() {
        return vehiculeRepository.findByStatut(StatutVehicule.DISPONIBLE);
    }
    @Override
    public List<Vehicule> retrieveVehiculesByMarqueContaining(String chaine) {
        return vehiculeRepository.findByMarqueContaining(chaine);
    }
    @Override
    public List<Vehicule> retrieveVehiculesByModeleStartingWith(String chaine) {
        return vehiculeRepository.findByModeleStartingWith(chaine);
    }
    @Override
    public List<Vehicule> retrieveVehiculesTarifSup100() {
        return vehiculeRepository.findByTarifJournalierGreaterThan(new BigDecimal("100"));
    }
    @Override
    public List<Vehicule> retrieveVehiculesTarifInf50() {
        return vehiculeRepository.findByTarifJournalierLessThan(new BigDecimal("50"));
    }
    @Override
    public List<Vehicule> retrieveVehiculesTarifSupEgal80() {
        return vehiculeRepository.findByTarifJournalierGreaterThanEqual(new BigDecimal("80"));
    }
    @Override
    public List<Vehicule> retrieveVehiculesByMarqueDisponibles(String marque) {
        return vehiculeRepository.findByMarqueAndStatut(marque, StatutVehicule.DISPONIBLE);
    }
    @Override
    public List<Vehicule> retrieveVehiculesSuvOuBerline() {
        return vehiculeRepository.findByCategorieOrCategorie(CategorieVehicule.SUV, CategorieVehicule.BERLINE);
    }
    @Override
    public List<Vehicule> retrieveVehiculesByMarqueTarifInf100(String marque) {
        return vehiculeRepository.findByMarqueAndTarifJournalierLessThan(marque, new BigDecimal("100"));
    }
    @Override
    public List<Vehicule> retrieveDisponiblesTriesParTarifAsc() {
        return vehiculeRepository.findByStatutOrderByTarifJournalierAsc(StatutVehicule.DISPONIBLE);
    }
    @Override
    public List<Vehicule> retrieveVehiculesTriesParTarifDesc() {
        return vehiculeRepository.findAllByOrderByTarifJournalierDesc();
    }

//affectation et desaffectation
    // Scénario 2 : ManyToOne, Vehicule = côté propriétaire
    @Override
    @Transactional
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Agence agence = agenceRepository.findById(idAgence).get();
        // Côté propriétaire de la relation
        vehicule.setAgence(agence);
        return vehiculeRepository.save(vehicule);
    }

    // Scénario 3 : ManyToMany, Vehicule = parent choisi
    @Override
    @Transactional
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        // Côté parent choisi (Vehicule)
        vehicule.getEquipements().add(equipement);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        // On enlève le fils du parent
        vehicule.getEquipements().remove(equipement);
        return vehiculeRepository.save(vehicule);
    }
}