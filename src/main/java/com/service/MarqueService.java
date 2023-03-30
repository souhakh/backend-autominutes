package com.service;
import com.Repository.MarqueRepository;
import com.entity.Marque;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarqueService  {
    private MarqueRepository marqueRepository;
    public Marque saveMarque(Marque marque) {
        return this.marqueRepository.save(marque);
    }
    public Marque updateMarque(Marque marque) {
        return this.marqueRepository.save(marque);
    }

    public String deleteMarqueById(Long id) {
        this.marqueRepository.deleteById(id);
        return  "Marque Supprimé avec succes !";
    }
    public String deleteMarqueByObject(Marque marque) {
        this.marqueRepository.deleteById(marque.getId());
        return "Marque Supprimé avec succes !";
    }
    public List<Marque> getAllMarque() {
        return this.marqueRepository.findAll();
    }
    public Marque findMarqueById(Long id) {
        return this.marqueRepository.findById(id).orElse(null);
    }

    }



