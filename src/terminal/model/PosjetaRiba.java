package terminal.model;

import java.math.BigDecimal;

public class PosjetaRiba extends Entitet {
	
		private BigDecimal tezina;
		private Posjeta posjeta;
		private Riba riba;
		
		
		
		public PosjetaRiba() {
			super();
		}
		public PosjetaRiba(int sifra, BigDecimal tezina, Posjeta posjeta, Riba riba) {
			super(sifra);
			this.tezina = tezina;
			this.posjeta = posjeta;
			this.riba = riba;
		}
		public BigDecimal getTezina() {
			return tezina;
		}
		public void setTezina(BigDecimal tezina) {
			this.tezina = tezina;
		}
		public Posjeta getPosjeta() {
			return posjeta;
		}
		public void setPosjeta(Posjeta posjeta) {
			this.posjeta = posjeta;
		}
		public Riba getRiba() {
			return riba;
		}
		public void setRiba(Riba riba) {
			this.riba = riba;
		}
		
		

}
