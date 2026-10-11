package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
