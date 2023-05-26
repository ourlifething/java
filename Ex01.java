import java.util.*;
public class Ex01{
	public static void main(String[] args){
		int[] arr = {5,6,2,5,6,2,5,6,2,5,6,2,5,6,2,2,4,5,6,8};
		int[]number = new int[evenArr(arr).length];

		System.out.print(number.length);
		int count=0;
		for(int i=0; i< arr.length; i++){
			if(arr[i] %2 ==0){
				number[count] = arr[i];
				count++;
			}
		}
		System.out.print(Arrays.toString(number));
		
	}
	static int[] evenArr(int[]arr){
		int sum = 0;
		for(int i =0; i<arr.length; i++){
			if(arr[i] %2 ==0){
				sum++;
			}
		}
		int[]num = new int[sum];
		return num;
	}
}
