import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    private Conducteur conducteur;

    @BeforeEach
    public void setUp() {
        // GIVEN
        conducteur = new Conducteur("John", 20);
    }

    @Test
    public void testEstAdulteDevraitRetournerTrue() {
        // GIVEN

        // WHEN

        // THEN
        assertThat(conducteur.estAdulte()).isTrue();
    }
}
