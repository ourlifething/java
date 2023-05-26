import java.util.*;
public class IntroductionApp{
	public static void main(String[] args){
		String[] params={"体力","魔力","パワー","きようさ","すばやさ"};
		String[] races={"人間","ハイエルフ","トロル","ノーム"};
		String[] classes={"戦士","盗賊","僧侶","魔術師"};
		int[][] raceMatrix={
			{10,10,10,10,10},
			{0,20,0,10,20},
			{30,0,20,0,0},
			{10,0,0,25,20},
		};
		double[][] classMatrix={
			{1.6,1,1.4,1,1},
			{1.1,1,1.2,1.3,1.3},
			{1.3,1.5,1.1,1,1},
			{1,1.9,1,1,1.1},
		};
		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力してください＞");
		String name = sc.nextLine();
		int seed = calcseed(name);
		int[] status = makeStatus(seed, new int[] {100,100,50,50,50});
		System.out.println("初期ステータスが決定しました");
		showStatus(status,params);
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
