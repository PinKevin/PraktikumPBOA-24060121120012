public class Kendaraan {
    protected String noPlatKendaraan;
    protected String namaPengendara;
    protected int jumlahMaksPenumpang;

    public Kendaraan(String noPlatKendaraan, String namaPengendara, int jumlahMaksPenumpang) {
        this.noPlatKendaraan = noPlatKendaraan;
        this.namaPengendara = namaPengendara;
        this.jumlahMaksPenumpang = jumlahMaksPenumpang;
    }

    public String getNoPlatKendaraan () {
        return noPlatKendaraan;
    }

    public void setNoPlatKendaraan ( String noPlatKendaraan ) {
        this.noPlatKendaraan = noPlatKendaraan;
    }

    public String getNamaPengendara () {
        return namaPengendara;
    }

    public void setNamaPengendara ( String namaPengendara ) {
        this.namaPengendara = namaPengendara;
    }

    public int getJumlahMaksPenumpang () {
        return jumlahMaksPenumpang;
    }

    public void setJumlahMaksPenumpang ( int jumlahMaksPenumpang ) {
        this.jumlahMaksPenumpang = jumlahMaksPenumpang;
    }
}
