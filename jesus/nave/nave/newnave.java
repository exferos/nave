package nave;

public class newnave {

	int posx;
	int posy;
	int vida;
	int velocidad;
	int defensa;
	
	newnave(){
		this.posx=(int) (Math.random()*100);
		this.posy=(int) (Math.random()*100);
		this.vida=10000;
		this.defensa=500;
		this.velocidad=100;
	}
	
	
	
	public String toString(){
		return (vida+" "+defensa+" "+velocidad+" "+ posx+" "+posy);
	}
	//void pausa(){
		//try {
			//Thread.sleep(2000);
		//} catch (InterruptedException e) {
			//e.printStackTrace();
		//}
	//}
	
	public int getPosx() {return posx;}

	public void setPosx(int posx) {this.posx = posx;}

	public int getPosy() {return posy;}

	public void setPosy(int posy) {this.posy = posy;}

	public int getVida() {return vida;}

	public void setVida(int vida) {this.vida = vida;}
	
	
}
