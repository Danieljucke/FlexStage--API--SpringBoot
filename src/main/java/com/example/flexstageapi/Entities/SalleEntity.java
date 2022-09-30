package com.example.flexstageapi.Entities;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "salle", indexes = {
        @Index(name = "IDX_4E977E5CA73F0036", columnList = "ville_id"),
        @Index(name = "IDX_4E977E5CED5CA9E6", columnList = "service_id"),
        @Index(name = "IDX_4E977E5CBCF5E72D", columnList = "categorie_id")
})
@Entity
public class SalleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategorieSalleEntity categorie;

    @ManyToOne(optional = false)
    @JoinColumn(name = "service_id", nullable = false)
    private ServiceEntity service;

    @Column(name = "nom_salle", nullable = false, length = 50)
    private String nomSalle;

    @Column(name = "statut", nullable = false)
    private Boolean statut = false;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ville_id", nullable = false)
    private VilleEntity ville;

    @Column(name = "adresse", nullable = false, length = 100)
    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public VilleEntity getVille() {
        return ville;
    }

    public void setVille(VilleEntity ville) {
        this.ville = ville;
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

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public ServiceEntity getService() {
        return service;
    }

    public void setService(ServiceEntity service) {
        this.service = service;
    }

    public CategorieSalleEntity getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieSalleEntity categorie) {
        this.categorie = categorie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}