public class StokException extends Exception {
    public StokException(Barang barang) {
        super("Stok barang " + barang.getNama() + " (" + barang.getId() + ") tidak cukup!" );
    }
}

