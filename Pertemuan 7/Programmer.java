/*
	File      : Manajer.java  14/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas child programmer
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
