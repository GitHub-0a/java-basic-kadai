package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {

	   public void commonIntroduce(String familyName, String address){
		   System.out.println("住所は"+address+"です");
	   }
	   
	   public void setGivenName(String givenName) {
		   givenName = "一郎";
		   System.out.println("名前は"+familyName+givenName+"です");
	   }
	   
	   //個別紹介を出力を実行
	   public void execIntroduce() {
		   eachIntroduce();
	   }
	   
	   //個別紹介出力　抽象メソッド 
	   public void eachIntroduce() {
		   System.out.println("好きな食べ物はリンゴです");
		   System.out.println("");
	   }

}
