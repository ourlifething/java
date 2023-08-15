import java.util.*;

//  reverse,sort,shuffle,Linearsearch

public class Algo{
	public static void main(String[] args){
		
		int[] arr = {3, 5, 1, 4, 8};


		//reverse(逆順する）
		for(int i = 0; i < arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1 -i] = temp;
		}
		System.out.println(Arrays.toString(arr));


		//sort(昇順に並びかえ）
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));


		//shuffle(シャッフル）袋の中から番号のついたボールをランダムに取り出すなど
		for(int i = 0; i < arr.length -1; i++){
			int index = new java.util.Random().nextInt(arr.length -i) +i;
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));


		//Linearsearch(線型サーチ） int iがブロックの外で宣言されている所に注意
		int i = 0;
		for(;i < arr.length; i++){
			if(arr[i] == 7){
				break;
			}
		}
		if(i == arr.length){
			System.out.println("含まれていない");
		}else{
			System.out.prinln("含まれている");
		}

	}
}
