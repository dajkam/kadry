package kadra;

import java.util.List;

public class Fiz extends Pracownik { 
	double stawka; 
	public Fiz(String imie, String nazwisko, int rok_ur, Pracownik kier,
			 final double stawka, int h, int nad_h, List<String> kwalifikacje) {
		super(imie, nazwisko, rok_ur, kier);
		this.h = h;
		this.nad_h = nad_h;
		this.kwalifikacje = kwalifikacje;
	}
	public Fiz(String imie, String nazwisko, int rok_ur, Pracownik kier) {
		super(imie, nazwisko, rok_ur, kier);
		// TODO Auto-generated constructor stub
	}
	
	 private int h; 
	 private int nad_h; 
	private List<String>kwalifikacje;
	@Override
	public String toString() {
		return "Fiz [stawka=" + stawka + ", h=" + h + ", nad_h=" + nad_h
				+ ", kwalifikacje=" + kwalifikacje + "]";
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getNad_h() {
		return nad_h;
	}
	public void setNad_h(int nad_h) {
		this.nad_h = nad_h;
	}
	public List<String> getKwalifikacje() {
		return kwalifikacje;
	}
	public void setKwalifikacje(List<String> kwalifikacje) {
		this.kwalifikacje = kwalifikacje;
	}
	public double getStawka() {
		return stawka;
	} 
	double 
	o=1;
	public double Wyp(double stawka,int h,int nad_h,double o)
	{ 
		
		o=stawka*h+1.5*stawka*nad_h;
		
		return o; 
		
		
	}

}
