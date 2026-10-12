package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp1.entities.Client;
import tn.esprit.tp1.entities.Contrat;
import tn.esprit.tp1.repository.ClientRepository;
import tn.esprit.tp1.repository.ContratRepository;
import tn.esprit.tp1.service.interfaces.IContratService;

import java.util.List;
@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {
    ContratRepository contratRepository;
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }
    public Contrat retrieveContrat(Long idContrat) {
        return contratRepository.findById(idContrat).get();
    }
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
    public void removeContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);
    }
    public Contrat modifyContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}
