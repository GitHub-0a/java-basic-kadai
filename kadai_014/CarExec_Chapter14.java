package kadai_014;

public class CarExec_Chapter14 {
    public static void main(String[] args) {
	
        // ギア、速度初期データを生成
    	Car_Chapter14 gear = new Car_Chapter14( 1, 10 );

        // gearChangeメソッド実行
        gear.gearChange(3);
        
        //runメソッド実行
        gear.run();
    }
}
