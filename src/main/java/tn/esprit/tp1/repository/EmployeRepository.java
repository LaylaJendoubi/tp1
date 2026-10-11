package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Employe;

public interface EmployeRepository extends JpaRepository <Employe, Long> {
}
