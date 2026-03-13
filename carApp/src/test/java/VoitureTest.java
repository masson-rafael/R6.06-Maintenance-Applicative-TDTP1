import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoitureTest {

    public static final int AGE = 20;
    public static final int NOUVELLE_VITESSE = 30;
    public static final int VITESSE_INITIALE = 0;
    public static final int VITESSE_MAX = 120;
    private Voiture voiture;
    private Conducteur conducteur;

    @BeforeEach
    public void setUp() {
        // GIVEN
        voiture = new Voiture("Sedan", "Bleu");
    }

    @Test
    public void testVitesseInitiale() {
        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(VITESSE_INITIALE);
    }

    @Test
    public void testDemarrerVoitureAdulteDevraitDemarrer() {
        // GIVEN
        Conducteur conducteur = new Conducteur("John", AGE);

        // WHEN
        voiture.demarrerVoiture(conducteur);

        // THEN
        // check message
    }

    @Test
    public void testDemarrerVoiturePasAdulteNeDevraitPasDemarrer() {
        // GIVEN
        Conducteur conducteur = new Conducteur("John", AGE);

        // WHEN
        voiture.demarrerVoiture(conducteur);

        // THEN
        // check message
    }

    @Test
    public void testArreterVoitureDevraitArreter() {
        // GIVEN
        Conducteur conducteur = new Conducteur("John", AGE);

        // WHEN
        voiture.arreterVoiture(conducteur);

        // THEN
        // check message
    }

    @Test
    public void testAccelererTroisFoisDevraitRenvoyerTrente() {
        // GIVEN

        // WHEN
        for (int i = 0; i < 3; i++) {
            voiture.accelerer();
        }

        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(NOUVELLE_VITESSE);
    }

    @Test
    public void testAccelererAuMaximumDevraitRenvoyerMaximum() {
        // GIVEN

        // WHEN
        for (int i = 0; i < 13; i++) {
            voiture.accelerer(); // 130 mais revient à 120
        }

        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(VITESSE_MAX);
    }

    @Test
    public void testRalentirApresCinqAccelerationsDevraitRenvoyerQuanrante() {
        // GIVEN

        // WHEN
        for(int i = 0; i < 4; i++) {
            voiture.accelerer(); // 40
        }
        voiture.ralentir(); // 30

        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(NOUVELLE_VITESSE);
    }

    @Test
    public void testRalentirAuMinimumDevraitRenvoyerMinimum() {
        // GIVEN

        // WHEN
        voiture.ralentir();

        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(VITESSE_INITIALE);
    }

    @Test
    public void testChangerVitesseSuperieureAVitesseCouranteDevraitAccelerer() {
        // GIVEN
        Conducteur conducteur = new Conducteur("John", AGE);

        // WHEN
        voiture.changerVitesse(NOUVELLE_VITESSE, conducteur);

        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(NOUVELLE_VITESSE);
    }

    @Test
    public void testChangerVitesseInferieureAVitesseCouranteDevraitRalentir() {
        // GIVEN
        Conducteur conducteur = new Conducteur("John", AGE);

        // WHEN
        for(int i = 0; i < 6; i++) {
            voiture.accelerer(); // 50
        }
        voiture.changerVitesse(NOUVELLE_VITESSE, conducteur);

        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(NOUVELLE_VITESSE);
    }

    @Test
    public void testChangerVitesseEgaleAVitesseCouranteDevraitRienFaire() {
        // GIVEN
        Conducteur conducteur = new Conducteur("John", AGE);

        // WHEN
        for(int i = 0; i < 3; i++) {
            voiture.accelerer(); // 30
        }
        voiture.changerVitesse(NOUVELLE_VITESSE, conducteur);

        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(NOUVELLE_VITESSE);
    }
}
