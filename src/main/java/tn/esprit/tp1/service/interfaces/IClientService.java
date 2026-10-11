
package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Client;

import java.util.Set;

public interface IClientService {

    Set<Client> retrieveAllClients();

    Client retrieveClient(Long id);

    Client addClient(Client client);

    Client updateClient(Client client);

    void removeClient(Long id);
}
