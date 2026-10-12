package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.tp1.entities.Agence;
import tn.esprit.tp1.repository.AgenceRepository;
import tn.esprit.tp1.service.interfaces.IAgenceService;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {
    AgenceRepository agenceRepository;
    public List<Agence> retrieveAllAgences() {
        return agenceRepository.findAll();
    }
    public Agence retrieveAgence(Long idAgence) {
        return agenceRepository.findById(idAgence).get();
}
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
}
    public void removeAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);
    }
    public Agence modifyAgence(Agence agence) {
        return agenceRepository.save(agence);
}
}
