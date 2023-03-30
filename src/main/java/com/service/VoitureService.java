package com.service;

import com.Repository.TypeVoitureRepository;
import com.Repository.VoitureRepository;
import com.entity.TypeVoiture;
import com.entity.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoitureService {
    private VoitureRepository voitureRepository;

    public Voiture saveVoiture(Voiture voiture) {
        return this.voitureRepository.save(voiture);
    }

    public Voiture updateVoiture(Voiture voiture) {
        return this.voitureRepository.save(voiture);
    }

    public String deleteVoitureById(Long id) {
        this.voitureRepository.deleteById(id);
        return "Voiture Supprimé avec succes !";
    }

    public String deleteVoitureByObject(Voiture voiture) {
        this.voitureRepository.deleteById(voiture.getIdVoiture());
        return "Voiture Supprimé avec succes !";
    }

    public List<Voiture> getAllVoiture() {
        return this.voitureRepository.findAll();
    }

    public Voiture findVoitureById(Long id) {
        return this.voitureRepository.findById(id).orElse(null);
    }
}
