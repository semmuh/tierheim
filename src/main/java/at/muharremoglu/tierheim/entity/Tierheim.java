package at.muharremoglu.tierheim.entity;


import jakarta.persistence.Entity;

@Entity
public class Tierheim {
    private String name;
    private String adresse;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
