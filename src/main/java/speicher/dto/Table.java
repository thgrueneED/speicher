package speicher.dto;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private Header header;

	private List<Angebot> angebote;
	
	public Table() {
		angebote = new ArrayList<>();
	}
	
	public void setHeader(Header header) {
		this.header = header;
	}
	
	public Header getHeader() {
		return header;
	}

	public void addAngebot(Angebot angebot) {
		angebote.add(angebot);
	}
	
}
