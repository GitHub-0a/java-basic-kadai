package kadai_017; 

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//オブジェクトを作る
		KatoTaro_Chapter17   katoTaro   = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 katoIchiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 katoHanako = new KatoHanako_Chapter17();
		
		katoTaro.setGivenName();
		katoTaro.execIntroduce();
		
		katoIchiro.setGivenName();
		katoIchiro.execIntroduce();
		
		katoHanako.setGivenName();
		katoHanako.execIntroduce();
		
	}

}
