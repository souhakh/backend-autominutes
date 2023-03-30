package com.service;
import com.Repository.TypeVoitureRepository;
import com.entity.TypeVoiture;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TypeVoitureService {
        private TypeVoitureRepository typeVoitureRepository;
    public TypeVoiture saveTypeVoiture(TypeVoiture typeVoiture) {
        return this.typeVoitureRepository.save(typeVoiture);
    }
    public TypeVoiture updateTypeVoiture(TypeVoiture typeVoiture) {
        return this.typeVoitureRepository.save(typeVoiture);
    }

    public String deleteTypeVoitureById(Long id) {
        this.typeVoitureRepository.deleteById(id);
        return  "TypeVoiture Supprimé avec succes !";
    }
    public String deleteTypeVoitureByObject(TypeVoiture typeVoiture) {
        this.typeVoitureRepository.deleteById(typeVoiture.getId());
        return "TypeVoiture Supprimé avec succes !";
    }
    public List<TypeVoiture> getAlTypeVoiture() {
        return this.typeVoitureRepository.findAll();
    }
    public TypeVoiture findTypeVoitureById(Long id) {
        return this.typeVoitureRepository.findById(id).orElse(null);
    }

}



