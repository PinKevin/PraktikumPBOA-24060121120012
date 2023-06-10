/*
	File      : LambdaList.java  31/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : implementasi lambda pada list,
	            digunakan sebagai parameter method
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main ( String[] args ) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add( "Adi" );
        mahasiswaList.add( "Bambang" );
        mahasiswaList.add( "Cici" );
        mahasiswaList.add( "Didi" );

        // lambda untuk parameter
        mahasiswaList.forEach( (nama) -> System.out.println(nama) );
    }
}
