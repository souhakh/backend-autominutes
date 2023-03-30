package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long IdVoiture;
    private String MatriculeVoiture;
    private String MarqueVoiture;
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
    @ManyToOne()
    @JsonBackReference(value="couleur")
    @JoinColumn(name = "couleur")
    private Couleur couleur;
    @ManyToOne()
    @JsonBackReference(value="typeVoiture")
    @JoinColumn(name = "typeVoiture")
    private TypeVoiture typeVoiture;
    @ManyToOne()
    @JsonBackReference(value="reservation")
    @JoinColumn(name = "reservation")
    private Reservation reservation;



}
