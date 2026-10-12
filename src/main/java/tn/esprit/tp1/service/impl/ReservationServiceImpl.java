package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp1.entities.Maintenance;
import tn.esprit.tp1.entities.Reservation;
import tn.esprit.tp1.repository.MaintenanceRepository;
import tn.esprit.tp1.repository.ReservationRepository;
import tn.esprit.tp1.service.interfaces.IReservationService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    ReservationRepository reservationRepository;
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
