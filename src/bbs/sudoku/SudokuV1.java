package bbs.sudoku;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Arrays;

public class SudokuV1 implements Sudoku{
	public int size = 9;
	private byte[][] grille = new byte[size][size];
	private byte[][] show = { 
			{1,1,1},
			{1,1,1},
			{1,1,1},
	};



	/* Constructors */
	public SudokuV1() {
		for(int line = 0 ; line < size ; line++){
			for(int col = 0 ; col < size ; col++){
				this.setValue((byte)ThreadLocalRandom.current().nextInt(1, (9 + 1)),line,col);
			}	
		}	
	}

	/* Getters & Setters */
	public byte getValue(int line, int col){
		return this.grille[line][col];
	}
	public byte[][] getGrille() {
		return grille;
	}
	public byte getShow(int line, int col) {
		return this.show[line][col];
	}
	public char[] getShow() {
		int i = 0, j = 0;
		int l = this.show.length;
		char[] result = new char[l];
		for(i = 0; i < l; i++ ){
			for(j = 0; j < l; j++ ){
				result[i+j] = (char) show[i][j];
			}
		}
		return result;
	}
	public int getSize(){
		return this.size;
	}

	public void setValue(byte value, int line, int col) {
		this.grille[line][col] = value;
	}

	/* Overrides of Object class methods */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grille);
		return result;
	}
	@Override
	public String toString() {
		return "Sudoku [grille=" + Arrays.toString(grille) + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SudokuV1 other = (SudokuV1) obj;
		if (!Arrays.equals(grille, other.grille)) {
			return false;
		}
		return true;
	}
	@Override
	public boolean isValid(Sudoku s) {
		// TODO Auto-generated method stub
		return false;
	}
}


