/*
	MTitik.java  22/02/2023
	Nama : Emerio Kevin Aryaputra
	NIM  : 24060121120012
	Deskripsi : main untuk kelas titik
*/


public class MTitik {
    public static void main(String[] args) {
        Titik t1, t2, t3;
		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5, 6);
		
		t1.setAbsis(1);
		t1.setOrdinat(2);
		t2.setAbsis(3);
		t2.setOrdinat(4);
		
		System.out.println("Banyak objek titik : " + t1.getCounterTitik());
		System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
		System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    }
}
