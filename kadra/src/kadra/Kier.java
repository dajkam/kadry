package kadra;

public class Kier extends Pracownik { 
	public Kier(String imie, String nazwisko, int rok_ur, Pracownik kier,
			double pensja, double proc_premi, double dodatek, String nr_tel,
			String nr_tel_k, String nr_pok, String dział) {
		super(imie, nazwisko, rok_ur, kier);
		this.pensja = pensja;
		this.proc_premi = proc_premi;
		this.dodatek = dodatek;
		this.nr_tel = nr_tel;
		this.nr_tel_k = nr_tel_k;
		this.nr_pok = nr_pok;
		this.dział = dział;
	}
	double pensja; 
	double proc_premi; 
	double dodatek; 
	String nr_tel; 
	String nr_tel_k; 
	String nr_pok; 
	String dział;
	@Override
	public String toString() {
		return "Kier [pensja=" + pensja + ", proc_premi=" + proc_premi
				+ ", dodatek=" + dodatek + ", nr_tel=" + nr_tel + ", nr_tel_k="
				+ nr_tel_k + ", nr_pok=" + nr_pok + ", dział=" + dział + "]";
	}
	public double getPensja() {
		return pensja;
	}
	public void setPensja(double pensja) {
		this.pensja = pensja;
	}
	public double getProc_premi() {
		return proc_premi;
	}
	public void setProc_premi(double proc_premi) {
		this.proc_premi = proc_premi;
	}
	public double getDodatek() {
		return dodatek;
	}
	public void setDodatek(double dodatek) {
		this.dodatek = dodatek;
	}
	public String getNr_tel() {
		return nr_tel;
	}
	public void setNr_tel(String nr_tel) {
		this.nr_tel = nr_tel;
	}
	public String getNr_tel_k() {
		return nr_tel_k;
	}
	public void setNr_tel_k(String nr_tel_k) {
		this.nr_tel_k = nr_tel_k;
	}
	public String getNr_pok() {
		return nr_pok;
	}
	public void setNr_pok(String nr_pok) {
		this.nr_pok = nr_pok;
	}
	public String getDział() {
		return dział;
	}
	public void setDział(String dział) {
		this.dział = dział;
	}

}
