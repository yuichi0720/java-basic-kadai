package kadai_015;

public class Car_Chapter15 {
	
	// フィールド
	private int gear 	= 1; //１速〜５速のギアを表す
	private int speed 	= 10; // ギアチェンジ後の速度を表す

	//メソッド：ギアの値により速度変更
	public void gearChange (int afterGear) {
	switch(afterGear){
		case 1 :
			speed = 10;
			break;
		case 2 :
			speed = 20;
			break;
		case 3 :
			speed = 30;
			break;
		case 4 :
			speed = 40;
			break;
		case 5 :
			speed = 50;
			break;
		default :
			speed = 10;
			break;
	}
	System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
	gear = afterGear; //ギア更新
}
	
	//メソッド：ギアチェンジ後の速度表示
	public void run () {
		System.out.println("速度は時速" + speed + "kmです" );
	}
}
