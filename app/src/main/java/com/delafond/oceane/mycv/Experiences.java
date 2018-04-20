package com.delafond.oceane.mycv;

public class Experiences {

    private String logo_entreprise;
    private String entreprise;
    private String duree;
    private String lieu;
    private String profession;

    public Experiences(String logo_entreprise, String entreprise, String duree, String lieu, String profession) {
        this.logo_entreprise = logo_entreprise;
        this.entreprise = entreprise;
        this.duree = duree;
        this.lieu = lieu;
        this.profession = profession;
    }

    public String getLogo_entreprise() {
        return logo_entreprise;
    }

    public void setLogo_entreprise(String logo_entreprise) {
        this.logo_entreprise = logo_entreprise;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return entreprise + " : " + lieu + "\n" + profession + "\n" + duree;
    }
}
