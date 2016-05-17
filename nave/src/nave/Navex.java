package nave;

import java.util.Scanner;

public class Navex{
	
	private static String[] eleccion_nave={"vengance","goliath","nostromo","spheed"};
	
	public static void mostrarnaves(){
		for(int i=0;i<eleccion_nave.length;i++){
			System.out.println(eleccion_nave[i]);
		}
	}
	
	public static String elegirnave(){
		int num;
		Scanner eleccion=new Scanner(System.in);
		System.out.println("Elige un numero del 1 al 4: ");
		num=eleccion.nextInt();
		switch(num){
			case 1:
				System.out.println("Tu eleccion a sido: "+eleccion_nave[0]);
				break;
			case 2:
				System.out.println("Tu eleccion a sido: "+eleccion_nave[1]);
				break;
			case 3:
				System.out.println("Tu eleccion a sido: "+eleccion_nave[2]);
				break;
			case 4:
				System.out.println("Tu eleccion a sido: "+eleccion_nave[3]);
				break;
			default:
				System.out.println("mala eleccion");
				break;
		}
		return(eleccion_nave[num-1]);
	}
	
}
