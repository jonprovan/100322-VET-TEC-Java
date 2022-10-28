package day05;

public abstract class Organism implements MovingThing {
	
	private boolean alive;
	
	public Organism() {
		super();
	}
	
	public Organism(boolean alive) {
		super();
		this.alive = alive;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "Organism [alive=" + alive + "]";
	}
	
	

}
