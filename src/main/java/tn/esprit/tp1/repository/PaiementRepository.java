package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Equipement;
import tn.esprit.tp1.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
