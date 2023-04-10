public class MBarang {
    public static void beliBarang(Barang barang, int jumlah) throws StokException {
        if (jumlah > barang.getStok()) {
            throw new StokException(barang);
        } else {
			barang.kurangiStok(jumlah);
            System.out.println("Anda berhasil membeli " + jumlah + " " + barang.getNama() + ".");
        }
    }
    
    public static void main(String[] args) {
		/* note : tiap objek Barang barang diubah berdasarkan case
		   barang baris 1 = case 1
		   barang baris 2 = case 2
		*/
		
        Barang barang = new Barang("B001", "Celana", 10);
		// Barang barang = new Barang("B002", "Baju", 16);
        try {
            MBarang.beliBarang(barang, 15);
        } catch (StokException eksepsi) {
            System.out.println(eksepsi.getMessage());
			System.out.println("Mohon maaf, stok barang tidak mencukupi.");
        }
    }
}
