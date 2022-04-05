package com.loiane.cursoJava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = tempDia001;
		temperaturas[1] = tempDia002;
		temperaturas[2] = tempDia003;
		temperaturas[3] = tempDia004;
		temperaturas[4] = tempDia005;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for (int i=0; i<temperaturas.length; i++){
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		for (double temp : temperaturas){
			System.out.println(temp);
		}
	}

}
