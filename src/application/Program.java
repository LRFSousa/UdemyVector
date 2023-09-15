package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double media=0.0;
		int[] vect = new int[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.printf("Digite o %d° numero: ",i+1);
			vect[i] = sc.nextInt();
			if(vect[i] %2 == 0) {
				media+=(double)vect[i];
			}
		}
		media=(media/n);
		if(media != 0.0) {
			System.out.printf("MEDIA DOS PARES = %.1f",media);
		}
		else {
			System.out.println("NENHUUM NUMERO PAR");
		}
		
		sc.close();

	}

}
