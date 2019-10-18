package Angela.Ramirez.Taller1;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemigo {
	private int x;
	private int y;
	private PImage imagen;
	private PApplet app;
	private int carril;
	
	public Enemigo(PApplet app, int x, int y, PImage imagen, int carril) {
		
		this.x = x;
		this.y = y;
		this.imagen = imagen;
		this.app = app;
		this.carril = carril;
	}
	public void pintarEnemigo() {
		app.image(imagen,x,y);
	}
	public void mover() {
		x-=3;
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
	public int getCarril() {
		return carril;
	}
	public void setCarril(int carril) {
		this.carril = carril;
	}
	
	
}
