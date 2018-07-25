package Ch02;

public class ch02_5 {

	public static void main(String[] args) {
		// 一斤牛肉120元 一斤雞蛋36元 一把青菜20元 請用程式計算購買一斤半的牛肉,兩斤雞蛋與三把青菜共需要多少錢

		int b = 120;
		int e = 36;
		int t = 20;
		
		int tot = b+(b/2) + (e*2) + t*3;
		
		System.out.println("共需要"+ tot + "元");
		
	}

}
