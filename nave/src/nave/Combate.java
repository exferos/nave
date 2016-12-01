package nave;

public class Combate {
	private newnave nave;
	private Enemigos enemigo;
	
	Combate(newnave nave, Enemigos enem) {
		this.nave = nave;
		this.enemigo = enem;	
	}
	
	int damagerealizado(){
		int dmgrealizado = 0;
		if(nave.getMunicion().equals("congelante") && nave.getTipo().equals("goliath")) {
			int damagerealizado=(int) (Math.random()*(25000-10000)+1)+10000;
			dmgrealizado=(damagerealizado*3)/enemigo.getDefensa();
		} else if(nave.getMunicion().equals("electrica") && nave.getTipo().equals("spheed")){
			int damagerealizado=(int) (Math.random()*(25000-10000)+1)+10000;
			dmgrealizado=(int) ((damagerealizado*0.5)/enemigo.getDefensa());
		} else if(nave.getMunicion().equals("corrosiva") && nave.getTipo().equals("vengance")){
			int damagerealizado=(int) (Math.random()*(25000-1000)+1)+10000;
			dmgrealizado=(int) ((damagerealizado*2.5)/enemigo.getDefensa());
		} else if(nave.getMunicion().equals("explosiva") && nave.getTipo().equals("nostromo")){
			int damagerealizado=(int) (Math.random()*(25000-10000)+1)+10000;
			dmgrealizado=(int) ((damagerealizado*1.5)/enemigo.getDefensa());
		} else{
			int damagerealizado=(int) (Math.random()*(25000-10000)+1)+10000;
			dmgrealizado=(damagerealizado*2)/nave.getDefensa();
		}
		
		return dmgrealizado;
	}
	
	int damageEnemigorealizado(){
		int dmgrealizadoEnemi=0;
		if(enemigo.getTipo().equals("gusano") && nave.getMunicion().equals("corrosiva")){
			int damagrealizadoEnemi=(int)(Math.random()*(10000-2000)+2000);
			dmgrealizadoEnemi=(int) ((damagrealizadoEnemi*1.5)/nave.getDefensa());
		}else if(enemigo.getTipo().equals("elefante") && nave.getMunicion().equals("congelante")){
			int damagrealizadoEnemi=(int)(Math.random()*(10000-2000)+2000);
			dmgrealizadoEnemi=(int) ((damagrealizadoEnemi*0.5)/nave.getDefensa());
		}else if(enemigo.getTipo().equals("leon") && nave.getMunicion().equals("electrica")){
			int damagrealizadoEnemi=(int)(Math.random()*(10000-2000)+2000);
			dmgrealizadoEnemi=(int) ((damagrealizadoEnemi*1.5)/nave.getDefensa());
		}else if(enemigo.getTipo().equals("avispa") && nave.getMunicion().equals("explosiva")){
			int damagrealizadoEnemi=(int)(Math.random()*(10000-2000)+2000);
			dmgrealizadoEnemi=(int) ((damagrealizadoEnemi*0.5)/nave.getDefensa());
		}else{
			int damagerealizado=(int) (Math.random()*(25000-10000)+1)+10000;
			dmgrealizadoEnemi=(damagerealizado*2)/nave.getDefensa();
		}
		
		return dmgrealizadoEnemi;
	}
	
	String vidaPerdidaNave(){
		nave.setVida(nave.getVida()-damageEnemigorealizado());
		return ("daño del enemigo: " + (damageEnemigorealizado()));
	}
	
	String vidaPerdidaEnem(){
		enemigo.setVida(enemigo.getVida()-damagerealizado());
		return("daño de la nave: "+ (damagerealizado()));
	}
	
}
