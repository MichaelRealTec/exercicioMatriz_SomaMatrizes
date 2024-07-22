package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// somaMatrizes
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m,n;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		n = sc.nextInt();
		
		System.out.println("Digite os valores da matriz A: ");
		
		int[][] matrizA = new int[m][n];
		int[][] matrizB = new int[m][n];
		int[][] matrizSoma = new int[m][n];
		
		// Armazenando os valores na MatrizA
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				matrizA[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite os valores da matriz B: ");
		// Armazenando os valores na MatrizB
		for(int i = 0; i < matrizB.length; i++) {
			for(int j = 0; j < matrizB[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				matrizB[i][j] = sc.nextInt();
			}
		}
		System.out.print("MATRIZ SOMA: ");
		// Armazenando os valores na MatrizSoma
		for(int i = 0; i < matrizSoma.length; i++) {
			System.out.println();
			for(int j = 0; j < matrizSoma[i].length; j++) {
				matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.printf("%d ", matrizSoma[i][j]);
			}
		}
		
		sc.close();
	}

}
