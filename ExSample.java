import java.util.*;
public class ExSample{
	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("何人＞＞");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(101);
		}
		System.out.println(Arrays.toString(arr));
	}
}
