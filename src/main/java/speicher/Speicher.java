package speicher;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import speicher.dto.Aktion;
import speicher.dto.Angebot;
import speicher.dto.Header;
import speicher.dto.Table;

public class Speicher implements ISpeicher{

	@Override
	public Response test() {
		Table table = new Table();
		
		table.setHeader(createHeader());
		table.addAngebot(createAngebot());
		table.addAngebot(createAngebot());
		
		return Response.status(200).entity(toJson(table)).build();
	}

	private String toJson(Object object) {
		Gson gson = new Gson();
		return gson.toJson(object);
	}

	private Header createHeader() {
		Header header = new Header();
		header.setId_aktionen("Aktionen");
		header.setId_versichert("Versichert");
		header.setId_erstellt("Erstellt am");
		header.setId_sparte("Sparte");
		return header;
	}
	
	private Angebot createAngebot() {
		Angebot angebot = new Angebot();
		
		Aktion aktion = new Aktion();
		aktion.setName("www.google.de");
		
		Aktion aktion2 = new Aktion();
		aktion2.setName("www.yahoo.de");
		
		angebot.addId_aktionen(aktion);
		angebot.addId_aktionen(aktion2);
		angebot.setId_versichert("Testname");
		angebot.setId_erstellt("01.01.1990");
		angebot.setId_sparte("KFZ");
		
		return angebot;
	}

}
