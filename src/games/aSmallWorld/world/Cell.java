package games.aSmallWorld.world;


public class Cell {


	//Variables
	private int x;
	private int y;


	//Constructeur
	public Cell(int x, int y){
		this.x=x;
		this.y=y;
	}


	//Getters et Setters
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


}
