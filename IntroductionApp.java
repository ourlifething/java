import java.util.*;
public class IntroductionApp{
	public static void main(String[] args){
//		int n = new Random(1).nextInt(10); //seed値を設定 Random (1)<- 1がシード値
		String name = "葉山";
		int seed = calcseed(name);
		int[] maxArr = {100, 100, 50, 50, 50};
		int[] status = makeStatus(seed, maxArr);
		System.out.println(Arrays.toString(status));
		int[] h = {10, 10, 10, 10, 10};
		raceBonus(status, h);
		System.out.println(Arrays.toString(status));
		double[] s = {1.6, 1, 1.4, 1, 1};
		classBonus(status, s);
		System.out.println(Arrays.toString(status));
		int total = sumStatus(status);
		System.out.println("合計は" + total);
		String[] params = {"体力","魔力","パワー","きようさ","すばやさ"};
		showStatus(status, params);
	}
	static int calcseed(String name){
		//seed(種)
		int seed = 0;
		//名前の文字数分回るループ
		for (int i =0; i < name.length(); i++){
			//一文字ずつ取り出しながらseedに加算
			seed += name.charAt(i);
		}
		return seed;
	}
	static int[] makeStatus(int seed, int[] maxArr){
		int[] vals = new int[maxArr.length];
		Random rand = new Random(seed);
		for(int i = 0; i < vals.length; i++){
			vals[i] = rand.nextInt(maxArr[i])+1;
		}
		return vals;
	}
	static void raceBonus(int[] status, int[] bonus){
		for(int i=0; i<status.length; i++){
			status[i] += bonus[i];
		}
	}
	static void classBonus(int[] status, double[] ratio){
		for(int i = 0; i < status.length; i++){
			status[i] = (int)(status[i] * ratio[i]);
		}
	}
	static int sumStatus(int[] ststus){
		int sum = 0;
		for(int n : ststus){
			sum += n;
		}
		return sum;
	}
	static void showStatus(int[] status, String[] params){
		String str = "";
		for(int i=0; i < status.length; i++){
			str += params[i] + ":" + status[i] + " ";
		}
		System.out.println( "[" + str + "]" );
	}
}
