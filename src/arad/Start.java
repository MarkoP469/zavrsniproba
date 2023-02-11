package arad;

import java.util.Scanner;

import terminal.obrada.Ribolovci;



public class Start {

	private Ribolovci ribolovci;

	public Start() {
		super();
		Pomocno.ulaz = new Scanner(System.in);
		ribolovci = new Ribolovci(this);
		pozdravnaPoruka();
		glavniIzbornik();
	}

	public void glavniIzbornik() {
		System.out.println("");
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("Dostupne opcije");
		System.out.println("1. Ribolovci");
		System.out.println("2. Mjesta");
		System.out.println("3. Ribe");
		System.out.println("4. Izlaz iz programa");
		odabirGlavnogIzbornika();
	}

	private void odabirGlavnogIzbornika() {
		switch(Pomocno
				.unosBrojRaspon("Odabrana opcija: ",1,4)) {
		case 1:
			ribolovci.izbornik();
			break;
		
		case 5:
			System.out.println("Doviđenja!");
		}
		
	}

	

	

	private void pozdravnaPoruka() {
		System.out.println("Dobrodošli u Ribnjak terminal aplikaciju");
		
	}
	
	
	public Ribolovci getRibolovci() {
		return ribolovci;
	}

	public static void main(String[] args) {
		if (args.length == 1) {
			Pomocno.DEV = true;
		} else {
			Pomocno.DEV = false;
		}
		new Start();
	}

}
