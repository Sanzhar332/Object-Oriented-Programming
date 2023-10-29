package problem3;

public class Pawn extends Piece{
	public Pawn() {}
	public Pawn(char x, int y,String color) {
		super(new Position(x,y),color);
		
	}
	public Pawn(Position a,String color) {
		super(a,color);
	}
	public boolean isLegalMove(Position a, Position b) {
		if(super.getColor().equals(Color.WHITE)) {
			if(a.getPositionY()==2 && b.getPositionY()==4 && a.getPositionX()==b.getPositionX()) return true;

			if(a.getPositionX()==b.getPositionX() && b.getPositionY()-a.getPositionY()==1) return true;
			return false;
		}else {
			if(a.getPositionY()==7 && b.getPositionY()==5 && a.getPositionX()==b.getPositionX()) return true;	
			if(a.getPositionX()==b.getPositionX() && a.getPositionY()-b.getPositionY()==1) return true;
			return false;
		}
	}
	
	
}
