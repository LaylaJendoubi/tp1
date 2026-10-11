package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
