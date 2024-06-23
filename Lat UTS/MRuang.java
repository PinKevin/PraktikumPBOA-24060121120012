public class MRuang {
	public static void main(String[] args) {
		RDepartemen rd1 = new RDepartemen("FSM3", 5, 10, 5, 20, "IF", "APW");
		RKelas rk1 = new RKelas("K102", 6, 8, 6, 60, 55, 5);
		RDosen rdos1 = new RDosen("FSM20", 2, 3, 4, 2, "PWW", 2, 2);
		RDosen rdos2 = new RDosen("FSM21", 2, 3, 4, 2);
		RLabKom rlk1 = new RLabKom("LIF1", 8, 10, 6, 50, "Lab Komputer B", 50);
		RLabNonKom rlnk1 = new RLabNonKom("LB1", 7, 8, 6, 40, "Lab Biologi A", 3);
		RLabNonKom rlnk2 = new RLabNonKom("LK1", 7, 9, 6, 35, "Lab Kimia C", 6);
		
		rd1.info();
		System.out.println("\n");
		rk1.info();
		System.out.println("\n");
		rdos1.info();
		System.out.println("\n");
		rdos2.info();
		System.out.println("\n");
		rlk1.info();
		System.out.println("\n");
		rlnk1.info();
		System.out.println("\n");
		rlnk2.info();
		
		System.out.println("\nJumlah ruang");
		System.out.println("Ruang = " + Ruang.getCounterRuang());
		System.out.println("Ruang Departemen = " + RDepartemen.getCounterRuangDepartemen());
		System.out.println("Ruang Kelas = " + RKelas.getCounterRuangKelas());
		System.out.println("Ruang Dosen = " + RDosen.getCounterRuangDosen());
		System.out.println("Ruang Lab = " + RLab.getCounterRuangLaboratorium());
		System.out.println("Ruang Lab Komputer = " + RLabKom.getCounterRuangLabKom());
		System.out.println("Ruang Lab Non Komputer = " + RLabNonKom.getCounterRuangLabNonKom());
	}
}