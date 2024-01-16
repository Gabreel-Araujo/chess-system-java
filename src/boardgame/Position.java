package boardgame;

public class Position {
	private int row;
	private int column;
	public Position(int row, int coloumn) {
		
		this.row = row;
		this.column = coloumn;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColoumn() {
		return column;
	}
	public void setColoumn(int coloumn) {
		this.column = coloumn;
	}
	
	@Override 
	public String toString() {
		return row + "," + column;
	}
}
