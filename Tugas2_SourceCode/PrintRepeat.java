/* Nim : 13020210118
Nama : Savira Rahmadani Fs
Waktu : 20/3/2023 01.00 PM */

import java.util.Scanner;
public class PrintRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-genetarated method stub
		/* Kamus : */
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		/* Program */

		System.out.print  ("Nilai N >0 = ");
		/* Inisialisasi */
		N = masukan.nextInt();

		i = 1;
		/* First Elmt */
		System.out.print ("Print i dengan REPEAT: \n");
		do{
			System.out.print (i+"\n");  /* Proses */
			i++;  /* Next Elmt */
		}

		while (i <= N);  /* Kondisi pengulangan */
	}
}