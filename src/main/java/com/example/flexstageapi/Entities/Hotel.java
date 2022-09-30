package com.example.flexstageapi;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "hotel", indexes = {
        @Index(name = "IDX_3535ED9A73F0036", columnList = "ville_id")
})
@Entity
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ville_id", nullable = false)
    private Ville ville;

    @Column(name = "nom_hotel", nullable = false)
    private String nomHotel;

    @Column(name = "nombre_etoiles", nullable = false)
    private Integer nombreEtoiles;

    @Column(name = "adresse", nullable = false)
    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getNombreEtoiles() {
        return nombreEtoiles;
    }

    public void setNombreEtoiles(Integer nombreEtoiles) {
        this.nombreEtoiles = nombreEtoiles;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
