package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		//オブジェクトを作る
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		String me = jyanken.getMyChoice();
		
		if (me != "x") {
			String you = jyanken.getRandom();
			jyanken.playGame(me,you);
		}
	}

}
