import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestChargeurMagasin {
	@Test
	public void test_chargeurMagasin_inexistant() {
		ChargeurMagasin chargeur = new ChargeurMagasin("unfichierquinexistepas");
		assertThrows(FileNotFoundException.class, chargeur::chargerMagasin);
	}

	@Test
	public void test_chargeurMagasin_existant() throws FileNotFoundException {
		ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzSimple");
		assertInstanceOf(Magasin.class, chargeur.chargerMagasin());
	}
}
