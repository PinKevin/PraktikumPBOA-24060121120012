/*
	File      : Asersi2.java  01/04/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : program untuk menunjukkan asersi penolak input 
				jejari lingkaran bernilai 0
*/

class Lingkaran {
	private double jariJari;
	
	public Lingkaran (double jariJari) {
		this.jariJari = jariJari;
	}
	
	public double hitungKeliling() {
		double keliling = 2 * Math.PI * jariJari;
		return keliling;
	}
}

public class Asersi2 {
	public static void main(String[] args) {
		double jariJari = 0;
		assert (jariJari > 0): "jari jari tidak boleh nol!!!";
		Lingkaran lingkaran = new Lingkaran(jariJari);
		double kelilingLingkaran = lingkaran.hitungKeliling();
		System.out.println("Keliling lingkaran = " + kelilingLingkaran);
	}
}