import java.util.*;

public class ExMethod3{
	public static void main(String[] args){
		System.out.print("top>>");
		int top = new Scanner(System.in).nextInt();
		System.out.print("bottom>>");
		int bottom = new Scanner(System.in).nextInt();
		System.out.print("height>>");
		int height = new Scanner(System.in).nextInt();
		calcArea(top,bottom,height);
	}

	public static void calcArea(int top, int bottom, int height){
		System.out.printf("topが:%d,bottomが:%d,heightが:%dの台形の面積は%dです。%n",top,bottom,height,(top+bottom)*height/2);
	}
}
