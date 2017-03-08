package bbs.sudoku;

public class EcranV3 implements Ecran{
	private String lf = System.getProperty("line.separator");
	private String titre = 
			"    ╔═══════════════╗"+lf+
			"    ╠╡ S═U═D═O═K═U ╞╣"+lf+
			"    ╚═══════════════╝"+lf;

	public void affiche(Sudoku s){
		System.out.println(s.getShow());
		char[] show = s.getShow();
		String lf = System.getProperty("line.separator");
		char topL = '╭'; 
		char topR  = '╮'; 
		char botR  = '╯'; 
		char botL = '╰'; 
		char topCross = '┬'; 
		char botCross = '┴'; 
		char rightCross = '┤';
		char leftCross = '├'; 
		char Cross = '┼';
		char horLine = '─';
		char vertLine = '│';

		StringBuilder screen = new StringBuilder(titre);
		StringBuilder line = new StringBuilder();
		/*	line or col % 3        : show [][]
		 * 	line or col / 3 == 2   : last of show(1)
		 * 
		 */
		int l = 0, c = 0;
		int modL = 0, divL = 0;
		int modC = 0, divC = 0;
		for ( l = 0; l < 21; l++) {
			modL = l % 3;
			divL = l / 3;
			for ( c = 0; c < 21; c++) {
				modC = c % 3;
				divC = c / 3;
				//First line of block
				if (isFirstLineOfBlock(l)){
					//First cell of block
					if( modC == 0 ) {
						if (show[l+c] == 1){
							line.append(topL);
							line.append(horLine);
							line.append(horLine);
						}else{
							line.append("   ");
						}
					}
					//Last cell of block
					if((c % 3) == 2) {
						if (s.getShow((l / 3),(c / 3)) == 1 & s.getShow((l / 3),(c+1 / 3)) == 1 & c < 21){
							line.append(horLine);
							line.append(horLine);
							line.append(topCross);
						}else{
							line.append("  ");
						}
					}
					//Cell of block
					if((c % 3) == 1) {
						if (s.getShow((l / 3),(c / 3)) == 1){
							line.append(horLine);
							line.append(horLine);
							line.append(horLine);
						}else{
							line.append("   ");
						}
					}
				}
				//Last line of block
				if ((l % 3) == 2 ){
					//First cell of block
					if((c % 3) == 0) {
						if (s.getShow((l / 3),(c / 3)) == 1){
							line.append(botL);
							line.append(horLine);
							line.append(horLine);
						}else{
							line.append("   ");
						}
					}
					//Last cell of block
					if((c % 3) == 2) {
						if (s.getShow((l / 3),(c / 3)) == 1){
							line.append(horLine);
							line.append(horLine);
							line.append(botR);
						}else{
							line.append("   ");
						}
					}
					//Cell of block
					if((c % 3) == 1) {
						if (s.getShow((l / 3),(c / 3)) == 1){
							line.append(horLine);
							line.append(horLine);
							line.append(horLine);
						}else{
							line.append("   ");
						}
					}
				}
			}
			line.append(lf);
		}
		screen.append(line.toString());

		System.out.println(screen.toString());

	}
	private boolean isFirstLine(int line){
		return (line == 0 );
	}
	private boolean isLastLine(int line){
		return (line == 21 );
	}
	private boolean isFirstLineOfBlock(int line){
		return ((line % 3) == 0 );
	}
	private boolean isLastLineOfBlock(int line){
		return ((line % 3) == 2 );
	}
	private boolean isLineOfBlock(int line){
		return ((line % 3) == 1 );
	}
	private boolean isFirstCell(int col){
		return (col == 0);
	}
	private boolean isLastCell(int col){
		return (col == 21);
	}
	private boolean isFirstCellOfBlock(int col){
		return ((col % 3) == 0);
	}
	private boolean isLastCellOfBlock(int col){
		return ((col % 3) == 2);
	}
	private boolean isCellOfBlock(int col){
		return ((col % 3) == 1);
	}
	private boolean nextCellisShowable(Sudoku s,int line, int col){
		char[] tmp = s.getShow();
		return (tmp[line+col+1] == 1 );
	}

	
}
