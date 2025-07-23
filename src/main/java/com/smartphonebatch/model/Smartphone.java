package com.smartphonebatch.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "smartphones")
@Data
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String modele;
    //private String capacite;
    private String os;
    private int anneeSortie;
    private double tailleEcran;
    private double prix;
}
