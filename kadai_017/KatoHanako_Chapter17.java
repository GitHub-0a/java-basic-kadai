package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {

	   //個別紹介を実行する
	   public void execIntroduce() {
		   setGivenName();
		   commonIntroduce();
		   eachIntroduce();
	   }
	   
	   public void setGivenName() {
		   givenName = "花子";
	   }
	   
	   //個別の紹介を出力する　抽象メソッド 
	   public void eachIntroduce() {
		   System.out.println("好趣味は読書です");
		   System.out.println("");
	   }
	   
	   public void commonIntroduce(){
		   System.out.println("名前は加藤"+givenName+"です");
		   System.out.println("住所は"+address+"です");
	   }
	   
}
