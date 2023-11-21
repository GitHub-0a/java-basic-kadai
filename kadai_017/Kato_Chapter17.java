package kadai_017;

abstract public class Kato_Chapter17 {
	//姓フィールド
	public String familyName = "加藤";
	//名フィールド
	public String givenName;
	//住所フィールド
	public String address = "東京都中野区〇×";
	
	// 個別紹介出力　親クラス抽象メソッド
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce(String familyName, String address){
	}
	   
	//共通の紹介を出力する
	public void commonIntroduce(String familyName, String address){
	}
}
  