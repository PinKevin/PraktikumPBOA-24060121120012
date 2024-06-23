public class RLabNonKom extends RLab {
	private int jumlahMataKuliah;
	private static int counterRuangLabNonKom;
	
	public RLabNonKom(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaLab, int jumlahMataKuliah) {
		super(kode, panjang, lebar, tinggi, kapasitas, namaLab, jumlahMataKuliah * 1120012);
		counterRuangLabNonKom++;
	}
	
	public static int getCounterRuangLabNonKom() {
		return counterRuangLabNonKom;
	}
	
	public void info() {
		printInfo();
		System.out.println(namaLab);
		System.out.println(hargaSewa);
		System.out.println(getCounterRuangLabNonKom());
	}
}