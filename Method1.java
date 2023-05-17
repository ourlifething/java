import java.util.*;
public class Method1{
	public static void main(String[] args){ //メインメソッド
		//methodの呼び出し
		input();
		aggregate();
		output();
	}
	//input method
	public static void input(){
		System.out.println("入力業務です");
	}
	//aggregate method
	public static void aggregate(){
		System.out.println("集計業務です");
	}
	//output method
	public static void output(){
		System.out.println("出力処理です");
	}
}
