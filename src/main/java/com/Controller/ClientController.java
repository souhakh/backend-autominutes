package com.Controller;

import com.entity.Client;
import com.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Client")
@CrossOrigin("*")
public class ClientController {
    @Autowired
    public ClientService clientService;

    @RequestMapping(value="/ajouterClient",method= RequestMethod.POST,headers="accept=Application/json")
    public Client save(@RequestBody Client client) {
        try {
            client=this.clientService.saveClient(client);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return client;

    }

    @RequestMapping(value="/getAllClient",method= RequestMethod.GET,headers="accept=Application/json")
    public List<Client> getAll() {
        List<Client> clients=new ArrayList<>();
        try {
            clients=this.clientService.getAllClient();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return clients;

    }

    @RequestMapping(value="/updateClient",method= RequestMethod.PUT,headers="accept=Application/json")
    public Client update(@RequestBody Client client) {
        try {
            client=this.clientService.updateClient(client);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return client;

    }

    @RequestMapping(value = "/deleteClient", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody Client client){
        return this.clientService.deleteClientByObject(client);
    }


    @RequestMapping(value = "/deleteClient/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.clientService.deleteClientById(id);
    }



    @RequestMapping(value = "/findClientById/{id}", method =RequestMethod.GET)
    public Client findById(@PathVariable("id") long id){
        return this.clientService.findClientById(id);
    }



}
