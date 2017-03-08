package bbs.sudoku;
public class Main{
	public static void main(String[] args){
		Sudoku s = new SudokuV3();
		Ecran e = new EcranV3();
		e.affiche(s);
		System.out.println(s.getClass());
		System.out.println(e.getClass());

	}
}