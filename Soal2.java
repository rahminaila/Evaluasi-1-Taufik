package bcgen9.day12;

import java.util.Scanner;

public class Soal2 {
	Scanner s= new Scanner(System.in);
	int n;
	int[] arrKacamata;
	int[] arrBaju;
	int[][] gabungan;
	int hasil;
	public int getUangAndi() {
		System.out.println("Masukkan uang Andi: ");
		this.n = s.nextInt();
		return n;
	}
	public int[] arrayKacamata() {
		System.out.println("Masukkan 3 harga kacamata: ");
		this.arrKacamata = new int[3];
		for(int i=0; i<3; i++) {
			arrKacamata[i] = s.nextInt();
		}
		return arrKacamata;
	}
	public int[] arrayBaju() {
		System.out.println("Masukkan 3 harga baju: ");
		this.arrBaju = new int[3];
		for(int i=0; i<3; i++) {
			arrBaju[i] = s.nextInt();
		}
		return arrBaju;
	}
	public void tampungArray() {
		arrayKacamata();
		arrayBaju();
		int [][] gabungan = new int[3][2];
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(j==0) {
					gabungan[i][0]=arrKacamata[i];
				} else {
					gabungan[i][1]=arrBaju[i];
				}
			
			System.out.print(gabungan[i][j]);
			}
			System.out.println();
		}
	}
	public void sum() {
		tampungArray();
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				int hasil = gabungan[i][0]+ gabungan[i][0];
				System.out.println(hasil);
			}
		}
		
	}
	public void hitung() {
		arrayKacamata();
		arrayBaju();
		int a=0;
		int nilai=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				this.hasil = arrKacamata[a] +arrBaju[j]; 
				if (hasil <= n && hasil > nilai) {
					nilai=hasil;
				}				
			}
			a=a+1;	
		}
		if (nilai <= n && nilai > 0) {
			System.out.println("Uang yang dapat dibelanjakan= " + nilai);
		} else {
			System.out.println("Uang anda tidak cukup");
		}
	}
		
	
	public void print() {
		getUangAndi();
		hitung();
	}
	
	public static void main(String[] args) {
		Soal2 run = new Soal2();
		run.print();
	}


}
