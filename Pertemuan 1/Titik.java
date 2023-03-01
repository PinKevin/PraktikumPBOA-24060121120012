/*
	Titik.java  22/02/2023
	Nama : Emerio Kevin Aryaputra
	NIM  : 24060121120012
	Deskripsi : kelas untuk titik
*/


class Titik {
    // atribut
    double absis;
    double ordinat;
	static int counterTitik;
    
    // method 
    Titik() {
		counterTitik++;
        absis = 0;
        ordinat = 0;
    }
	
	Titik(double a, double o) {
		counterTitik++;
		absis = a;
		ordinat = o;
	}
    
    void setAbsis(double a) {
        absis = a;
    }
    
    void setOrdinat(double o) {
        ordinat = o;
    }
    
    double getAbsis() {
        return absis;
    }
    
    double getOrdinat() {
        return ordinat;
    }
	
	int getCounterTitik() {
		return counterTitik;
	}
} 
