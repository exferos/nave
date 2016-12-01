package nave;

import java.util.Scanner;

public class Mejoras {
	
	public static void mejoraEnemigo(int ronda, Enemigos enem){
		if (ronda%2==0){
			enem.setVida(enem.getVida()+(500*ronda));
			enem.setDefensa(enem.getDefensa()+(2*ronda));
		}
	}
	
	public static void mejoraNave(int ronda, newnave n1){
		int eleccion;
		if (ronda%3==0){
			System.out.println("Elige una mejora: ");
			System.out.println("1. Vida");
			System.out.println("2. Daño");
			System.out.println("3. Defensa");
			
			Scanner leerteclado=new Scanner(System.in);
			eleccion=leerteclado.nextInt();
			
			switch (eleccion) {
			case 1:
				System.out.println("La vida de tu nave a sido mejorada.");
				n1.setVida(n1.getVida()+5000);
				break;
			case 2:
				System.out.println("El daño de tu nave a sido mejorado.");
				//falta mejora del daño
				break;
			case 3:
				System.out.println("La defensa de tu nave a sido mejorada.");
				n1.setDefensa(n1.getDefensa()+20);
				break;
			default:
				break;
			}
			
		}
	}
	
}
