public abstract class Ruang {
	protected String kode;
	protected int panjang;
	protected int lebar;
	protected int tinggi;
	protected int kapasitas;
	protected static int counterRuang;
	
	public Ruang(String kode, int panjang, int lebar, int tinggi, int kapasitas) {
		this.kode = kode;
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		this.kapasitas = kapasitas;
		counterRuang++;
	}
	
	public static int getCounterRuang() {
		return counterRuang;
	}
	
	public int hitungBiayaKebersihan() {
		return panjang * lebar * tinggi * 500 * 12; 
	}
	
	public abstract void info();
	
	public void printInfo() {
		System.out.println(kode);
		System.out.println(panjang);
		System.out.println(lebar);
		System.out.println(tinggi);
		System.out.println(kapasitas);
		System.out.println(hitungBiayaKebersihan());
		System.out.println(getCounterRuang());
	}
}