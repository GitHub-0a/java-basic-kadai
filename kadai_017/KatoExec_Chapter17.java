package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//オブジェクトを作る
		KatoTaro_Chapter17 katoTaro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 katoIchiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 katoHanako = new KatoHanako_Chapter17();
				
		//共通紹介を出力する	名前と住所
		katoTaro.setGivenName(katoTaro.givenName);
		katoTaro.commonIntroduce(katoTaro.familyName, katoTaro.address);
		//個別紹介を出力する
		katoTaro.execIntroduce();
		
		//共通紹介を出力する	名前と住所
		katoIchiro.setGivenName(katoIchiro.givenName);
		katoIchiro.commonIntroduce(katoIchiro.familyName, katoIchiro.address);
		//個別紹介を出力する
		katoIchiro.execIntroduce();
		
		//共通紹介を出力する	名前と住所
		katoHanako.setGivenName(katoHanako.givenName);
		katoHanako.commonIntroduce(katoHanako.familyName, katoHanako.address);
		//個別紹介を出力する
		katoHanako.execIntroduce();
		
	}

}
