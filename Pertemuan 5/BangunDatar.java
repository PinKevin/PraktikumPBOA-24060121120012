/*
	File      : BangunDatar.java  25/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas untuk bangun datar
*/

public abstract class BangunDatar {
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l) {
		luas = l;
	}
	
	public double getLuas() {
		return luas;
	}
}