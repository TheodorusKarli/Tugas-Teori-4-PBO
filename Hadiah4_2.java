//Theodorus Karli
//51019020
import java.util.Scanner;

class siswa {
	String nama;
	String jurusan;
	String nim;
	
		void setnama(String namasiswa)
		{
			nama = namasiswa;
		}
		
		void setjurusan(String jurusansiswa)
		{
			jurusan = jurusansiswa;
		}
		
		void setnim(String nimsiswa)
		{
			nim = nimsiswa;
		}
		
		void cetak(){
			
			System.out.println("Nama saya adalah " + nama + ", Jurusan saya adalah " + jurusan + ", dan Nim saya adalah " + nim);
			
		}
}



public class Hadiah4_2 {
	
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		
		String name, major, idnumber;
		
		//Proses Instansiasi Objeck data 
		siswa data = new siswa();
		//Proses Instansiasi Objeck data 
		
		
		System.out.println("Aplikasi Latihan 1 dengan Proses Pengimputan");
		System.out.println();
		
		//Proses Input data untuk Aplikasi Latihan 1
		System.out.print("Masukkan Nama anda : ");
		name = input.nextLine();
		data.setnama(name);
		System.out.println();
		System.out.print("Masukkan Jurusan anda : ");
		major = input.nextLine();
		data.setjurusan(major);
		System.out.println();
		System.out.print("Masukkan Nim anda : ");
		idnumber = input.nextLine();
		data.setnim(idnumber);
		System.out.println();
		data.cetak();
		
		
	}
}