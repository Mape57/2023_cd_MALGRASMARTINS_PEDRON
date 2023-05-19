package comparateur;

import donnees.CD;

public class ComparateurAlbum implements ComparateurCd {
	@Override
	public boolean etreAvant(CD cd1, CD cd2) {
		return cd1.getNomCD().compareTo(cd2.getNomCD()) > 0;
	}
}
