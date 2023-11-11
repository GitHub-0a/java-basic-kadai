package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = 30;
		byte d = 40;
		byte e = 50;
		byte f = 60;
		byte g = 70;
		byte h = 80;
		byte i = 90;
		byte j = 100;
		
		byte ninzu = 0; //人数
		
		System.out.println("Aさんの点数は" + a + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + b + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + c + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + d + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + e + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + f + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + g + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + h + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + i + "点"); ninzu += 1;
		System.out.println("Aさんの点数は" + j + "点"); ninzu += 1;
		
		//平均=合計/人数
		System.out.println("テストの平均点は" + ((a+b+c+d+e+f+g+h+i+j) / ninzu) + "点");
	}

}
