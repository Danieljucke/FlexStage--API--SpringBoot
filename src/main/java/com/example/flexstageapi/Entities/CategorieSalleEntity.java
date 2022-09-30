package com.example.flexstageapi.Entities;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "categorie_salle")
@Entity
public class CategorieSalleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom_categorie", nullable = false, length = 30)
    private String nomCategorie;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "prix", nullable = false)
    private Double prix;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @Column(name = "nombre_etoile", nullable = false)
    private Integer nombreEtoile;

    public Integer getNombreEtoile() {
        return nombreEtoile;
    }

    public void setNombreEtoile(Integer nombreEtoile) {
        this.nombreEtoile = nombreEtoile;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}