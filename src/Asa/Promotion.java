package Asa;

import java.time.LocalDate;

public class Promotion {
    private LocalDate date;
    private double valeur;
    private String raison;

    public Promotion(LocalDate date, double valeur, String raison) {
        this.date = date;
        this.valeur = valeur;
        this.raison = raison;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getValeur() {
        return valeur;
    }

    public String getRaison() {
        return raison;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }
}
