package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int userAge = 30;      //年代
		int serviceCost = 0;   //料金
		
        // 年代に応じた料金を取得
		serviceCost = switch(userAge) {
            case 10  -> 1000;
            case 20  -> 2000;
            case 30  -> 3000;
            case 40  -> 3000;
            case 50  -> 4000;
            case 60  -> 4000;
            case 70  -> 4000;
            case 80  -> 5000;
            default -> 500;
        };

        // 年代と料金を表示
        System.out.println("年代="+userAge);
        System.out.println("料金="+serviceCost);
	}

}
