public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new SepedaMotor("H 1234 FF", "Adi");
        Kendaraan kendaraan2 = new Mobil5Kursi( "H 9988 JJ", "Bagas" );
        Kendaraan kendaraan3 = new Mobil7Kursi( "H 9898 KK", "Cut" );

        System.out.println(kendaraan1.getJumlahMaksPenumpang());

        KoleksiPenumpang koleksiPenumpang = new KoleksiPenumpang( "Jojo" );
        koleksiPenumpang.addNIK( kendaraan1 );
    }
}