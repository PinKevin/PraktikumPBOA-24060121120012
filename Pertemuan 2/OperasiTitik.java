/*
	File      : OperasiTitik.java  01/03/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : kelas untuk operasi titik
*/


public class OperasiTitik {
    // atribut
    
    // method 
    private void refleksiSumbuX(Titik titik) {
		titik.setOrdinat((-1)*titik.getOrdinat());
    }
	
	private void refleksiSumbuY(Titik titik) {
		titik.setAbsis((-1)*titik.getAbsis());
    }
	
	public void refleksiX(Titik t) {
		this.refleksiSumbuX(t);
	}
	
	public void refleksiY(Titik t) {
		this.refleksiSumbuY(t);
	}
} 
