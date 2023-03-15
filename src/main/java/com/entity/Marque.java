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
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String marque;
    @OneToMany(mappedBy = "marque",fetch = FetchType.LAZY)
    @JsonManagedReference(value="marqueId")
    private Set<Voiture> ListeMarque;



}
