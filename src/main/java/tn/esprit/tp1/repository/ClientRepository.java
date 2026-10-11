package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
