package Asa;

import java.time.LocalDate;
import java.util.List;

public class PointageService {
    public static boolean pointageRouge(List<Pointage> pointages, LocalDate date) {
        double total = 0;
        for (Pointage p : pointages) {
            if (p.getDate().equals(date)) {
                if (p.getQuota() <= 0 || p.getQuota() > 1) {
                    throw  new IllegalArgumentException("Quota invalide detecté !");
                }
                total += p.getQuota();
            }
        }
        return total == 1.0;
    }
    
}
