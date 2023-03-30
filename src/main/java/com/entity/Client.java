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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdClient;
    private  Long CinClient;
    private String NomClient;
    private String PrenomClient;
    private  int NumTel;
    private String AdresseClient;
    private String EmailClient;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    @JsonManagedReference(value="ClientId")
    private Set<Reservation> ListeClient;

}
