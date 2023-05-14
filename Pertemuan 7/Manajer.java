/*
	File      : Manajer.java  14/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas child manajer
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
