package kadra;

public class Czl  extends Pracownik { 
	double pensja; 
	double proc_p; 
	Pracownik asys; 
	int spot;
	public Czl(String imie, String nazwisko, int rok_ur, Pracownik kier,
			double pensja, double proc_p, Pracownik asys, int spot) {
		super(imie, nazwisko, rok_ur, kier);
		this.pensja = pensja;
		this.proc_p = proc_p;
		this.asys = asys;
		this.spot = spot;
	}
	@Override
	public String toString() {
		return "Czl [pensja=" + pensja + ", proc_p=" + proc_p + ", asys="
				+ asys + ", spot=" + spot + "]";
	}
	public double getPensja() {
		return pensja;
	}
	public void setPensja(double pensja) {
		this.pensja = pensja;
	}
	public double getProc_p() {
		return proc_p;
	}
	public void setProc_p(double proc_p) {
		this.proc_p = proc_p;
	}
	public Pracownik getAsys() {
		return asys;
	}
	public void setAsys(Pracownik asys) {
		this.asys = asys;
	}
	public int getSpot() {
		return spot;
	}
	public void setSpot(int spot) {
		this.spot = spot;
	}

}
