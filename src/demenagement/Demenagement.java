package demenagement;

import java.util.Scanner;

public class Demenagement {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saisir le nombre de cartons");
		int local = clavier.nextInt();
		
		int capaciteCamion = 9;
		int camion = 0;
		int newLocal = 0;
		clavier.close();
		
		while (local != 0) {
			local = local -1;
			camion = camion +1;
			newLocal = newLocal +1;
			if (camion == capaciteCamion) {
				System.out.println("Un voyage de " + camion + " cartons");
				camion = 0;
			}
			
		}
		
		System.out.println("Un voyage de " + camion + " cartons");
		System.out.println("L'ancien local contient " + local + " cartons");
		System.out.println("Le nouveau local contient " + newLocal + " cartons");

	}

}
