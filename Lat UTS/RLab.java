public class RLab extends Ruang {
	protected String namaLab;
	protected int hargaSewa;
	private static int counterRuangLaboratorium;
	
	public RLab(String kode, int panjang, int lebar, int tinggi, int kapasitas, String namaLab, int hargaSewa) {
		super(kode, panjang, lebar, tinggi, kapasitas);
		this.namaLab = namaLab;
		this.hargaSewa = hargaSewa;
		counterRuangLaboratorium++;
	}
	
	public static int getCounterRuangLaboratorium() {
		return counterRuangLaboratorium;
	}
	
	public void info() {
		printInfo();
		System.out.println(namaLab);
		System.out.println(hargaSewa);
		System.out.println(getCounterRuangLaboratorium());
	}
}