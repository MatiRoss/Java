package demenagement;

public class main {

	public static void main(String[] args) {
		int local = 34;
		int camion = 0;
		int newLocal = 0;
		
		while (local != 0) {
			local = local -1;
			camion = camion +1;
			newLocal = newLocal +1;
			if (camion == 9) {
				System.out.println("Un voyage de " + camion + " cartons");
				camion = 0;
			}
			
		}
		
		System.out.println("Un voyage de " + camion + " cartons");

	}

}
