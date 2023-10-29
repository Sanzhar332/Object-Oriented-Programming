package problem3;


public class Queen extends Piece{
	public Queen() {}
	public Queen(char x, int y,String color) {
		super(new Position(x,y),color);
	}
	public boolean isLegalMove(Position a, Position b) {
		Bishop bishop = new Bishop();
		Rook rook = new Rook();
		if(bishop.isLegalMove(a, b) || rook.isLegalMove(a, b)) return true;
		return false;
	}

}
