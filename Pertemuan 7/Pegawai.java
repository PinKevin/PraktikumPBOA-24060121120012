/*
	File      : Pegawai.java  14/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas parent pegawai
*/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) { this.nama = nama; }

    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
    }
}
