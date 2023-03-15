/*
	File      : Poligon.java  15/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas untuk poligon
*/

package org.poligon;

public class Poligon {
	protected int jumlahSisi;
	
	public Poligon() {
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi (int sisi) {
		this.jumlahSisi = sisi;
	}
	
	public int getJumlahSisi() {
		return this.jumlahSisi;
	}
}