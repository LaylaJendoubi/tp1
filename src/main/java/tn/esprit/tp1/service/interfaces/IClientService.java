
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Client;

import java.util.List;
import java.util.Set;

public interface IClientService {
    List<Client> retrieveAllClients();
    Client retrieveClient(Long idClient);
    Client addClient(Client client);
    void removeClient(Long idClient);
    Client modifyClient(Client client);
}
