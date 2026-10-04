package tn.esprit.tp1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    private String libelle;

    // Relation inverse du ManyToMany
    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicules;
}