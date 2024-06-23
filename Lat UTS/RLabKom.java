public class RLabKom extends RLab {
	private int jumlahKomputer;
	private static int counterRuangLabKom;
	
	public RLabKom(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaLab, int jumlahKomputer) {
		super(kode, panjang, lebar, tinggi, kapasitas, namaLab, jumlahKomputer * 120012);
		counterRuangLabKom++;
	}
	
	public static int getCounterRuangLabKom() {
		return counterRuangLabKom;
	}
	
	public void info() {
		printInfo();
		System.out.println(namaLab);
		System.out.println(hargaSewa);
		System.out.println(getCounterRuangLabKom());
	}
}