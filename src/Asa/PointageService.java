package Asa;

import java.time.LocalDate;
import java.util.List;

public class PointageService {
    public static boolean pointageRouge(List<Pointage> pointages, LocalDate date) {
        boolean quotaIvalide = pointages.stream()
                .filter(Pointage pointage -> pointage.getDate.equals(date))
                .anyMatch(pointage -> pointage.getQuota() <= 0 || pointage.getQuota() > 1)
        if (quotaIvalide) {
            throw new IllegalArgumentException("Quota invalide detecté .");
        }
        double total =pointages.stream()
                .filter(pointage -> pointage.getDate().equals(date))
                .mapToDouble(Pointage::getQuota)
                .sum();
        return total == 1.0;
    }

}
