package EntradaSalidaDatos;

public class ValoresTC {
	
	String[] conversor = { "Conversor MXN - USD", "Conversor MXN - EUR", "Conversor MXN - GBP",
			"Conversor MXN - JPY", "Conversor MXN - KRW", "Conversor USD - MXN", "Conversor EUR - MXN", "Conversor GBP - MXN",
			"Conversor JPY - MXN", "Conversor KRW - MXN"};
	String[] conversorDirecto = { "Conversor MXN - USD", "Conversor MXN - EUR", "Conversor MXN - GBP",
			"Conversor MXN - JPY", "Conversor MXN - KRW"};
	
	private double usd = 0.056;
	private double eur = 0.051;
	private double gbp = 0.045;
	private double jpy = 7.59;
	private double krn = 74.61;
	
	public double getUsd() {
		return usd;
	}
	public void setUsd(double usd) {
		this.usd = usd;
	}
	public double getEur() {
		return eur;
	}
	public void setEur(double eur) {
		this.eur = eur;
	}
	public double getGbp() {
		return gbp;
	}
	public void setGbp(double gbp) {
		this.gbp = gbp;
	}
	public double getJpy() {
		return jpy;
	}
	public void setJpy(double jpy) {
		this.jpy = jpy;
	}
	public double getKrn() {
		return krn;
	}
	public void setKrn(double krn) {
		this.krn = krn;
	}
	
	
	
}
