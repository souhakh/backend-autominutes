package com.Controller;


import com.entity.Couleur;
import com.service.CouleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Couleur")
@CrossOrigin("*")
public class CouleurController {

    @Autowired
    public CouleurService couleurService;

    @RequestMapping(value="/ajouterCouleur",method= RequestMethod.POST,headers="accept=Application/json")
    public Couleur save(@RequestBody Couleur couleur) {
        try {
            couleur=this.couleurService.saveCouleur(couleur);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return couleur;

    }

    @RequestMapping(value="/getAllCouleur",method= RequestMethod.GET,headers="accept=Application/json")
    public List<Couleur> getAll() {
        List<Couleur> couleurs=new ArrayList<>();
        try {
            couleurs=this.couleurService.getAllCouleur();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return couleurs;

    }

    @RequestMapping(value="/updateCouleur",method= RequestMethod.PUT,headers="accept=Application/json")
    public Couleur update(@RequestBody Couleur couleur) {
        try {
           couleur=this.couleurService.updateCouleur(couleur);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return couleur;

    }

    @RequestMapping(value = "/deleteCouleur", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody Couleur couleur){
        return this.couleurService.deleteCouleurByObject(couleur);
    }


    @RequestMapping(value = "/deleteCouleur/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.couleurService.deleteCouleurById(id);
    }



    @RequestMapping(value = "/findCouleurById/{id}", method =RequestMethod.GET)
    public Couleur findById(@PathVariable("id") long id){
        return this.couleurService.findCouleurById(id);
    }


}


