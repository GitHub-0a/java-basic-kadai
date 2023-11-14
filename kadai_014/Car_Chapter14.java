package kadai_014;

public class Car_Chapter14 {
	
    // フィールド（内部データ）
    private int    gear  = 0;  //ギア
    private int    speed = 0;  //速度

    // コンストラクタ（初期化処理）
    public Car_Chapter14( int gear, int speed ) {
        this.gear  = gear;
        this.speed = speed;
    }

    // 【メソッド】ギアの値により速度を変える
    // 引数 afterGear：ギア変更値
    public void gearChange( final int afterGear ) {
        //System.out.println("変更ギア="+ afterGear );
        
        //ギア変更
        this.gear = afterGear;
        //速度変更
        switch (this.gear) {
     		case 1: this.speed = 10;break;
     		case 2: this.speed = 20;break;
     		case 3: this.speed = 30;break;
     		case 4: this.speed = 40;break;
     		case 5: this.speed = 50;break;
     		default: this.speed = 10;
        }
        
    }
     
    // 【メソッド】ギアチェンジ後の速度を表示する
    // 引数 なし
    public void run() {
    	
    	System.out.println( "変更後の速度は"+this.speed+"kmです" );

	}
    
}
