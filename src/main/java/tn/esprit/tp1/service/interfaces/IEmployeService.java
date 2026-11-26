package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Employe;

import java.util.List;

public interface IEmployeService {
    List<Employe> retrieveAllEmployes();
    Employe retrieveEmploye(Long idEmploye);
    Employe addEmploye(Employe employe);
    void removeEmploye(Long idEmploye);
    Employe modifyEmploye(Employe employe);

    // Affectation desaffectation
    Employe desaffecterEmploye(Long idEmploye);
    Employe affecterEmploye(Long idEmploye, Long idAgence);
}