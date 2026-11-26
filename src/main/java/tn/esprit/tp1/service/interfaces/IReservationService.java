
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Reservation;

import java.util.List;
import java.util.Set;
import java.time.LocalDate;
public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(Long idReservation);
    Reservation addReservation(Reservation reservation);
    void removeReservation(Long idReservation);
    Reservation modifyReservation(Reservation reservation);
    List<Reservation> retrieveReservationsAfter(LocalDate date);
    List<Reservation> retrieveReservationsBefore(LocalDate date);
}
