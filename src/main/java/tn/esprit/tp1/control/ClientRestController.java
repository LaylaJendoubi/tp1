package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Client;
import tn.esprit.tp1.service.interfaces.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {
    IClientService clientService;

    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        List<Client> listClients = clientService.retrieveAllClients();
        return listClients;
    }

    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        Client client = clientService.retrieveClient(clientId);
        return client;
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        Client client1 = clientService.addClient(client);
        return client1;
    }

    @DeleteMapping("/remove-client")
    public void removeClient(@RequestParam Long idClient) {
        clientService.removeClient(idClient);
    }

    @PutMapping("/modify-client")
    public void modifyClient(@RequestBody Client client) {
        Client client1 = clientService.modifyClient(client);
    }
}