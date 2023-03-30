package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdReservation;
    private Date DAteTime;
    private  int jour;
    private Date dateDebut;
    private Date dateFin ;
    private double Prix;
    private String facture;
    private String etate;
    private String paiement;
    private String reference;
    private String lieuPr;
    private String LieuRe;
    private double logPrix;
    @OneToMany(mappedBy = "reservation",fetch = FetchType.LAZY)
    @JsonManagedReference(value="reservationId")
    private Set<Voiture> ListeReservation;
    @ManyToOne()
    @JsonBackReference(value="client")
    @JoinColumn(name = "client")
    private Client client;



}
