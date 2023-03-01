/*
	File      : MOperasiTitik.java  01/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : main untuk kelas operasi titik
*/


public class MOperasiTitik {
    public static void main(String[] args) {
        Titik titik;
		OperasiTitik OT;
		
		titik = new Titik(4.0, 4.0);
		OT = new OperasiTitik();
		
		System.out.println("titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
		
		OT.refleksiX(titik);
		System.out.println("titik setelah refleksi sb X: titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");

		OT.refleksiY(titik);
		System.out.println("titik setelah refleksi sb Y: titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
    }
} 
