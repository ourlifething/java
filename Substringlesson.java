public class Substringlesson{
	public static void main(String[] args){
		String msg = "Java lessons";
		//str.substring(以上、未満）;
		String str1 = msg.substring(0, 3);
		System.out.println(str1);
		String str2 = msg.substring(2, 6);
		System.out.println(str2);
		String str3 = msg.substring(0, 1);
		System.out.println(str3);
		String str4 = msg.substring(5, msg.length()-1);
		System.out.println(str4);
		String str5 = msg.substring(0, msg.length()-1);
		System.out.println(str5);
		String str6 = msg.substring(msg.length()-1, msg.length()-0);
		System.out.println(str6);

	}
}
