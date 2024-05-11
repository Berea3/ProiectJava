package org.back.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Masina {
    @Id
    private String nrInmatriculare;
    private String idUser;
    private String marca;
    private String model;
    private String culoare;
    private int an;
    private int capacitate;
    private String combustibil;
    private int putere;
    private int cuplu;
    private int volumPortbagaj;
    private int pret;

    public Masina() {}

    public Masina(String nrInmatriculare, String idUser, String marca, String model, String culoare, int an, int capacitate, String combustibil, int putere, int cuplu, int volumPortbagaj, int pret) {
        this.nrInmatriculare = nrInmatriculare;
        this.idUser = idUser;
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
        this.capacitate = capacitate;
        this.combustibil = combustibil;
        this.putere = putere;
        this.cuplu = cuplu;
        this.volumPortbagaj = volumPortbagaj;
        this.pret = pret;
    }

    public String getNrInmatriculare() {return nrInmatriculare;}
    public String getIdUser() {return idUser;}
    public String getMarca() {return marca;}
    public String getModel() {return model;}
    public String getCuloare() {return culoare;}
    public int getAn() {return an;}
    public int getCapacitate() {return capacitate;}
    public String getCombustibil() {return combustibil;}
    public int getPutere() {return putere;}
    public int getCuplu() {return cuplu;}
    public int getVolumPortbagaj() {return volumPortbagaj;}
    public int getPret() {return pret;}

    public void setNrInmatriculare(String nrInmatriculare) {this.nrInmatriculare = nrInmatriculare;}
    public void setIdUser(String idUser) {this.idUser = idUser;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setModel(String model) {this.model = model;}
    public void setCuloare(String culoare) {this.culoare = culoare;}
    public void setAn(int an) {this.an = an;}
    public void setCapacitate(int capacitate) {this.capacitate = capacitate;}
    public void setCombustibil(String combustibil) {this.combustibil = combustibil;}
    public void setPutere(int putere) {this.putere = putere;}
    public void setCuplu(int cuplu) {this.cuplu = cuplu;}
    public void setVolumPortbagaj(int volumPortbagaj) {this.volumPortbagaj = volumPortbagaj;}
    public void setPret(int pret) {this.pret = pret;}
}
