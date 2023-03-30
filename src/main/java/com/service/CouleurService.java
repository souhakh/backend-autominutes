package com.service;

import com.Repository.CouleurRepository;
import com.Repository.MarqueRepository;
import com.entity.Couleur;
import com.entity.Marque;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CouleurService {
        private CouleurRepository couleurRepository;
        public Couleur saveCouleur(Couleur couleur) {return this.couleurRepository.save(couleur);
        }
        public Couleur updateCouleur(Couleur couleur) {
            return this.couleurRepository.save(couleur);
        }

        public String deleteCouleurById(Long id) {
            this.couleurRepository.deleteById(id);
            return  "Couleur Supprimé avec succes !";
        }
        public String deleteCouleurByObject(Couleur couleur) {
            this.couleurRepository.deleteById(couleur.getId());
            return "Couleur Supprimé avec succes !";
        }
        public List<Couleur> getAllCouleur() {return this.couleurRepository.findAll();
        }
        public Couleur findCouleurById(Long id) {return this.couleurRepository.findById(id).orElse(null);
        }






}
