package problem3;

public abstract class Piece {
	private Position a;
	Color color;
	public Piece() {}
	public Piece(Position a,String color) {
		this.a=a;
		if(color.equals("white")) this.color=Color.WHITE;
		else if(color.equals("black")) this.color=Color.BLACK;
		else this.color=Color.NULL;
	}
	public void setStartPosition(Position a) {
		this.a=a;
	}
	public void setColor(Color color) {
		this.color=color;
	}
	public Color getColor() {
		return color;
	}
	public Position getPosition() {
		return a;
	}
	public boolean equals(Object o) {
		if(this==o) return true;
		if(!(o instanceof Piece)) return false;
		Piece p = (Piece) o;
		if(!(this.color.equals(p.getColor()))) return false;
		return this.getPosition().equals(p.getPosition());
	}
	public abstract boolean isLegalMove(Position a,Position b);
	
}
