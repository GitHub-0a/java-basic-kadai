package kadai_017; 

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {

	   //紹介を実行する
	   public void execIntroduce() {
		   commonIntroduce();
		   eachIntroduce();
	   }
	   
	   public void setGivenName() {
		   givenName = "一郎";
	   }
	   
	   //個別の紹介を出力する　抽象メソッド 
	   public void eachIntroduce() {
		   System.out.println("好きな食べ物はリンゴです");
		   System.out.println("");
	   }
	
}