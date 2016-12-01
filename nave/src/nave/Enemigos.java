package nave;

public class Enemigos {
	
	/*las stats las puedo hacer igual que las de la nave
	 * cada ronda que gana la nave el siguiente enemigo se hace mas fuerte
	 * cuando acaba una ronda y la nave a ganado recupera un 25-75 % de la vida que le falta
	 */
	
	private static String[] aEnemigos={"gusano","elefante","avispa","leon"};
	private int vida;
	private int velocidad;
	private int defensa;
	private String tipo;
	
	Enemigos(){
		int rnd = (int) (Math.random()*4);
		tipo = aEnemigos[rnd];
		
		if(tipo.equals("gusano")) {
			vida = 1000;
			defensa = 50;
			velocidad = 100;
		} else if(tipo.equals("elefante")) {
			vida = 3000;
			defensa = 150;
			velocidad = 50;
		} else if(tipo.equals("avispa")) {
			vida = 1500;
			defensa = 75;
			velocidad = 175;
		} else if(tipo.equals("leon")) {
			vida = 2500;
			defensa = 125;
			velocidad = 250;
		}
	}

	public String toString(){
		return (vida+" "+defensa+" "+velocidad);
	}
	
	public String getTipo() {return tipo;}

	public void setTipo(String tipo) {this.tipo = tipo;}

	public int getVida() {return vida;}

	public void setVida(int vida) {this.vida = vida;}

	public int getVelocidad() {return velocidad;}

	public void setVelocidad(int velocidad) {this.velocidad = velocidad;}

	public int getDefensa() {return defensa;}

	public void setDefensa(int defensa) {this.defensa = defensa;}
	
	
}
