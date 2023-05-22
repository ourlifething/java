import java.util.*;
public class ExMethod4{
	public static void main(String[] args){
		System.out.print("税抜き価格＞");
		int price = new Scanner(System.in).nextInt();
		System.out.print("税率＞");
		int tax = new Scanner(System.in).nextInt();


		int result = calcTax(price, tax);
		System.out.println("税込の価格は"+result);
		
	}
	/*
	calcTax メソッド
	税抜き価格と消費税率から税込価格を求める
	引数 print(int) taxRatio(int)税率
	戻り値：税込価格
	*/
	public static int calcTax(int price, int taxRatio){
		return (int)(price * (1 + taxRatio / 100.0));
	}
}
