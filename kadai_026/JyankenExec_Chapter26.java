package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 play = new Jyanken_Chapter26();
		
		
		
		String myChoice = play.getMyChoice();
	
		String random = play.getRandom();
		
		play.playGame(myChoice, random);
		
	}

}
