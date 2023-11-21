package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
	   //紹介を実行する
	   public void execIntroduce() {
		   setGivenName();
		   commonIntroduce();
		   eachIntroduce();
	   }
	   
	   public void setGivenName() {
		   givenName = "太郎";
	   }
	   
	   //個別の紹介を出力する　抽象メソッド 
	   public void eachIntroduce() {
		   System.out.println("私はJavaが得意です");
		   System.out.println("");
	   }
	   
}