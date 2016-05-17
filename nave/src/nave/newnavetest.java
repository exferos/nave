package nave;

import java.util.Scanner;

public class newnavetest {
	public static void main(String[] args) {
		String r1;
		String r2;
		Navex.mostrarnaves();
		System.out.println("");
		Scanner leerteclado=new Scanner(System.in);
		r1=Navex.elegirnave();
		System.out.println("");
		Municion.mostrarmunicion();
		System.out.println("");
		r2=Municion.elegirmunicion();
		
		nave n1=new nave();
		System.out.println("");
		System.out.println("Nave: "+r1);
		System.out.println(n1.toString());
	}
}