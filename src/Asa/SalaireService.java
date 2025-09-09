package Asa;

import java.time.LocalDate;

public class SalaireService {
    public static double calculeSalairePrestataire(Prestataire prestataire, LocalDate debut , LocalDate fin) {
        long jours = PrestataireService.getDaysRed(prestataire, debut , fin);
        return jours * prestataire.getTjmActuel();
    }

}
