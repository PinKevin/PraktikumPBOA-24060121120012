public class RKelas extends Ruang {
	private int jumlahKursiBaik;
	private int jumlahKursiRusak;
	private static int counterRuangKelas;
	
	public RKelas(String kode, int panjang, int lebar, int tinggi, int kapasitas, int jumlahKursiBaik, int jumlahKursiRusak) {
		super(kode, panjang, lebar, tinggi, kapasitas);
		this.jumlahKursiBaik = jumlahKursiBaik;
		this.jumlahKursiRusak = jumlahKursiRusak;
		counterRuangKelas++;
	}
	
	public static int getCounterRuangKelas() {
		return counterRuangKelas;
	}
	
	public void info() {
		printInfo();
		System.out.println(jumlahKursiBaik);
		System.out.println(jumlahKursiRusak);
		System.out.println(getCounterRuangKelas());
	}
}