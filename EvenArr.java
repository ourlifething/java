import java.util.*;
public class EvenArr{
	public static void main(String[] args){
		int[] arr = {2,3,3,4};
		int[] retArr = evenArr(arr);
		System.out.println(Arrays.toString(retArr));

	}
	static int[] evenArr(int[] arr){
		//元の配列の偶数の数を数える
		int count=0;
		for(int n: arr){
			//もし2で割り切れたら
			if(n % 2 == 0){
				count++;
			}
		}
		//偶数の数でint型配列を作成
		int[] retArr = new int[count];
		//返却する配列のindex用変数
		int idx=0;
		//元の配列を回す
		for(int n : arr){
			//もし偶数だったら
			if(n % 2 == 0){
				//その値を配列に格納
				retArr[idx]=n;
				//indexを1増やす
				idx++;
			}
		}
		return retArr;
	}
}
