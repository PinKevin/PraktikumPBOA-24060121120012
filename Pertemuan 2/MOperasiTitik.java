/*
	File      : MOperasiTitik.java  01/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : main untuk kelas operasi titik
*/


public class MOperasiTitik {
    public static void main(String[] args) {
        Titik titik;
		OperasiTitik ot;
		
		titik = new Titik(4.0, 4.0);
		ot = new OperasiTitik();
		
		System.out.println("titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
		
		ot.refleksiX(titik);
		System.out.println("titik setelah refleksi sb X: titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");

		ot.refleksiY(titik);
		System.out.println("titik setelah refleksi sb Y: titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
    }
} 
