/*
	File      : ArrayListTest.java  17/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : program penggunaan objek ArrayList dsebagai Collection class
*/

public class BangunDatarGenericTest {
    public static void main ( String[] args ) {
        Lingkaran l = new Lingkaran( 2 );
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set( l );
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());
    }
}
