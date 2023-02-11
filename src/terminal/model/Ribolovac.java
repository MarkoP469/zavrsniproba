package terminal.model;

public class Ribolovac extends Entitet {

	private String ime;
	private String prezime;
	private String kontakt;
	private int brojStapova;

	public Ribolovac() {
		super();
	}

	public Ribolovac(int sifra, String ime, String prezime, String kontakt, int brojStapova) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.kontakt = kontakt;
		this.brojStapova = brojStapova;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKontakt() {
		return kontakt;
	}

	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}

	public int getBrojStapova() {
		return brojStapova;
	}

	public void setBrojStapova(int brojStapova) {
		this.brojStapova = brojStapova;
	}


@Override
public String toString() {
	return ime;
}
}