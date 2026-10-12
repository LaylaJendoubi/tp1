package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Reservation;
import tn.esprit.tp1.service.interfaces.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.retrieveAllReservations();
        return listReservations;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        Reservation reservation = reservationService.retrieveReservation(reservationId);
        return reservation;
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        Reservation reservation1 = reservationService.addReservation(reservation);
        return reservation1;
    }

    @DeleteMapping("/remove-reservation")
    public void removeReservation(@RequestParam Long idReservation) {
        reservationService.removeReservation(idReservation);
    }

    @PutMapping("/modify-reservation")
    public void modifyReservation(@RequestBody Reservation reservation) {
        Reservation reservation1 = reservationService.modifyReservation(reservation);
    }
}