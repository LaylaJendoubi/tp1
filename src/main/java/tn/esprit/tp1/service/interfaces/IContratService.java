
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Contrat;

import java.util.List;
import java.util.Set;

public interface IContratService {
    List<Contrat> retrieveAllContrats();
    Contrat retrieveContrat(Long idContrat);
    Contrat addContrat(Contrat contrat);
    void removeContrat(Long idContrat);
    Contrat modifyContrat(Contrat contrat);
}
