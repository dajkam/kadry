package kadra;

public class Um extends Pracownik { 
	double pensja;
	double proc_premi; 
	String nr_tel; 
	String nr_pok;
	public Um(String imie, String nazwisko, int rok_ur, Pracownik kier,
			double pensja, double proc_premi, String nr_tel, String nr_pok) {
		super(imie, nazwisko, rok_ur, kier);
		this.pensja = pensja;
		this.proc_premi = proc_premi;
		this.nr_tel = nr_tel;
		this.nr_pok = nr_pok;
	}
	@Override
	public String toString() {
		return "Um [pensja=" + pensja + ", proc_premi=" + proc_premi
				+ ", nr_tel=" + nr_tel + ", nr_pok=" + nr_pok + "]";
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
	public String getNr_tel() {
		return nr_tel;
	}
	public void setNr_tel(String nr_tel) {
		this.nr_tel = nr_tel;
	}
	public String getNr_pok() {
		return nr_pok;
	}
	public void setNr_pok(String nr_pok) {
		this.nr_pok = nr_pok;
	} 
	

}
