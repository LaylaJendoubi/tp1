package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp1.entities.Agence;
import tn.esprit.tp1.entities.Employe;
import tn.esprit.tp1.repository.AgenceRepository;
import tn.esprit.tp1.repository.EmployeRepository;
import tn.esprit.tp1.service.interfaces.IEmployeService;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {
    EmployeRepository employeRepository;
    AgenceRepository agenceRepository;

    public List<Employe> retrieveAllEmployes() {
        return employeRepository.findAll();
    }
    public Employe retrieveEmploye(Long idEmploye) {
        return employeRepository.findById(idEmploye).get();
    }
    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }
    public void removeEmploye(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }
    public Employe modifyEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    // Scénario 1 : ManyToOne, Employe = côté propriétaire (porte agence_id)
    // désaffectation : on met l'attribut agence à null puis on met à jour
    @Override
    @Transactional
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = employeRepository.findById(idEmploye).get();
        employe.setAgence(null);
        return employeRepository.save(employe);
    }

    //affectation : un employé n'appartient qu'à une seule agence à la fois
    @Override
    @Transactional
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = employeRepository.findById(idEmploye).get();
        Agence agence = agenceRepository.findById(idAgence).get();
        // Règle métier : un transfert passe d'abord par une désaffectation
        if (employe.getAgence() != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    "Employe deja affecte a une agence : desaffectez-le d'abord");
        }
        // Côté propriétaire de la relation
        employe.setAgence(agence);
        return employeRepository.save(employe);
    }
}