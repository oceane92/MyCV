package com.delafond.oceane.mycv.model;

public class Formation {
    private String nom;
    private String annees;
    private String lieu;

    public Formation(String nom, String annees, String lieu) {
        this.nom = nom;
        this.annees = annees;
        this.lieu = lieu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnnees() {
        return annees;
    }

    public void setAnnees(String annees) {
        this.annees = annees;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @Override
    public String toString() {

        return nom + "\n" + annees + " : " + lieu;
    }
}
