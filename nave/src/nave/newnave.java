package nave;

public class newnave {

	private int vida;
	private int velocidad;
	private int defensa;
	private String tipo;
	private String municion;
	
	newnave(String tipo, String municion){
		if(tipo.equals("vengance")) {
			vida = 10000;
			defensa = 350;
			velocidad = 150;
		} else if(tipo.equals("goliath")) {
			vida = 15000;
			defensa = 500;
			velocidad = 25;
		} else if(tipo.equals("nostromo")) {
			vida = 7500;
			defensa = 300;
			velocidad = 100;
		} else if(tipo.equals("spheed")) {
			vida = 5000;
			defensa = 250;
			velocidad = 300;
		}
		this.tipo = tipo;
		this.municion = municion;
	}
	
	
	
	public String toString(){
		return (vida+" "+defensa+" "+velocidad);
	}
	
	static void pausa(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getVida() {return vida;}

	public void setVida(int vida) {this.vida = vida;}
	
	public int getDefensa() { return defensa; }
	
	public String getTipo() { return tipo; }
	
	public String getMunicion() { return municion; }

	public void setDefensa(int defensa) {this.defensa = defensa;}



}
