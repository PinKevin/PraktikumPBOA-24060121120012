/*
	File      : MKubus.java  15/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : main untuk kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
	public static void main(String[] args) {
		BujurSangkar persegi = new BujurSangkar(4);
		Kubus kubus = new Kubus(persegi);
		
		System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : " + kubus.hitungLuasAlas());
		System.out.println("\n");
		System.out.println("Volume Kubus dengan panjang sisi 4 satuan : " + kubus.hitungVolume());
	}
}