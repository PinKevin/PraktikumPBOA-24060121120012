/*
	File      : Titik.java  01/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas untuk titik
*/


public class Titik {
    // atribut
    private double absis;
    private double ordinat;
	private static int counterTitik;
    
    // method 
    public Titik() {
		counterTitik++;
        absis = 0;
        ordinat = 0;
    }
	
	public Titik(double a, double o) {
		counterTitik++;
		absis = a;
		ordinat = o;
	}
    
    public void setAbsis(double a) {
        absis = a;
    }
    
    public void setOrdinat(double o) {
        ordinat = o;
    }
    
    public double getAbsis() {
        return absis;
    }
    
    public double getOrdinat() {
        return ordinat;
    }
	
	public int getCounterTitik() {
		return counterTitik;
	}
} 
