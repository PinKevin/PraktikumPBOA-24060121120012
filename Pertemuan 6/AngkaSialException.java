/*
	File      : AngkaSialException.java  01/04/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : program penggunaan eksepsi buatan sendiri,
				menolak masukan angka 13
*/

public class AngkaSialException extends Exception{
	public AngkaSialException () {
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}