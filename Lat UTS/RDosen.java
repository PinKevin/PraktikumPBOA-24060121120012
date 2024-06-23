public class RDosen extends Ruang {
	private String namaDosen;
	private Integer jumlahKursi;
	private Integer jumlahMeja;
	private static int counterRuangDosen;
	
	public RDosen(String kode, int panjang, int lebar, int tinggi, int kapasitas) {
		super(kode, panjang, lebar, tinggi, kapasitas);
		counterRuangDosen++;
	}
	
	public RDosen(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaDosen, int jumlahKursi, int jumlahMeja) {
		super(kode, panjang, lebar, tinggi, kapasitas);
		this.namaDosen = namaDosen;
		this.jumlahKursi = jumlahKursi;
		this.jumlahMeja = jumlahMeja;
		counterRuangDosen++;
	}
	
	public static int getCounterRuangDosen() {
		return counterRuangDosen;
	}
	
	public boolean sudahDipakai() {
		if (namaDosen == null && jumlahKursi == null && jumlahMeja == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void info() {
		printInfo();
		if (sudahDipakai()) {
			System.out.println(namaDosen);
			System.out.println(jumlahKursi);
			System.out.println(jumlahMeja);
		}
		System.out.println(getCounterRuangDosen());
	}
}