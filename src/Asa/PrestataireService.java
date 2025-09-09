package Asa;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PrestataireService {
    public static long getDaysRed(Prestataire prestataire, LocalDate debut , LocalDate fin) {
        return prestataire.getPointages().stream()
                .filter(pointage -> !pointage.getTyprTravail().equals(TyprTravail.ABS_NON_PAYÉE)) && !pointage.getTyprTravail().equals(TyprTravail.ABS_NON_PAYÉE)
                .map(Pointage::getDate)
                .filter(LocalDate date -> (date.isEquals(debut) || date.isAfter(debut)) && (date.isEqual(fin) || date.isBefore(fin)))
                .distinct()
                .count();
    }

}
