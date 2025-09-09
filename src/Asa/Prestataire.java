package Asa;

import java.util.ArrayList;
import java.util.List;

public class Prestataire extends Travailleur{
    private double tjm;
    private List<Promotion> Promotion = new ArrayList<>();
    private List<Pointage> pointages = new ArrayList<>();

    public Prestataire(int id, String nom, String prenom, String email, String telephone, double tjm, List<Promotion> promotion, List<Pointage> pointages) {
        super(id, nom, prenom, email, telephone);
        this.tjm = tjm;
        this.Promotion = promotion;
        this.pointages = pointages;
    }
    public void addPromotion(Promotion promo) {
        Promotion.add(promo);
    }
    public double getTjmActuel() {
        if (Promotion.isEmpty()) return tjm;
        return Promotion.get(Promotion.size() - 1).getValeur();
    }
    public void addPointage(Pointage p) {
        pointages.add(p);
    }

    public List<Pointage> getPointages() {
        return pointages;
    }

    public void setTjm(double tjm) {
        this.tjm = tjm;
    }

    public void setPromotion(List<Promotion> promotion) {
        Promotion = promotion;
    }

    public void setPointages(List<Pointage> pointages) {
        this.pointages = pointages;
    }
}
