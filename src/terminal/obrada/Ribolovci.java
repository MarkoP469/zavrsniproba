package terminal.obrada;


import java.util.ArrayList;
import java.util.List;

import arad.Start;
import terminal.model.Ribolovac;

public class Ribolovci {

	private List<Ribolovac> ribolovci;
	private Start start;
	

	public Ribolovci(Start start) {
		super();
		this.start = start;
		ribolovci = new ArrayList<>();
	}

	public Ribolovci(Start start, List<Ribolovac> ribolovci) {
		super();
		this.start = start;
		this.ribolovci = ribolovci;

	}

	public void izbornik() {
		System.out.println("");
		System.out.println("-Ribolovac- izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih Ribolovaca");
		System.out.println("2. Unos novog Ribolovca");
		System.out.println("3. Promjena postojećeg Ribolovca");
		System.out.println("4. Brisanje Ribolovca");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
	}

	private void odabirIzbornika() {
		switch (arad.Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 5)) {

		case 1:
			pregled(true);
			break;
		case 2:
			unosNovog();
			break;
		case 3:
			if (ribolovci.size() == 0) {
				System.out.println("Nema ribolovaca kojeg " + "bi mjenjali!");
				izbornik();
			} else {
				 promjena();
			}
			break;
		case 4:
			if (ribolovci.size() == 0) {
				System.out.println("Nema ribolovaca " + "kojeg " + "bi brisali!");
				izbornik();
			} else {
				 brisanje();
			}
			break;
		case 5:
			start.glavniIzbornik();
		}
	}
	
	public void pregled(boolean prikaziIzbornik) {
		System.out.println("\nRibolovci u aplikaciji");
		int rb = 1;
		for (Ribolovac r : ribolovci) {
			System.out.println(rb++ + ". " + r);
		}
		System.out.println("---------");
		if (prikaziIzbornik) {
			izbornik();
		}

	}
	
	private void unosNovog() {
		ribolovci.add(unesiNovogRibolovca());
		izbornik();
	}
		
	
	private Ribolovac unesiNovogRibolovca() {
		Ribolovac r = new Ribolovac();
		r.setSifra(arad.Pomocno.unosBrojRaspon("Unesi sifru Ribolovca: ", 1, Integer.MAX_VALUE));
		r.setIme(arad.Pomocno.unosTeksta("Unesi ime Ribolovca: "));
		return r;
	}
	
	private void promjena() {
		pregled(false);
		int rb = arad.Pomocno.unosBrojRaspon("Odaberite Ime Ribolovca kojeg zelite promjeniti", 1, ribolovci.size());
		Ribolovac r = ribolovci.get(rb - 1);
		r.setIme(arad.Pomocno.unosTeksta("Unesite Ime Ribolovca"));
		izbornik();
	}
	
	private void brisanje() {
		pregled(false);
		int rb = arad.Pomocno.unosBrojRaspon("Odaberite Ribolovca kojeg zelite obrisati: ", 1, ribolovci.size());
		ribolovci.remove(rb - 1);
		izbornik();
	}
	

	public List<Ribolovac> getRibolovci() {
		return ribolovci;
	}

	public void setRibolovci(List<Ribolovac> ribolovci) {
		this.ribolovci = ribolovci;
	}

}
