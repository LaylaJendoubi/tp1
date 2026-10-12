package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp1.entities.Client;
import tn.esprit.tp1.entities.Equipement;
import tn.esprit.tp1.repository.EquipementRepository;
import tn.esprit.tp1.service.interfaces.IEquipementService;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements IEquipementService {
    EquipementRepository equipementRepository;
    public List<Equipement> retrieveAllEquipements() {
        return equipementRepository.findAll();
    }
    public Equipement retrieveEquipement(Long idEquipement) {
        return equipementRepository.findById(idEquipement).get();
    }
    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
    public void removeEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }
    public Equipement modifyEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
}
