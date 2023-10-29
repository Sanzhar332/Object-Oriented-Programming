package problem3;

public class Position {
	private int x;
	private int y;
	public Position() {}
	public Position(char x, int y) {
		this.x=(int)x-96;
		this.y=y;
	}
	public void setPosition(char x, int y) {
		this.x=(int)x-96;
		this.y=y;
	}
	public void setPositionX(int x) {
		this.x=x;
	}
	public void setPositionY(int y) {
		this.y=y;
	}
	public int getPositionX() {
		return this.x;
	}
	public int getPositionY() {
		return this.y;
	}
}
