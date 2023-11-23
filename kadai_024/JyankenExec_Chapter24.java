package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		//オブジェクトを作る
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		String aaa = jyanken.getMyChoice();
		
		String bbb = jyanken.getRandom();

		jyanken.playGame(aaa,bbb);

	}

}
