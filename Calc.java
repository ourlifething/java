package calcapp.main;  //calcapp.main.Calc
//import calcapp.logics.CalcLogics; //FQCNでなくてもエラーにならない
import calcapp.logics.*; //クラス名の直前まで書く必要がある
public class Calc{
	public static void main(String[] args){
		int a = 10; int b = 2;
		// int a = 10, b = 2 の書き方もok
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
