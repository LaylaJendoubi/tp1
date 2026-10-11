package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {

}
