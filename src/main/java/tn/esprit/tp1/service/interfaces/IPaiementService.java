
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Paiement;

import java.util.List;
import java.util.Set;

public interface IPaiementService {
    List<Paiement> retrieveAllPaiements();
    Paiement retrievePaiement(Long idPaiement);
    Paiement addPaiement(Paiement paiement);
    void removePaiement(Long idPaiement);
    Paiement modifyPaiement(Paiement paiement);
}
