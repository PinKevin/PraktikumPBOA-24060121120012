import java.util.ArrayList;

public class KoleksiPenumpang <T extends Kendaraan> {
    public ArrayList<T> NIK;
    public String namaPenumpang;

    public KoleksiPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
        this.NIK = new ArrayList<>();
    }

    public ArrayList<T> getNIK () {
        return this.NIK;
    }

    public void addNIK (T kendaraan) {
        this.NIK.add( kendaraan );
    }
}
