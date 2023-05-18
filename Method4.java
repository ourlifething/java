import java.util.*;

public class Method4{
	public static void main(String[] args){

		int n = sumOf(3, 5);
		System.out.println(n); //8
		
		double area = squareArea(3.4, 2.0);
		System.out.println(area); //6.8

		boolean b = isEven(10);
		System.out.println(b); //true
		
		char c = firstLetter("java");
		System.out.println(c); //j
		 
    String result = timesWord("Hello", 3);
		System.out.println(result); //j
		
	}

	/*
	メソッドは戻り値を設定する事ができる

	sumOfメソッド
	引数で２つの整数を受け取りその合計を返す
	引数：int a, int b
	戻り値 sum(int) 2つの引数の和
	*/

	public static int sumOf(int a, int b){ //int sumOfのintは戻り値の型
		//return a + b;でもよし
		int sum = a + b;
		return sum;
	}

	/*
	squareAreaメソッド
	幅と高さを受け取り、四角形の面積を返す
	引数 width(double) height(double)
	戻り値 面積(double)
	*/

	public static double squareArea(double width, double height){
		return width * height;
	}
	/*
	isEvenメソッド
	引数で受け取った整数が偶数かどうかをbooleで返す
	引数 int x
	戻り値: 偶数なら true 奇数ならfalse
	*/
	public static boolean isEven(int x){
		return x % 2 == 0;
	}
	/*
	firstLetterメソッド
	単語を受け取り一文字めを返す
	引数 String word
	戻り値：最初の一文字*/
	public static char firstLetter(String word){
		return word.charAt(0);
	}
	/*
	timesWordメソッド
	引数で単語と回数を受け取り、回数分単語を繰り返した文字列を返す
	引数：word (String) times(int)回数
	戻り値：回数分単語を繰り返した文字列を返す*/
	public static String timesWord(String word, int times){
		String str ="";
		for (int i=0; i< times; i++){
			str += word;
		}
		return str;
	}
}

