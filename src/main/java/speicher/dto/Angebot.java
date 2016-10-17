package speicher.dto;

import java.util.ArrayList;
import java.util.List;

public class Angebot {

	private String id_sparte;
	private String id_versichert;
	private String id_erstellt;
	private List<Aktion> id_aktionen;
	
	public Angebot() {
		id_aktionen = new ArrayList<>();
	}

	public String getId_sparte() {
		return id_sparte;
	}

	public void setId_sparte(String id_sparte) {
		this.id_sparte = id_sparte;
	}

	public String getId_versichert() {
		return id_versichert;
	}

	public void setId_versichert(String id_versichert) {
		this.id_versichert = id_versichert;
	}

	public String getId_erstellt() {
		return id_erstellt;
	}

	public void setId_erstellt(String id_erstellt) {
		this.id_erstellt = id_erstellt;
	}

	public List<Aktion> getId_aktionen() {
		return id_aktionen;
	}

	public void addId_aktionen(Aktion id_aktionen) {
		this.id_aktionen.add(id_aktionen);
	}

}
