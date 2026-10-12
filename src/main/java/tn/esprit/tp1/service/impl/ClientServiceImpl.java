
package tn.esprit.tp1.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.tp1.entities.Agence;
import tn.esprit.tp1.entities.Client;
import tn.esprit.tp1.repository.AgenceRepository;
import tn.esprit.tp1.repository.ClientRepository;
import tn.esprit.tp1.service.interfaces.IAgenceService;
import tn.esprit.tp1.service.interfaces.IClientService;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {
        ClientRepository clientRepository;
        public List<Client> retrieveAllClients() {
            return clientRepository.findAll();
        }
        public Client retrieveClient(Long idClient) {
            return clientRepository.findById(idClient).get();
        }
        public Client addClient(Client client) {
            return clientRepository.save(client);
        }
        public void removeClient(Long idClient) {
            clientRepository.deleteById(idClient);
        }
        public Client modifyClient(Client client) {
            return clientRepository.save(client);
        }
    }
