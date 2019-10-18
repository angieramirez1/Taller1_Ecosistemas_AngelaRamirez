package Angela.Ramirez.Taller1;

import processing.core.PApplet;
import processing.core.PImage;

public class Jugador {
	//variable de posicion x, que depende del carril en que se encuentra el usuario
	private int posx;
	//variable de posicion y que sera fija
	private int y;
	//cantidad de vidas que posee cada jugador
	private int vidas;
	//imagen de jugador en 4 posiciones para generar animacion de movimiento
	private PImage jugadorPos1;
	private PImage jugadorPos2;
	private PImage jugadorPos3;
	private PImage jugadorPos4;
	//variable para implementar la libreria de processing
	private PApplet app;
	//variable correspondiente al carril en que el jugador se encuentra
	private int carril;
	//variable de los frames que permite generar la animacion
	private int frameActual = 0;
	//variable de frames implementados en la animacion
	private int frames = 4;
	//arreglo de las 4 imagenes por jugador
	private PImage[] jugador;
	public Jugador(PApplet app, int posx, int y, int vidas, PImage jugadorPos1, PImage jugadorPos2,PImage jugadorPos3,PImage jugadorPos4,int carril) {
		this.posx = posx;
		this.y = y;
		this.vidas = vidas;
		this.jugadorPos1 = jugadorPos1;
		this.jugadorPos2 = jugadorPos2;
		this.jugadorPos3 = jugadorPos3;
		this.jugadorPos4 = jugadorPos4;
		this.app = app;
		this.carril = carril;
		this.jugador = new PImage [frames];
		this.jugador[0] = jugadorPos1;
		this.jugador[1] = jugadorPos2;
		this.jugador[2] = jugadorPos3;
		this.jugador[3] = jugadorPos4;
	}

	public void pintar() {
		if(app.frameCount %3 == 0) {
		frameActual = (frameActual+1) % frames;
		}
		  int offset = 0;
		  for (int x = -10; x < app.width; x += jugador[0].width) { 
		    app.image(jugador[(frameActual+offset) % frames], posx, y,116,150);
		    offset+=2;
		  }
		
		//app.image(jugador, x, y);
		
	}

	public void moverJugador1() {
		if (app.key == app.CODED) {
			if (app.keyCode == app.UP && y >= 233) {
				y -= 42;
				carril--;
			}
			if (app.keyCode == app.DOWN && y < 313) {
				y += 42;
				carril++;
			}
		}
	}

	public void moverJugador2() {
		if (app.key == 'w' && y > 233) {
			y -= 42;
			carril--;
		}
		if (app.key == 's' && y < 313) {
			y += 42;
			carril++;
		}
	}
	
	public int getVidas() {
		return vidas;
	}

	public int getX() {
		return posx;
	}

	public void setX(int x) {
		this.posx = posx;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getCarril() {
		return carril;
	}

	public void setCarril(int carril) {
		this.carril = carril;
	}
	
	

}
