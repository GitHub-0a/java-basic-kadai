package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	public String  getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);  //Scannerクラスのオブジェクトを生成する
		String input= scanner.next();	//入力を取得する
		scanner.close();
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			return input;
		}
		else {
			System.out.println("入力が r または s または p ではありません");
			return "x";
		}	

		
	}
	
	public String  getRandom() {
		double you = Math.floor(Math.random() * 3);
		//System.out.println(youb);
		 if (you == 0.0)     {return "r";}
		 else if (you == 1.0){return "s";}
		 else                {return "p";}
	}
	
	public void  playGame(String me,String you) {

		HashMap<String,String> jMap = new HashMap<String,String>();
		jMap.put("r","グー");
		jMap.put("s","チョキ");
		jMap.put("p","パー");
		
		String getmap_me = jMap.get(me);
		String getmap_you = jMap.get(you);
		System.out.println("自分の手は"+getmap_me+"、対戦相手の手は"+getmap_you);
		
		if (getmap_me.equals(getmap_you)) {
			System.out.println("あいこです");
		}
		else if ((getmap_me.equals("グー") && getmap_you.equals("チョキ")) ||
			(getmap_me.equals("チョキ") && getmap_you.equals("パー")) ||
			(getmap_me.equals("パー") && getmap_you.equals("グー"))) {
			System.out.println("自分の勝ちです");
		}
		else {
			System.out.println("自分の負けです");
		}
	}
	
}
