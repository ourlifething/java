import java.util.*;
public class ScTest{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		//↑ これを使用するとき、、nextInt()の次にnextLineをする際は１度nextLine()を空読みさせる
		System.out.print("年齢＞＞");
		int age = sc.nextInt();sc.nextLine();
		System.out.print("名前＞＞");
		String name = sc.nextLine();
		System.out.printf("ようこそ%s(%d)!%n",age,name);
	}
}
