package terminal.model;

import java.math.BigDecimal;

public class Riba extends Entitet  {
	
	private String vrstaRibe;
	private BigDecimal cijenaRibe;
	
	
	
	
	public Riba() {
		super();
	}
	public Riba(int sifra, String vrstaRibe, BigDecimal cijenaRibe) {
		super(sifra);
		this.vrstaRibe = vrstaRibe;
		this.cijenaRibe = cijenaRibe;
	}
	public String getVrstaRibe() {
		return vrstaRibe;
	}
	public void setVrstaRibe(String vrstaRibe) {
		this.vrstaRibe = vrstaRibe;
	}
	public BigDecimal getCijenaRibe() {
		return cijenaRibe;
	}
	public void setCijenaRibe(BigDecimal cijenaRibe) {
		this.cijenaRibe = cijenaRibe;
	}
	
	
	
	

}
