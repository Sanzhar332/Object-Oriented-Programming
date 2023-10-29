package problem3;

public class Bishop extends Piece{
	public Bishop() {}
	public Bishop(char x, int y,String color) {
		super(new Position(x,y),color);
	}
	public boolean isLegalMove(Position a, Position b) {
		if(a.getPositionX()==b.getPositionX()) return true;
		if(a.getPositionY()==b.getPositionY()) return true;
		return false;
	}
	
	
}
