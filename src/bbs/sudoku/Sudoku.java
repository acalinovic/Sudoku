package bbs.sudoku;

public interface Sudoku {
	public void setValue(byte value, int line, int col);
	public byte getValue(int line, int col);
	public byte[][] getGrille();
	public byte getShow(int line, int col);
	public char[] getShow();
	public int getSize();


	public boolean isValid(Sudoku s);
}
