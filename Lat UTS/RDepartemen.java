public class RDepartemen extends Ruang {
	private String namaDepartemen;
	private String ketuaDepartemen;
	private static int counterRuangDepartemen;
	
	public RDepartemen(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaDepartemen, String ketuaDepartemen) {
		super(kode, panjang, lebar, tinggi, kapasitas);
		this.namaDepartemen = namaDepartemen;
		this.ketuaDepartemen = ketuaDepartemen;
		counterRuangDepartemen++;
	}
	
	public static int getCounterRuangDepartemen() {
		return counterRuangDepartemen;
	}
	
	public void info() {
		printInfo();
		System.out.println(namaDepartemen);
		System.out.println(ketuaDepartemen);
		System.out.println(getCounterRuangDepartemen());
	}
}