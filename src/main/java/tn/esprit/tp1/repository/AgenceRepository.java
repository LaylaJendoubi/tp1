package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1.entities.Agence;

import java.util.List;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
    List<Agence> findByVille(String ville);              // 4
    List<Agence> findByNomEndingWith(String chaine);     // 7
}