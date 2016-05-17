package nave;

import java.util.Scanner;

public class Municion {

	private static String[] eleccion_municion={"congelante","explosiva","electrica","corrosiva"};
	
	public static void mostrarmunicion(){
		for(int i=0;i<eleccion_municion.length;i++){
			System.out.println(eleccion_municion[i]);
		}
	}
	
	public static String elegirmunicion(){
		int num;
		Scanner eleccion=new Scanner(System.in);
		System.out.println("Elige un numero del 1 al 4: ");
		num=eleccion.nextInt();
		switch(num){
			case 1:
				System.out.println("Tu eleccion a sido: "+eleccion_municion[0]);
				break;
			case 2:
				System.out.println("Tu eleccion a sido: "+eleccion_municion[1]);
				break;
			case 3:
				System.out.println("Tu eleccion a sido: "+eleccion_municion[2]);
				break;
			case 4:
				System.out.println("Tu eleccion a sido: "+eleccion_municion[3]);
				break;
			default:
				System.out.println("mala eleccion");
				break;
		}
		return(eleccion_municion[num]);
	}
	
}
