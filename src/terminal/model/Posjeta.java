package terminal.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posjeta extends Entitet {
	
	private BigDecimal ukupnaCijena;
	private Date datumDolaska;
	private Date datumOdlaska;
	private Mjesto mjesto;
	private List<Ribolovac> ribolovci;
	
	
	
	
	public Posjeta() {
		super();
		ribolovci = new ArrayList<>();
	}
	public Posjeta(int sifra, BigDecimal ukupnaCijena, Date datumDolaska, Date datumOdlaska, Mjesto mjesto,
			List<Ribolovac> ribolovci) {
		super(sifra);
		this.ukupnaCijena = ukupnaCijena;
		this.datumDolaska = datumDolaska;
		this.datumOdlaska = datumOdlaska;
		this.mjesto = mjesto;
		this.ribolovci = ribolovci;
	}
	public BigDecimal getUkupnaCijena() {
		return ukupnaCijena;
	}
	public void setUkupnaCijena(BigDecimal ukupnaCijena) {
		this.ukupnaCijena = ukupnaCijena;
	}
	public Date getDatumDolaska() {
		return datumDolaska;
	}
	public void setDatumDolaska(Date datumDolaska) {
		this.datumDolaska = datumDolaska;
	}
	public Date getDatumOdlaska() {
		return datumOdlaska;
	}
	public void setDatumOdlaska(Date datumOdlaska) {
		this.datumOdlaska = datumOdlaska;
	}
	public Mjesto getMjesto() {
		return mjesto;
	}
	public void setMjesto(Mjesto mjesto) {
		this.mjesto = mjesto;
	}
	public List<Ribolovac> getRibolovci() {
		return ribolovci;
	}
	public void setRibolovci(List<Ribolovac> ribolovci) {
		this.ribolovci = ribolovci;
	}
	
	
	
	
	
	
	

}
