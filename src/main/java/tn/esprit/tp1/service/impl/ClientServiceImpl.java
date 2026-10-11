
package tn.esprit.tp1.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.tp1.entities.Client;
import tn.esprit.tp1.repository.ClientRepository;
import tn.esprit.tp1.service.interfaces.IClientService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public Set<Client> retrieveAllClients() {
        return clientRepository.findAll()
                .stream()
                .collect(Collectors.toSet());
    }

    @Override
    @Transactional(readOnly = true)
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Client introuvable : " + id));
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        if (client.getIdClient() == null ||
                !clientRepository.existsById(client.getIdClient())) {
            throw new RuntimeException("Client introuvable");
        }

        return clientRepository.save(client);
    }

    @Override
    public void removeClient(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new RuntimeException("Client introuvable : " + id);
        }

        clientRepository.deleteById(id);
    }
}
