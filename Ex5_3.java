public class Ex5_3{
	public static void main(String[] args){
		email("xxx@xxxx.xxx.com", "xxxxxxxxoxoxoxoxoxxxxx");
		email("title","xxx@xxxx.xxx.com", "xxxxxxxxoxoxoxoxoxxxxx");

	}
	public static void email(String address, String text){
		System.out.printf("%sに以下のメールを送信しました%n",address);
		System.out.printf("件名：無題");
		System.out.printf("本文：%s", text);

	}
	public static void email(String title, String address, String text){
		System.out.printf("%sに以下のメールを送りました%n", address);
		System.out.printf("件名：%s%n",title);
		System.out.printf("本文：%s %n",text);

	}
}
