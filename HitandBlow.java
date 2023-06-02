import java.util.*;
public class HitAndBlow{
	public static void main(String[] args){
		final int NUM_COUNT=4;
		int[] nums={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<NUM_COUNT;i++){
			int index = new Random().nextInt(nums.length-i)+i;
			int temp = nums[index];
			nums[index]=nums[i];
			nums[i] = temp;
		}
		System.out.println(Arrays.toString(nums));
		int count =0,hit,blow;
		do{
			count++;
			hit=blow=0;
			System.out.printf("数字を%d桁で入力してください>",NUM_COUNT);
			int input = new Scanner(System.in).nextInt();
			int[] userAns = new int[NUM_COUNT];
			for(int i=userAns.length-1;i>=0;i--){
				userAns[i]=input % 10;
				input /= 10;
			}
			for(int i=0;i<NUM_COUNT;i++){
				if(userAns[i] == nums[i]){
					hit++;
				}else{
					for(int j=0;j<NUM_COUNT;j++){
						if(userAns[i] == nums[j]){
							blow++;
						}
					}
				}
			}
			System.out.printf("Hit:%d,Blow:%d%n",hit,blow);
		}while(hit != NUM_COUNT);
		System.out.printf("%d回でClear%n",count);
	}
}
