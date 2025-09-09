package Asa;

import java.util.ArrayList;
import java.util.List;

public class Salaire extends Travailleur{
    private double salaireMensuel;
    private List<Promotion> Promotions = new ArrayList<>();

    public Salaire(int id, String nom, String prenom, String email, String telephone, double salaireMensuel, List<Promotion> promotion) {
        super(id, nom, prenom, email, telephone);
        this.salaireMensuel = salaireMensuel;
        Promotions = promotion;
    }
    public void addPromotion(Promotion promo) {
        Promotions.add(promo);
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public void setPromotions(List<Promotion> promotions) {
        Promotions = promotions;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public List<Promotion> getPromotions() {
        return Promotions;
    }
}
