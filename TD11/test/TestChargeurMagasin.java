import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestChargeurMagasin {
	@Test
	public void test_chargeurMagasin_inexistant() {
		ChargeurMagasin mag = new ChargeurMagasin("musicbrainzSimple/fauxfichier.xml");
		assertThrows(FileNotFoundException.class, mag::chargerMagasin);
	}

	@Test
	public void test_chargeurMagasin_existant() {
		ChargeurMagasin mag = new ChargeurMagasin("musicbrainzSimple/fauxfichier.xml");

	}
}
