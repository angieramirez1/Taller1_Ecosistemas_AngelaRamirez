package Angela.Ramirez.Taller1;

import processing.core.PApplet;
import processing.core.PImage;

public class Objeto {
	//posicion en el eje x del objeto
	private int x;
	//posicion en el eje y
	private int y;
	//puntos que otorga el objeto que se sumaran a cada personaje
	private int puntaje;
	//imagen correspondiente al dulce
	private PImage imagen;
	//Variable libreria de processing
	private PApplet app;
	//Carril en el cual el objeto es generado
	private int carril;

	public Objeto(PApplet app, int x, int y, PImage imagen, int carril) {
		this.x = x;
		this.y = y;
		this.imagen = imagen;
		this.app = app;
		this.carril = carril;
	}

	public void pintarObjeto() {
		app.image(imagen, x, y);
	}

	public void moverObjeto() {
		x-=2;
	}

	public void pintarPuntaje1() {
		app.textSize(24);
		app.text(puntaje, 163, 60);
	}

	public void pintarPuntaje2() {
		app.textSize(24);
		app.text(puntaje, 302, 60);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public int getCarril() {
		return carril;
	}

	public void setCarril(int carril) {
		this.carril = carril;
	}
}