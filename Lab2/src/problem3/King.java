package problem3;

public class King extends Piece{
	public King() {}
	public King(char x, int y,String color) {
		super(new Position(x,y),color);
	}
	public boolean isLegalMove(Position a, Position b) {
		if(Math.abs(a.getPositionX()-b.getPositionX())==1 && Math.abs(a.getPositionY()-b.getPositionY())==1 ) return true;
		return false;
	}
	


}
