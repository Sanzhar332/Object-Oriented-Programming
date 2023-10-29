package problem3;

public class TestChess {

	public static void main(String[] args) {
		Position b = new Position('a' , 3);  
		
		Pawn figurka = new Pawn ('a' , 2 ,"white");
		
		System.out.print(figurka.isLegalMove(figurka.getPosition(), b)) ;
		
	}

}