package kadra;

public class Pracownik { 
	String imie; 
	String nazwisko; 
	int rok_ur; 
	Pracownik kier;
	public Pracownik(String imie, String nazwisko, int rok_ur, Pracownik kier) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rok_ur = rok_ur;
		this.kier = kier;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getRok_ur() {
		return rok_ur;
	}
	public void setRok_ur(int rok_ur) {
		this.rok_ur = rok_ur;
	}
	public Pracownik getKier() {
		return kier;
	}
	public void setKier(Pracownik kier) {
		this.kier = kier;
	}
}
