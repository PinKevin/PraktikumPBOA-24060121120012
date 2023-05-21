/*
	File      : MapTest.java  17/05/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : program penggunaan generic untuk
	            pasangan kunci nilai
*/

import com.sun.security.jgss.InquireType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main ( String[] args ) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // menempatkan elemen kunci dan nilai
        map.put( 1, "satu" );
        map.put( 2, "dua" );

        // mengambil elemen pertama
        System.out.println(map.get( 1 ));

        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();

        // iterasi untuk mengambil keseluruhan nilai dari kunci
        for (Integer k : key) {
            String value = map.get(k);
            System.out.println("Kunci : " + k + ", nilai : " + value);
        }
    }
}
