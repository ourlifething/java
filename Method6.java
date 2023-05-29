import java.util.*;
public class Method6{
	public static void main(String[] args){
		
		int ret = method(3);
		System.out.println(ret);
		ret = method(-5);
		System.out.println(ret);

		int max = method1(13,18,16);
		System.out.println(max);

		System.out.printf("%.2f%n",method2(15.0,12.0,25.5));
		System.out.println(method3("Hello","World"));
		System.out.println(method4(6));
		int[]arr = {2,3,4,5};
		method5(arr);
		
		System.out.println(Arrays.toString(method6(arr)));
	}
	//引数を１個受け取り符号を反転させる
	public static int method(int n){
		return -n;
	}
	public static int method1(int a, int b, int c){
	//３つの整数の一番大きな整数を返す
		if (a > b){
			int temp =b;
			b = a;
			a = temp;
    }
		if(b > c){
			int temp = c;
			c = b;
			b = temp;
		}
		return c;
	}
	public static double method2(double a, double b, double c){
	//3つの整数の平均を返す
		double ave = (a + b + c) /3;
		return ave;
	}
	public static String method3(String str1, String str2){
	//文字列を連結
		return str1 + str2;
	}
	public static boolean method4(int n){
		return n % 2 == 0;
	}
	public static void method5(int[]arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] *= 2;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int[] method6(int[]arr){
		int[]arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			arr2[i] = arr[i]*2;
		}
		return arr2;
	}
}
