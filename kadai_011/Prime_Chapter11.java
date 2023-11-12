package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		boolean[] haiRetsu  = new boolean[101]; 
		int kensu = 0;  //割り切れる件数　初期値
		 
		for( int i = 0; i < 101; i++ ) {
			 haiRetsu[i] = true;  //boolean配列をtrueで初期化
		}
		 
		 for( int i = 2; i < 101; i++ ) {   //検査する値2～100
			 
			 for( int j = 2; j <= i; j++ ) {  //jをiまで確認
				 
				 if (i % j == 0) kensu++;     //iがjで割り切れるとき+1
				 if (kensu > 1) {             //割り切れる件数が複数時、素数でない
					 haiRetsu[i] = false;     //素数でなときfalse設定
					 break;                   //素数でなときforを抜ける
				 }
			 }
			 
			 //boolean配列iがtrueのままとき、素数
			 if (haiRetsu[i]) System.out.println(i);
			 kensu = 0;
			 
		 }
		 
	}

}
