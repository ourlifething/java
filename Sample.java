import java.util.*;
public class Sample{
	public static void main(String[] args){
		Random rand = new Random();
		int[] nums = new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i] = rand.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(nums));
		Scanner sc = new Scanner(System.in);
		System.out.print("数値>>");
		int x = sc.nextInt();
		System.out.println(x);
	}
	
}
