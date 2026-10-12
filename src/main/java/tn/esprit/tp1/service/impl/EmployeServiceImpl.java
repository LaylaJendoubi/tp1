package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp1.entities.Client;
import tn.esprit.tp1.entities.Employe;
import tn.esprit.tp1.repository.ClientRepository;
import tn.esprit.tp1.repository.EmployeRepository;
import tn.esprit.tp1.service.interfaces.IEmployeService;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {
    EmployeRepository employeRepository;
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
}
