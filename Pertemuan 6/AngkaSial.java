/*
	File      : AngkaSial.java  01/04/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : program penggunaan eksepsi buatan sendiri,
				menolak masukan angka 13
				menngenal klausa 'throw' dan 'throws'
*/

public class AngkaSial {
	
	public void cobaAngka(int angka) throws AngkaSialException {
		if (angka == 13) {
			throw new AngkaSialException();
		}
		System.out.println(angka + " bukan angka sial");
	}
	
	public static void main(String[] args) {
		AngkaSial angkaSial = new AngkaSial();
		
		try {
			angkaSial.cobaAngka(10);
			angkaSial.cobaAngka(13);
			angkaSial.cobaAngka(12);
		} catch(AngkaSialException angkaSialException) {
			System.out.println(angkaSialException.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}