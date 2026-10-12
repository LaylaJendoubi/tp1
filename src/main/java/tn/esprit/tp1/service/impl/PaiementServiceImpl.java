package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import tn.esprit.tp1.entities.Paiement;
import tn.esprit.tp1.repository.PaiementRepository;
import tn.esprit.tp1.service.interfaces.IPaiementService;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements IPaiementService {
    PaiementRepository paiementRepository;
    public List<Paiement> retrieveAllPaiements() {
        return paiementRepository.findAll();
    }
    public Paiement retrievePaiement(Long idPaiement) {
        return paiementRepository.findById(idPaiement).get();
    }
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
    public void removePaiement(Long idPaiement) {
        paiementRepository.deleteById(idPaiement);
    }
    public Paiement modifyPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
}
