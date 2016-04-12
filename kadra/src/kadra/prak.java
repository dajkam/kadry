package kadra;

public class prak extends Pracownik { 
	Pracownik op; 
	double styp;
	public prak(String imie, String nazwisko, int rok_ur, Pracownik kier,
			Pracownik op, double styp) {
		super(imie, nazwisko, rok_ur, kier);
		this.op = op;
		this.styp = styp;
	}
	public Pracownik getOp() {
		return op;
	}
	public void setOp(Pracownik op) {
		this.op = op;
	}
	public double getStyp() {
		return styp;
	}
	public void setStyp(double styp) {
		this.styp = styp;
	}
	@Override
	public String toString() {
		return "prak [op=" + op + ", styp=" + styp + "]";
	}
	

}
