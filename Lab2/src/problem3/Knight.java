package problem3;

public class Knight extends Piece{
	public Knight() {}
	public Knight(char x, int y,String color) {
		super(new Position(x,y),color);
	}
	public boolean isLegalMove(Position a, Position b) {
		if(Math.abs(a.getPositionX()-b.getPositionX())==2 && Math.abs(a.getPositionY()-b.getPositionY())==1) return true;
		if(Math.abs(a.getPositionX()-b.getPositionX())==1 && Math.abs(a.getPositionY()-b.getPositionY())==2) return true;
		return false;
	}
	

}
