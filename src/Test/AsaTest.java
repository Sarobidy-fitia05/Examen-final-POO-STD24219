package Test;

import Asa.Pointage;
import Asa.PointageService;
import Asa.TyprTravail;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

public class AsaTest {
    @Test
    void testPointageRouge() {
        Pointage p1 = new Pointage(LocalDate.of(2025,9,9), TypeTravail.ENSEIGNEMENT, 0.5, "Cours Java", "bleu");
        Pointage p2 = new Pointage(LocalDate.of(2025,9,9), TypeTravail.ADMINISTRATION, 0.5, "Réunion", "rouge");
        assertTru(PointageService.pointageRouge(List.of(p1,p2), LocalDate.of(2025,9,9));
    }

}
