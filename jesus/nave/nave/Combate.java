package nave;

public class Combate {
	int dmgrealizado;
	
	int damagerealizado(){
		if (newnavetest.r2==congelante&&newnavetest.r1==goliath){
			int damagerealizado=(int) (Math.random()*(250-100)+1)+100;
			dmgrealizado=(dmgrealizado*2)/defensa;
		}else if(municion==electrica&&nave==spheed){
			int damagerealizado=(int) (Math.random()*(250-100)+1)+100;
			dmgrealizado=(dmgrealizado*2)/defensa;
		}else if(municion==corrosiva&&nave==vengance){
			int damagerealizado=(int) (Math.random()*(250-100)+1)+100;
			dmgrealizado=(dmgrealizado*2)/defensa;
		}else if(municion==explosiva&&nave==nostromo){
			int damagerealizado=(int) (Math.random()*(250-100)+1)+100;
			dmgrealizado=(dmgrealizado*2)/defensa;
		}
		return damagerealizado;
	}
	
}
