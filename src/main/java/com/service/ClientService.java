package com.service;

import com.Repository.ClientRepository;
import com.Repository.VoitureRepository;
import com.entity.Client;
import com.entity.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return this.clientRepository.save(client);
    }

    public Client updateClient(Client client) {
        return this.clientRepository.save(client);
    }

    public String deleteClientById(Long id) {
        this.clientRepository.deleteById(id);
        return "Client Supprimé avec succes !";
    }

    public String deleteClientByObject(Client client) {
        this.clientRepository.deleteById(client.getIdClient());
        return "Client Supprimé avec succes !";
    }

    public List<Client> getAllClient() {
        return this.clientRepository.findAll();
    }

    public Client findClientById(Long id) {
        return this.clientRepository.findById(id).orElse(null);
    }
}

