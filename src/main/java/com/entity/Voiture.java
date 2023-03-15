package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long IdVoiture;
    private String MatriculeVoitue;
    private String MarqueVoiture;
    private String CouleurVoiture;
    private String imageVoiture;
    private int Caution;
    private int livraison;
    private double fraisRemis;
    private int limitekiloMoff;
    private Date date_fin_prix;
    private  boolean etatcautionV;
    private boolean etatlivraisonnV;
    private Date dateRemisV;
    private Date datefin_livraison;
    @ManyToOne()
    @JsonBackReference(value="marque")
    @JoinColumn(name = "marque")
    private Marque marque;
}
