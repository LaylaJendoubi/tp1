package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Equipement;

public interface PaiementRepository extends JpaRepository<Equipement, Long> {
}
