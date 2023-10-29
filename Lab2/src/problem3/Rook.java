package problem3;

public class Rook extends Piece{
	public Rook() {}
	public Rook(char x, int y,String color) {
		super(new Position(x,y),color);
	}
	public boolean isLegalMove(Position a, Position b) {
		if(Math.abs(a.getPositionX()-b.getPositionX())==Math.abs(a.getPositionY()-b.getPositionY())) return true;
		return false;
	}
	
}
