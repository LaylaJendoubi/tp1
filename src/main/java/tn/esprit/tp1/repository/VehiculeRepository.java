package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.CategorieVehicule;
import tn.esprit.tp1.entities.StatutVehicule;
import tn.esprit.tp1.entities.Vehicule;

import java.math.BigDecimal;
import java.util.List;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    List<Vehicule> findByMarque(String marque);                                             // 1
    List<Vehicule> findByCategorie(CategorieVehicule categorie);                            // 2
    List<Vehicule> findByStatut(StatutVehicule statut);                                     // 3
    List<Vehicule> findByMarqueContaining(String chaine);                                   // 5
    List<Vehicule> findByModeleStartingWith(String chaine);                                 // 6
    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);                      // 8
    List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarif);                         // 9
    List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarif);                 // 10
    List<Vehicule> findByMarqueAndStatut(String marque, StatutVehicule statut);             // 11
    List<Vehicule> findByCategorieOrCategorie(CategorieVehicule c1, CategorieVehicule c2);  // 12
    List<Vehicule> findByMarqueAndTarifJournalierLessThan(String marque, BigDecimal tarif); // 13
    List<Vehicule> findByStatutOrderByTarifJournalierAsc(StatutVehicule statut);            // 17
    List<Vehicule> findAllByOrderByTarifJournalierDesc();                                   // 18
}