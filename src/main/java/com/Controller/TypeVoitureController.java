package com.Controller;

import com.entity.Marque;
import com.entity.TypeVoiture;
import com.service.MarqueService;
import com.service.TypeVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/TypeVoiture")
@CrossOrigin("*")
public class TypeVoitureController {
    @Autowired
    public TypeVoitureService typeVoitureService;

    @RequestMapping(value="/ajouterTypeVoiture",method= RequestMethod.POST,headers="accept=Application/json")
    public TypeVoiture save(@RequestBody TypeVoiture typeVoiture) {
        try {
            typeVoiture=this.typeVoitureService.saveTypeVoiture(typeVoiture);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return typeVoiture;

    }

    @RequestMapping(value="/getAllTypeVoiture",method= RequestMethod.GET,headers="accept=Application/json")
    public List<TypeVoiture> getAll() {
        List<TypeVoiture> typeVoitures=new ArrayList<>();
        try {
           typeVoitures=this.typeVoitureService.getAlTypeVoiture();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return typeVoitures;

    }

    @RequestMapping(value="/updateTypeVoiture",method= RequestMethod.PUT,headers="accept=Application/json")
    public TypeVoiture update(@RequestBody TypeVoiture typeVoiture) {
        try {
            typeVoiture=this.typeVoitureService.updateTypeVoiture(typeVoiture);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return typeVoiture;

    }

    @RequestMapping(value = "/deleteTypeVoiture", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody TypeVoiture typeVoiture){
        return this.typeVoitureService.deleteTypeVoitureByObject(typeVoiture);
    }


    @RequestMapping(value = "/deleteTypeVoiture/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.typeVoitureService.deleteTypeVoitureById(id);
    }



    @RequestMapping(value = "/findTypeVoitureById/{id}", method =RequestMethod.GET)
    public TypeVoiture findById(@PathVariable("id") long id){
        return this.typeVoitureService.findTypeVoitureById(id);
    }


}
