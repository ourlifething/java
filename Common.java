package my.util;
import java.util.*;
public class Common{
	public static int randRange(int min, int max){
		//ランダムな整数を返す（最小値,最大値）
		return new Random().nextInt(max - min +1) + min;
	}

	public static void arrShuffle(int[] arr){
		//配列をシャッフルする(int)
		Random rand = new Random();
		for(int i = 0; i < arr.length -1; i++){
			int idx = rand.nextInt(arr.length -i) +i;
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void arrShuffle(String[] arr){
		//配列をシャッフルする(String)
		Random rand = new Random();
		for(int i = 0; i < arr.length -1; i++){
			int idx = rand.nextInt(arr.length -i) +i;
			String temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void arrReverse(int[] arr){
		for(int i = 0; i < arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1 -i] = temp;
		}
	}

	public static int intInput(String msg){
		System.out.print(msg);
		return new Scanner(System.in).nextInt();
	}

}
