package bbs.sudoku;

public class EcranV1 implements Ecran{
	private String lf = System.getProperty("line.separator");
	private String titre = 
	" ╔═══════════════╗"+lf+
	" ╠╡ S═U═D═O═K═U ╞╣"+lf+
	" ╚═══════════════╝"+lf;

	public void affiche(Sudoku s){
		String lf = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder(titre);
		sb.append("╭─────┬─────┬─────╮"+lf);
		for (int line = 0 ; line <= 8 ; line++){
			sb.append("│");
			for (int col = 0 ; col <= 8 ; col++) {
				if((col+1) % 3 == 0 ){
					sb.append(s.getValue(line,col)+"│");
				} else {
					sb.append(s.getValue(line,col)+" ");
				}
			}
			sb.append(lf);
			if ((line+1) % 3 == 0 & line != 8){
				sb.append("├─────┼─────┼─────┤"+lf);
			}
		}
		sb.append("╰─────┴─────┴─────╯"+lf);
		System.out.println(sb.toString());;
	}
}
