/* Nim : 13020210118
Nama : Savira Rahmadani Fs
Waktu : 20/3/2023 02.00 PM */

import java.util.Scanner;

/* Baca N, */
/* print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus : */
		int N;
		int i = 1;
		Scanner masukan=new Scanner(System.in);
		/* Program */

		System.out.print ("Nilai N >0 = ");
		N = masukan.nextInt();
		System.out.print ("Print i dengan WHILE (ringkas): \n");
		while (i <= N) {
			System.out.println (i++);
		}  /* (i > N) */
	}
}