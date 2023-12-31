package kadai_017;

abstract public class Kato_Chapter17 {
	//姓フィールド
	public String familyName = "加藤"; 
	//名フィールド
	public String givenName;
	//住所フィールド
	public String address = "東京都中野区〇×";
	
	//紹介を実行する
	public void execIntroduce() {
		   commonIntroduce(); //共通の紹介出力
		   eachIntroduce();   //個別の紹介出力
	}
	 
	//共通の紹介メソッド
	public void commonIntroduce(){
		   System.out.println("名前は加藤"+givenName+"です");
		   System.out.println("住所は"+address+"です");
	}
	//個別の紹介メソッド
	abstract public void eachIntroduce();
	

}
  