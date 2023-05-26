
public class Code5_3{
	public static void methodA(){
		System.out.println("MethodA");
		methodB();
	}
	public static void methodB(){
		System.out.println("methoB");

	}
	public static void main(String[] args){
		methodA(); 
	}
}
