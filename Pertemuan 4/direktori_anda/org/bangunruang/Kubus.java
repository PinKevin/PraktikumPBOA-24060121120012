/*
	File      : Kubus.java  15/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas untuk kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar permukaan;
		
	public Kubus(BujurSangkar permukaan) {
		this.permukaan = permukaan;
	}
	
	public double hitungVolume() {
		return this.hitungLuasAlas() * permukaan.getPanjangSisi();
	}
	
	public double hitungLuasAlas() {
		return permukaan.hitungLuas();
	}
}