/*
	File      : ExceptionOnArray  01/04/2023
	Penulis   : Emerio Kevin Aryaputra
	Deskripsi : program penggunaan eksepsi menggunakan class library Java
*/

public class ExceptionOnArray {
	public static void main(String[] args) {
		// instansi object array integer
		Integer[] arrayInteger = new Integer[4];
		try {
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		} catch (ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		} finally {
			System.out.println("clean up code...");
		}
	}
}