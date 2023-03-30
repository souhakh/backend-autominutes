package com.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeVoiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String typeVoiture;
    @OneToMany(mappedBy = "typeVoiture",fetch = FetchType.LAZY)
    @JsonManagedReference(value="typeVoiture")
    private Set<Voiture> ListeTypeVoiture;



}
