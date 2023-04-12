public class Barang {
    private String id;
	private String nama;
	private int stok;

    public Barang(String id, String nama, int stok) {
        this.id = id;
		this.nama = nama;
		this.stok = stok;
    }

	public String getId() {
		return this.id;
	}
	
	public String getNama() {
		return this.nama;
	}

    public int getStok() {
		return this.stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}

    public void kurangiStok(int jumlah) {
        this.setStok(this.getStok() - jumlah);
    }
}