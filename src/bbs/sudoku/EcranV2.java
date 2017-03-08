package bbs.sudoku;

public class EcranV2 implements Ecran{
	private String lf = System.getProperty("line.separator");
	private String titre = 
	"    ╔═══════════════╗"+lf+
	"    ╠╡ S═U═D═O═K═U ╞╣"+lf+
	"    ╚═══════════════╝"+lf;

	public void affiche(Sudoku s){
		String lf = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder(titre);
		sb.append("╭─────┬─────┬─────┬─────╮"+lf);
		for (int i = 0 ; i <= 11 ; i++){
			sb.append("│");
			for (int j = 0 ; j <= 11 ; j++) {
				if((j+1) % 3 == 0 ){
					sb.append(s.getValue(i,j)+"│");
				} else {
					sb.append(s.getValue(i,j)+" ");
				}
			}
			sb.append(lf);
			if ((i+1) % 3 == 0 & i != 11){
				sb.append("├─────┼─────┼─────┼─────┤"+lf);
			}
		}
		sb.append("╰─────┴─────┴─────┴─────╯"+lf);
		System.out.println(sb.toString());;
	}
}
