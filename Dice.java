package Spil;

//Vi laver et terninge opbjekt med udgangspunkt i inledendeprogramering undervisning
public class Terning {
	private final int MAX = 6;  // maxks antal øjne
	private int ØjenVærdi;  // nuværende slag
	// Vi laver en terning
	public Terning(int value){
		ØjenVærdi = value;
	}
	// slå med terningen
	public int roll(){
		ØjenVærdi = (int)(Math.random() * MAX) + 1;
		return ØjenVærdi;
	}
	// start øjenværdi
	public void setFaceValue (int value){
		ØjenVærdi = value;
	}
	// hent øjne værdi
	public int getØjenVærdi(){
		return ØjenVærdi;
	}
	// returnerer en streng repræsentation af objektets data
	public String toString(){
		String udfald = "Øjne: " + ØjenVærdi;
		return udfald;
	}
}
