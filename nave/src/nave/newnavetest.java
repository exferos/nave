package nave;

import java.util.Scanner;

public class newnavetest {
	public static void main(String[] args) {
		String r1;
		String r2;
		int ronda=1;
		Navex.mostrarnaves();
		System.out.println("");
		Scanner leerteclado=new Scanner(System.in);
		r1=Navex.elegirnave();
		System.out.println("");
		Municion.mostrarmunicion();
		System.out.println("");
		r2=Municion.elegirmunicion();
		newnave n1=new newnave(r1, r2);
		Enemigos enem=new Enemigos();
		
		do{
			
			
			System.out.println("!!!RONDA "+ ronda + "!!!!");
			
			Combate combate = new Combate(n1, enem);
			System.out.println("");
			System.out.println("Nave: "+r1);
			System.out.println(n1.toString());
			
			System.out.println("");
			System.out.println("Enemigo: "+enem.getTipo());
			System.out.println(enem.toString());
			
//			combate.damagerealizado();
//			System.out.println("");
//			System.out.println(combate.damagerealizado());
			System.out.println("");
			System.out.println(combate.vidaPerdidaEnem());
			System.out.println(combate.vidaPerdidaNave());
//			newnave.pausa();
			
			
			
			if (enem.getVida()<=0){
				enem= new Enemigos();
				if(ronda%2==0||ronda%3==0){Mejoras.mejoraEnemigo(ronda, enem); Mejoras.mejoraNave(ronda, n1);}
				ronda++;
			}
			
		}while (n1.getVida()>=0);
		
		System.out.println("GAME OVER!!!!!!!!!!");
			
	}
}