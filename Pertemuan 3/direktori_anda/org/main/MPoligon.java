/*
	File      : MPoligon.java  08/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : main untuk poligon, persegi panjang, dan segitiga
*/

package org.main;

import org.bangundatar.*;

public class MPoligon {
	public static void main(String[] args) {
		PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
		Segitiga segitiga = new Segitiga(3, 4, 3);
		
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
		
		System.out.println("\n");
		segitiga.printInfo();
		System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
	}
}