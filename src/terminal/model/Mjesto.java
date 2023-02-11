package terminal.model;

import java.math.BigDecimal;

public class Mjesto extends Entitet {
	
	private String lokacija;
	private BigDecimal cijenaBoravka;
	
	
	
	public Mjesto() {
		super();
	}
	public Mjesto(int sifra, String lokacija, BigDecimal cijenaBoravka) {
		super(sifra);
		this.lokacija = lokacija;
		this.cijenaBoravka = cijenaBoravka;
	}
	public String getLokacija() {
		return lokacija;
	}
	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}
	public BigDecimal getCijenaBoravka() {
		return cijenaBoravka;
	}
	public void setCijenaBoravka(BigDecimal cijenaBoravka) {
		this.cijenaBoravka = cijenaBoravka;
	}
	
	
	
	

}
