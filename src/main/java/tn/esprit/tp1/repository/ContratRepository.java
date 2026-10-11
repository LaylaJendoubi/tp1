package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Contrat;

public interface ContratRepository extends JpaRepository<  Contrat, Long> {
}
