package Asa;

import java.time.LocalDate;

public class Pointage {
    private LocalDate date;
    private TyprTravail typrTravail;
    private double quota;
    private String description;
    private String couleur;

    public Pointage(LocalDate date, TyprTravail typrTravail, double quota, String description, String couleur) {
        if (quota <= 0 || quota > 1) {
            throw new IllegalArgumentException("Quota invalide : doit etre > 0 et <= 1");
        }
        this.date = date;
        this.typrTravail = typrTravail;
        this.quota = quota;
        this.description = description;
        this.couleur = couleur;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTyprTravail(TyprTravail typrTravail) {
        this.typrTravail = typrTravail;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public LocalDate getDate() {
        return date;
    }

    public TyprTravail getTyprTravail() {
        return typrTravail;
    }

    public double getQuota() {
        return quota;
    }

    public String getDescription() {
        return description;
    }

    public String getCouleur() {
        return couleur;
    }
}
