package tn.esprit.tp1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    // Une agence possède plusieurs employés
    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;
    // Une agence possède plusieurs véhicules
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}