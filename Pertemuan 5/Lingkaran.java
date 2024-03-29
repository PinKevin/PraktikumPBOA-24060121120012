/*
	File      : Lingkaran.java  25/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : implementasi IArea untuk menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r) {
		jejari = r;
	}
	
	public double hitungLuas() {
		return PI * jejari * jejari;
	}
	
}