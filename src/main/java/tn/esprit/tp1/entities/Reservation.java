package tn.esprit.tp1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    // Plusieurs réservations concernent un véhicule
    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicule;

    // Plusieurs réservations appartiennent à un client
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    // Une réservation correspond à un seul contrat
    @OneToOne
    @JoinColumn(name = "id_contrat")
    private Contrat contrat;
}