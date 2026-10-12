package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp1.entities.Maintenance;
import tn.esprit.tp1.entities.Vehicule;
import tn.esprit.tp1.repository.MaintenanceRepository;
import tn.esprit.tp1.repository.VehiculeRepository;
import tn.esprit.tp1.service.interfaces.IVehiculeService;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {
    VehiculeRepository vehiculeRepository;
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeRepository.findAll();
    }
    public Vehicule retrieveVehicule(Long idVehicule) {
        return vehiculeRepository.findById(idVehicule).get();
    }
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
    public void removeVehicule(Long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
    }
    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}

